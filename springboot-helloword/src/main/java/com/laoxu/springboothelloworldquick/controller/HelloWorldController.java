package com.laoxu.springboothelloworldquick.controller;


import com.laoxu.springboothelloworldquick.model.Data;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(){
        return "你好！jar包部署成功！";
    }

    @GetMapping("/proxy/call/back")
    public String call(){
        return "target service be called by stubby4j";
    }

    @PostMapping("/call/back/mounteBank")
    public String callByMounteBank(@RequestBody String id){
        return "{\"id\":\"target service be called by mounteBank\"}";
    }
    @PostMapping("/record/replay")
    public String replayMounteBank(@RequestBody String id){
        return "{\"message\":\"record and replay by mounteBank\"}";
    }
}
