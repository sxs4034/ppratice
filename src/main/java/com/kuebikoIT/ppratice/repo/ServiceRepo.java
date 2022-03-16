package com.kuebikoIT.ppratice.repo;

public interface ServiceRepo {

    String save(String key, String value);

    String get(String key);
}
