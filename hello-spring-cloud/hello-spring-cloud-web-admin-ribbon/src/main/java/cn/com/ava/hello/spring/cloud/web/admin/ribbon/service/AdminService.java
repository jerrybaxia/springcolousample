package cn.com.ava.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")//这里指明出错时如何处理
    public String sayHi(String message) {
        //去Eureka调用指定的服务返回数据
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message=" + message, String.class);
    }

    //返回一个熔断错误
    public String hiError(String message) {
        return "Hi, you message is :" + message + " but request error.";
    }
}
