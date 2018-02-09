package com.glory.mybatis.annotation;

import java.lang.annotation.*;

/**
 * 初始化继承BaseService的service
 * Created by glory
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BaseService {

}