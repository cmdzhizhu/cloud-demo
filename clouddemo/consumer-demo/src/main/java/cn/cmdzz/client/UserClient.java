package cn.cmdzz.client;

import cn.cmdzz.pojo.User;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author cmdzz
 * @date 2019/5/31 - 15:31
 */
@FeignClient("user-server")
public interface UserClient {

    @GetMapping("user/{id}")
    User queryById(@PathVariable("id")long id);

}
