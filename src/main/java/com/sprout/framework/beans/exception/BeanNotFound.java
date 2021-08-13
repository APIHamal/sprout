package com.sprout.framework.beans.exception;

/**
 * bean对象未找到异常
 * @author idealist
 */
public class BeanNotFound extends RuntimeException{

    public BeanNotFound(String message){
        super(message);
    }

}
