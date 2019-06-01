package cn.cmdzz;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cmdzz
 * @date 2019/5/28 - 22:19
 */
/*@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication*/

@SpringCloudApplication
@EnableFeignClients
public class ConsumerDemoApplication {

    /*@Bean
    public RestTemplate restTemplate() {
        // 这次我们使用了OkHttp客户端,只需要注入工厂即可
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDemoApplication.class, args);
    }
}