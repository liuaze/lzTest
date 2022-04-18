package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/test")
    public Map<String,String> test(){
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        return map;
    }
}
