package com.example.common.test.pojo;

import lombok.Data;

/**
 * @author 59326
 * @description NewSecondLevel
 * @date 2020/9/2 9:35
 */
@Data
public class NewSecondLevel extends FirstLevel{

    private String newSecondType;

    @Override
    public void outPrintln() {
        System.out.println("NewSecondLevel");
    }
}
