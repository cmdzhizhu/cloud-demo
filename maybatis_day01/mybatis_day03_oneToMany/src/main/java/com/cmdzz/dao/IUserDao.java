package com.cmdzz.dao;

/**
 * @author cmdzz
 * @date 2019/6/26 - 12:07
 */

import com.cmdzz.domain.User;

import java.util.List;

/**
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
   /*注解的方式 @Select("select * from user")*/
    List<User> findAll();



    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    User findById(Integer userId);


}
