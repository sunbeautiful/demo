package com.example.common.test.mainDemo;

import java.sql.SQLOutput;

/**
 * @author 59326
 * @description 空指针
 * @date 2020/9/2 10:30
 */
public class NullMainMethod {

    public static void main(String[] args) {
        Integer num = null;
        System.out.println(String.valueOf(num));
        System.out.println(num.toString());
    }
}
