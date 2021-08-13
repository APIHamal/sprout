package com.sprout.framework.beans;

import lombok.Getter;
import lombok.Setter;

/**
 * Bean对象中属性的定义
 * @author idealist
 */
@Setter
@Getter
public class PropertyValue {

    private String propertyName;  //属性名称
    private Object propertyValue; //属性值

    /**
     * 默认构造函数
     * @param propertyName
     * @param propertyValue
     */
    public PropertyValue(String propertyName,Object propertyValue){
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

}
