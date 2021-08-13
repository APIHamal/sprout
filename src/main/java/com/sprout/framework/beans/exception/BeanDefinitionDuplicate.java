package com.sprout.framework.beans.exception;

/**
 * Bean对象重复定义
 * @author idealist
 */
public class BeanDefinitionDuplicate extends RuntimeException{

    public BeanDefinitionDuplicate(String message){
        super(message);
    }

}
