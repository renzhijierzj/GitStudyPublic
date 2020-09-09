package com.xiongyan.ribbon.controller;

import com.xiongyan.ribbon.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName :   com.xiongyan.domain.WelcomeController
 * @Description: TODO
 * @Author: RenZhijie
 * @CreateDate: 2020/9/2 16:15
 */
@RestController
public class WelcomeController {
    @Autowired
    WelcomeService welcomeService;
    @RequestMapping(value = "/welcome")
    public String welcome(@RequestParam String name) {
        return welcomeService.welcomeService(name);
    }
}
