package cn.com.ava.hello.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 声明为EnableDiscoveryClient  Ribbon有什么用?如果是一个入口的话,那也有负载的问题(当然这里只是一个入口,但是他有单点问题,当然部两个也可以)
 *
 * EnableHystrix 为开启熔断功能
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class WebAdminRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class, args);
    }
}
