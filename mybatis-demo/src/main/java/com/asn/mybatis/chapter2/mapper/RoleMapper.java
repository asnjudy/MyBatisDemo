package com.asn.mybatis.chapter2.mapper;

import com.asn.mybatis.chapter2.po.Role;

/**
 * Created by asnju on 2017/9/5.
 */
public interface RoleMapper {

    Role getRole(Long id);

    int deleteRole(Long id);

    int insertRole(Role role);
}
