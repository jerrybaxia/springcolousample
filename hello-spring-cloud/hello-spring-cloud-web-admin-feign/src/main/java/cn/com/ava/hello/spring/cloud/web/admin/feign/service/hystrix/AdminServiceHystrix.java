package cn.com.ava.hello.spring.cloud.web.admin.feign.service.hystrix;


import cn.com.ava.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "hi, your message is :" + message + " but request error in fegin";
    }
}
