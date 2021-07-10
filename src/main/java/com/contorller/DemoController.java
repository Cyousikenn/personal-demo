package com.contorller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DemoController {

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String helloName(@PathVariable("name") String name) {
        return "hello " + name;
    }

    @GetMapping(value = "/hello")
    public String hello(HttpServletRequest request) {
        System.out.println(request.getRemoteAddr());
        return "hello world";
    }
}
