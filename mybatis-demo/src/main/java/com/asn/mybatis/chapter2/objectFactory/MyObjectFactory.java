package com.asn.mybatis.chapter2.objectFactory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Properties;

/**
 * Created by xuwentang on 2017/9/6.
 */
public class MyObjectFactory extends DefaultObjectFactory {

    private static final Logger LOG = LoggerFactory.getLogger(MyObjectFactory.class);

    @Override
    public void setProperties(Properties properties) {
        LOG.info("---- custom properties: " + properties);
        super.setProperties(properties);
    }

    @Override
    public <T> T create(Class<T> type) {
        LOG.info("---- construct object by using MyObjectFactory");
        return super.create(type);
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> list, List<Object> list1) {
        LOG.info("---- construct object list by using MyObjectFactory");
        return super.create(type, list, list1);
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return super.isCollection(type);
    }


}
