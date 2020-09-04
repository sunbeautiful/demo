package com.example.springdata.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 59326
 * @description
 * @date 2020/8/31 9:16
 */
public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int i = date.getYear();


        List<String> list = null;
        list.stream().findFirst().get();
    }



}
