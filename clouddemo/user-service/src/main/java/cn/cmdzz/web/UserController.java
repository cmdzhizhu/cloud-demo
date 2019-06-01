package cn.cmdzz.web;

import cn.cmdzz.pojo.User;
import cn.cmdzz.service.Uservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cmdzz
 * @date 2019/5/28 - 21:33
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private Uservice userService;

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id")long id){

       return userService.findUserById(id);
    }

}
