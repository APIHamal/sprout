package com.sprout.framework.beans;

import com.sprout.framework.beans.exception.ParameterInvalid;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Bean中相关属性对象管理
 * @author ideast
 */
@Setter
@Getter
public class PropertyValues {

    /**
     * 所属BeanDefinition对象
     */
    private BeanDefinition ownBeanDefinition;

    /**
     * 保存添加的PropertyValue对象
     */
    private List<PropertyValue> propertyValueList = new ArrayList<>();

    /**
     * 默认构造函数
     * @param beanDefinition
     */
    public PropertyValues(BeanDefinition beanDefinition){
        this.ownBeanDefinition = beanDefinition;
    }

    /**
     * 添加属性对象
     * @param propertyValue
     */
    public void addPropertyEntry(PropertyValue propertyValue){
        if(propertyValue == null){
            throw new ParameterInvalid("propertyValue对象不允许为空");
        }
        propertyValueList.add(propertyValue);
    }

    /**
     * 根据名称删除响应的属性值对象
     * @param propertyName
     */
    public void removePropertyByName(String propertyName){
        Iterator<PropertyValue> iterator = propertyValueList.iterator();
        while (iterator.hasNext()){
            PropertyValue propertyValue = iterator.next();
            if(propertyValue.getPropertyName().equals(propertyValue)){
                iterator.remove();
            }
        }
    }

}
