package com.test.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//作用在运行时的注解
@Retention(RetentionPolicy.RUNTIME)
//作用在定义在类上和方法上的注解
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface Measurement {
    //一组实验调用方法多少次
    int iterations();
    //一共进行多少组实验
    int group();
}
