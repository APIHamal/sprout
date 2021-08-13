package com.sprout.framework.beans.support;

/**
 * Bean对象实例注册管理
 * @author idealist
 */
public interface SingletonBeanRegistry {

    /**
     * 根据名称获取Bean实例对象
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

    /**
     * 注册Bean实例对象
     * @param beanName
     * @param singletonObject
     */
    void registerSingleton(String beanName, Object singletonObject);

}
                                                