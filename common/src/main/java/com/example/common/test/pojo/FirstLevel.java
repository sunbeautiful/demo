package com.example.common.test.pojo;

import com.example.common.test.annotationtest.Test;
import com.example.common.test.interfaceSer.interfaceSer;
import java.io.SerializablePermission;
import lombok.Data;

/**
 * @author 59326
 * @description
 * @date 2020/9/2 9:03
 */
@Data
public class FirstLevel implements interfaceSer {

    private String firstName = "first";

    @Test(name = "sqq",des = "data")
    private String firstAge;

    public void outPrintln(){
        System.out.println("FirstLevel");
    }
}
