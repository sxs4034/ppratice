package com.kuebikoIT.ppratice.service;


import com.kuebikoIT.ppratice.dao.ServiceDaoImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class PracitceServiceImple implements PracticeService {

    @Autowired
    ServiceDaoImple serviceDao;

    @Override
    public String hello(String key, String value) {
        return serviceDao.save(key,value);

    }

    @Override
    public String hello(String key) {
        return serviceDao.get(key);
    }


}
