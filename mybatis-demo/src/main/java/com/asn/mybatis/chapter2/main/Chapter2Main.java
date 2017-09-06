package com.asn.mybatis.chapter2.main;

import com.asn.mybatis.chapter2.mapper.RoleMapper;
import com.asn.mybatis.chapter2.mapper.UserMapper;
import com.asn.mybatis.chapter2.param.RoleParam;
import com.asn.mybatis.chapter2.po.Role;
import com.asn.mybatis.chapter2.po.User;
import com.asn.mybatis.chapter2.typeHandler.Sex;
import com.asn.mybatis.chapter2.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by asnju on 2017/9/5.
 */
public class Chapter2Main {


    public static void testGetUser() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();

        try {
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
//            Role role = new Role();
//            role.setRoleName("testName");
//            role.setNote("testNote");

            Role[] r = roleMapper.findRole("test");
            sqlSession.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    public static void testCreateUser() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();

        try {

            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            User user = new User();
            user.setUserName("lisi");
            user.setCnname("李四");
            user.setMobile("10218821222");
            user.setSex(Sex.FEMALE);
            user.setEmail("222222@aa.com");
            user.setNote("test insert user");
            user.setBirthday(new Date());

            userMapper.insertUser(user);

            sqlSession.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }


    public static void testCountInUserName() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();

        try {

            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            System.out.println("the count of username contains zh is " + userMapper.countInUserName("zh"));;

            sqlSession.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }


    public static void testTransaction() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();


        try {
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("testTransaction22");
            role.setNote("testTransaction22");

            roleMapper.insertRole(role);
            sqlSession.commit(); // 提交事务


        } catch (Exception ex) {
            ex.printStackTrace();
            sqlSession.rollback(); // 出现异常回滚事务
        } finally {
            sqlSession.close();
        }
    }


    public static void testFindRoleByMap() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();

            Map<String, String> params = new HashMap<>();
            params.put("roleName", "test");
            params.put("note", "test");
            roleMapper.findRoleByMap(params);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    public static void testFindRoleByAnnotation() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();

            roleMapper.findRoleByAnnotation("test", "test");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    public static void testFindRoleByParams() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();

            roleMapper.findRoleByParams(new RoleParam("test", "test"));
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    public static void main(String[] args)  {

        testFindRoleByParams();

    }
}
