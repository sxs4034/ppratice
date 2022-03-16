package com.kuebikoIT.ppratice.controller;



import com.kuebikoIT.ppratice.service.PracitceServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/v1")
public class MyController {

    @Autowired
    PracitceServiceImple practiceService;


    @RequestMapping(value="/getValue", method = RequestMethod.GET)
    public String hello(@RequestParam String key) {
        return practiceService.hello(key);
    }

    @RequestMapping(value="/putValue", method = RequestMethod.POST)
    public  String hello(@RequestParam String key,@RequestParam String value) {
        return practiceService.hello(key,value);

    }
}
