package com.kuebikoIT.ppratice.dao;

public interface ServiceDao {
    String save(String key, String value);

    String get(String key);
}
