package com.sprout.framework.beans;

import com.sprout.framework.beans.enums.BeanScopeEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * IOC容器中bean对象的定义
 * @author idealist
 */
@Setter
@Getter
public class BeanDefinition {

    /**
     * 当前bean定义对象的名称
     */
    private String beanName;

    /**
     * 当前bean对象的Class类型
     */
    private Class<?> beanClass;

    /**
     * 当前bean对象的初始化调用方法
     */
    private String init_method;

    /**
     * 当前bean对象的销毁调用方法
     */
    private String destroy_method;

    /**
     * Bean对象生存周期默认是单例对象
     */
    private BeanScopeEnum type = BeanScopeEnum.SINGLETON;

    /**
     * bean对象相关属性的管理
     */
    private PropertyValues propertyValues = new PropertyValues(this);

    /**
     * 默认的构造方法
     * @param beanName
     * @param beanClass
     */
    public BeanDefinition(String beanName,Class<?> beanClass){
        this.beanName = beanName;
        this.beanClass = beanClass;
    }

}
