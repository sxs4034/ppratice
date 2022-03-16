package com.kuebikoIT.ppratice.dao;

import com.kuebikoIT.ppratice.repo.ServiceRepo;
import org.springframework.stereotype.Component;

@Component
public class ServiceDaoImple implements ServiceDao{

    ServiceRepo serviceRepo;


    @Override
    public String save(String key, String value){
        return null;
    }

    @Override
    public String get(String key){
        return null;
    }
}
