package com.kuebikoIT.ppratice.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class MyController {

    private Map<String, String> dataStore = new HashMap<>();


    @RequestMapping(value="/getValue", method = RequestMethod.GET)
    public String hello(@RequestParam String input) {

        return dataStore.get(input);

    }

    @RequestMapping(value="/putValue", method = RequestMethod.POST)
    public  String hello(@RequestParam String key,@RequestParam String value) {
        dataStore.put(key,value);
        return key;
    }
}
