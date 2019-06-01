package cn.cmdzz.web;

import cn.cmdzz.client.UserClient;
import cn.cmdzz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author cmdzz
 * @date 2019/5/28 - 22:29
 */
@RestController
@RequestMapping("consumer")
//@DefaultProperties(defaultFallback="defaultFallback")
public class ConsumerController {


  /*  @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;
*/
    @Autowired
    private UserClient userClient;

    @GetMapping("{id}")
    public User consume(@PathVariable("id") Long id) {
       /* System.out.println("我来了————————");
        //根据服务id获取实例
        List<ServiceInstance> instances = discoveryClient.getInstances("user-server");
        //从实例中取出ip和端口
        ServiceInstance instance = instances.get(0);
        instance.getHost();
        //String url = "http://localhost:8081/user/"+id;
        String url = "http://"+instance.getHost()+":"+instance.getPort()+"/user/"+id;
        User user = restTemplate.getForObject(url,User.class);
        return user;*/
       return userClient.queryById(id);
    }
}