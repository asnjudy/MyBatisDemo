package com.asn.mybatis.chapter2.mapper;

import com.asn.mybatis.chapter2.param.RoleParam;
import com.asn.mybatis.chapter2.po.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by asnju on 2017/9/5.
 */
public interface RoleMapper {

    public Role getRole(Long id);

    public Role[] findRole(String roleName);

    public int deleteRole(Long id);

    int insertRole(Role role);

    List<Role> findRoleByMap(Map<String, String> params);

    List<Role> findRoleByAnnotation(@Param("roleName") String roleName, @Param("note") String note);

    List<Role> findRoleByParams(RoleParam params);
}
