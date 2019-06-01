package cn.cmdzz.service;

import cn.cmdzz.mapper.UserMapper;
import cn.cmdzz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cmdzz
 * @date 2019/5/28 - 21:31
 */
@Service
public class Uservice {
    @Autowired
    UserMapper userMapper;
    public User findUserById(long id){

        return userMapper.selectByPrimaryKey(id);
    }
}
