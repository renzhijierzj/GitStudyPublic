package com.xiongyan.springbootfeign.feign.controller;

import com.xiongyan.springbootfeign.feign.impl.WelcomeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName :   WelcomeController
 * @Description: TODO
 * @Author: RenZhijie
 * @CreateDate: 2020/9/7 15:42
 */
@RestController
public class WelcomeController {
    @Autowired
    WelcomeInterface welcomeInterface;
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public String welcome(@RequestParam String name){
        return welcomeInterface.welcomeClientOne(name);
    }

}
