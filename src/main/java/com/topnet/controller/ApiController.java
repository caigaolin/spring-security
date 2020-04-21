package com.topnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author cgl
 * @ClassName ApiController
 * @Date Created in 16:34 2020/4/20
 */
@Controller
public class ApiController {

    @RequestMapping("/hello")
    @ResponseBody
    public String Home() {
        return "Hello ,spring security!";
    }
}
