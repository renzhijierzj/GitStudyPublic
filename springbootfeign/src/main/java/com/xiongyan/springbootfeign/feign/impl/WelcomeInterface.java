package com.xiongyan.springbootfeign.feign.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//artifacteurekaprovider
@FeignClient(value = "artifacteurekaprovider")
public interface WelcomeInterface {
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    String welcomeClientOne(@RequestParam(value = "name") String name);
}
