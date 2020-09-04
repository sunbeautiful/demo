package com.example.springdata.test;

public interface DefaultInterface {
    default String defaultMethod(){
        return "default";
    }
}
