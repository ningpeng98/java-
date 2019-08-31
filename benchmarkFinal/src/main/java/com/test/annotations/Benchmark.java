package com.test.annotations;
/**
 * 自定义注解
 * */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//运行时注解
@Retention(RetentionPolicy.RUNTIME)
//作用在方法上的注解
@Target(ElementType.METHOD)
public @interface Benchmark {

}
