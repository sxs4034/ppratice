package com.kuebikoIT.ppratice.repo;

import java.util.HashMap;
import java.util.Map;

public class ServiceRepoImple implements ServiceRepo {

    private Map<String,String> datastore = new HashMap<>();

    @Override
    public String save(String key, String value) {
        datastore.put(key,value);
        return key;
    }

    @Override
    public String get(String key) {
        return datastore. get(key);
    }
}
