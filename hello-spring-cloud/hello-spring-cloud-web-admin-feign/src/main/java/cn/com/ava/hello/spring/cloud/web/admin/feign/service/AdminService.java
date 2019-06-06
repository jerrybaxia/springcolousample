package cn.com.ava.hello.spring.cloud.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import  cn.com.ava.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;

@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {

    /**
     * 注意这里一定要写 @RequestParam("message") 不然会报:Request method 'POST' not supported
     * 他会把message当作post给到service层
     * @param message
     * @return
     */
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam("message") String message);
}
