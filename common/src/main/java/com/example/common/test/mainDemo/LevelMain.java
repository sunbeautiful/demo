package com.example.common.test.mainDemo;

import com.example.common.test.annotationtest.Test;
import com.example.common.test.pojo.FirstLevel;
import com.example.common.test.pojo.LombokDemo;
import com.example.common.test.pojo.LombokDemo.LombokDemoBuilder;
import com.example.common.test.pojo.NewSecondLevel;
import com.example.common.test.pojo.SecondLevel;
import java.lang.annotation.Annotation;

/**
 * @author 59326
 * @description main
 * @date 2020/9/2 9:36
 */
public class LevelMain {
    public static void main(String[] args) {
        FirstLevel first = new SecondLevel();
        FirstLevel second = new NewSecondLevel();
        Class<? extends FirstLevel> aClass = second.getClass();
        if (aClass.isAnnotationPresent(Test.class)) {
            Test annotation = aClass.getAnnotation(Test.class);
            System.out.println(annotation.name());
        }

        first.outPrintln();
        System.out.println(first.getFirstName());

        LombokDemo df = LombokDemo.builder().age("df").high("125").build();

    }
}
