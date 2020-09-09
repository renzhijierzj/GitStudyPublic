package com.xiongyan.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName :   com.xiongyan.ribbon.service.WelcomeService
 * @Description: TODO
 * @Author: RenZhijie
 * @CreateDate: 2020/9/2 16:09
 */
@Service
public class WelcomeService {
    @Autowired
    RestTemplate restTemplate;
    public String welcomeService(String name){
        return restTemplate.getForObject("http://artifacteurekaprovider/welcome?name="+name,String.class);
    }

}
