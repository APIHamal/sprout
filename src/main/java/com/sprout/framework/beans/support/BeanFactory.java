package com.sprout.framework.beans.support;


import com.sprout.framework.beans.exception.BeanNotFound;

/**
 * bean实例创建工程根据bean名称获取实例对象
 * @author idealist
 */
public interface BeanFactory {

    /**
     * 根据名称获取bean实例对象
     * @param name
     * @return
     * @throws BeanNotFound
     */
    Object getBean(String name) throws BeanNotFound;

    /**
     * 根据名称和参数列表获取bean实例对象
     * @param name
     * @param args
     * @return
     * @throws BeanNotFound
     */
    Object getBean(String name, Object... args) throws BeanNotFound;

    /**
     * 根据类型获取指定的对象
     * @param name
     * @param requiredType
     * @param <T>
     * @return
     * @throws BeanNotFound
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeanNotFound;

}
