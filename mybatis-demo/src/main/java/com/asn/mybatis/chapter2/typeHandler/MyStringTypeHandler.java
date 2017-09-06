package com.asn.mybatis.chapter2.typeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by xuwentang on 2017/9/6.
 */
public class MyStringTypeHandler extends BaseTypeHandler<String> {

    private static final Logger LOG = LoggerFactory.getLogger(MyStringTypeHandler.class);

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        LOG.info("---- use MyStringTypeHandler");
        LOG.info("---- i=" + i + ", parameter=" + parameter);
        ps.setString(i, parameter);
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        LOG.info("---- use MyStringTypeHandler, CallableStatement");
        LOG.info("---- columnIndex=" + columnIndex);
        return cs.getString(columnIndex);
    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        LOG.info("---- use MyStringTypeHandler, ResultSet, columnName");
        LOG.info("---- columnName=" + columnName);
        return rs.getString(columnName);
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        LOG.info("----use MyStringTypeHandler, ResultSet, columnIndex");
        LOG.info("---- columnIndex=" + columnIndex);
        return rs.getString(columnIndex);
    }


}
