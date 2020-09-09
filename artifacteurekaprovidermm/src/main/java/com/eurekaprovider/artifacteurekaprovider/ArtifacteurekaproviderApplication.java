package com.eurekaprovider.artifacteurekaprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController

public class ArtifacteurekaproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtifacteurekaproviderApplication.class, args);
    }
    @Value("${some.words}")
    String words;
    @RequestMapping("/welcome")
    public  String home(@RequestParam String name){
        return name+"欢迎您，这里有一句话想对您说："+words;
    }

}
