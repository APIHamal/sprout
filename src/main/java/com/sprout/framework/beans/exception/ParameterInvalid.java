package com.sprout.framework.beans.exception;

/**
 * 参数无效异常
 * @author idealist
 */
public class ParameterInvalid extends RuntimeException{

    public ParameterInvalid(String message){
        super(message);
    }

}
