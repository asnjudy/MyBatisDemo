package com.asn.mybatis.chapter2.mapper;

import com.asn.mybatis.chapter2.po.User;

/**
 * Created by xuwentang on 2017/9/6.
 */
public interface UserMapper {

    User getUser(Long id);

    int insertUser(User user);

    int countInUserName(String sss);
}
