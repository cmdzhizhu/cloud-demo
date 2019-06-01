package cn.cmdzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author cmdzz
 * @date 2019/5/28 - 18:05
 */
//注册为Eureka客户端
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.cmdzz.mapper")
public class UserApplication {
    public static void main(String[] args){
        SpringApplication.run(UserApplication.class);
    }
}
