package com.example.common.test.pojo;

import lombok.Data;

/**
 * @author 59326
 * @description secondLeve
 * @date 2020/9/2 9:33
 */
@Data
public class SecondLevel extends FirstLevel {
    private String firstName = "SecondLevel";
    private String secondType;

    @Override
    public void outPrintln() {
        System.out.println("SecondLevel");
    }
}
