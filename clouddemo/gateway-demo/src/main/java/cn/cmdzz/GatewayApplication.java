package cn.cmdzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author cmdzz
 * @date 2019/6/1 - 19:00
 */

/**
 * 路由
 */
@SpringBootApplication
@EnableZuulProxy
public class GatewayApplication {
    public static void main(String[] args){
        SpringApplication.run(GatewayApplication.class);
    }

}
