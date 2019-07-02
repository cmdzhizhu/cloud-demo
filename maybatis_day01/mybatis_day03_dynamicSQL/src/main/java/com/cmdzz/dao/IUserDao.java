package com.cmdzz.dao;

/**
 * @author cmdzz
 * @date 2019/6/26 - 12:07
 */

import com.cmdzz.domain.QueryVo;
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

    /**
     * 根据名称模糊查询用户信息
     * @param username
     * @return
     */
    List<User> findByName(String username);



    /**
     * 根据queryVo中的条件查询用户
     * @param vo
     * @return
     */
    List<User> findUserByVo(QueryVo vo);

    /**
     * 根据传入参数条件
     * @param user  查询的条件：可能有用户名，可能有性别，可能有地址，还有可能都有
     * @return
     */
    List<User> findUserByConditon(User user);

    /**
     * 根据queryvo中提供的id集合，查询用户信息
    * @param vo
     * @return
     */
    List<User> findUserInIds(QueryVo vo);
}
