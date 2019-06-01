package cn.cmdzz.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cmdzz
 * @date 2019/5/28 - 23:00
 */
@RequestMapping("/test")
@RestController
public class TestController {
    @GetMapping("/hello")
    public String test(){
        return "hello";
    }
}
