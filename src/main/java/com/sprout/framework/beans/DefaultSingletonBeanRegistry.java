package com.sprout.framework.beans;

import com.sprout.framework.beans.exception.ParameterInvalid;
import com.sprout.framework.beans.support.SingletonBeanRegistry;

import java.util.concurrent.ConcurrentHashMap;

/**
 * bean对象实例注册管理
 * @author lzp
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    /**
     * 存放bean实例对象
     */
    private ConcurrentHashMap<String,Object> beanStore = new ConcurrentHashMap<>();

    /**
     * 根据名称获取bean对象
     * @param beanName
     * @return
     */
    @Override
    public Object getSingleton(String beanName) {
        return beanStore.get(beanName);
    }

    /**
     * 注册bean对象到容器中
     * @param beanName
     * @param singletonObject
     */
    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        if(beanName == null || singletonObject == null)
            throw new ParameterInvalid("参数不允许为空");
        beanStore.put(beanName,singletonObject);
    }
}
