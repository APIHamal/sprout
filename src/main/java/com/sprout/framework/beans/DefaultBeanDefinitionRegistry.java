package com.sprout.framework.beans;

import com.sprout.framework.beans.exception.BeanDefinitionDuplicate;
import com.sprout.framework.beans.exception.BeanNotFound;
import com.sprout.framework.beans.support.BeanDefinitionRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认的bean定义管理
 * @author idealist
 */
public class DefaultBeanDefinitionRegistry implements BeanDefinitionRegistry {

    /**
     * BeanDefinition注册表对象
     */
    private Map<String,BeanDefinition> beanDefinitionStore = new HashMap<>();

    /**
     * 注册相关的bean定义对象
     * @param beanName
     * @param beanDefinition
     */
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        if(beanDefinitionStore.containsKey(beanName)){
            throw new BeanDefinitionDuplicate("["+beanName+"]重复定义");
        }
        beanDefinitionStore.put(beanName, beanDefinition);
    }

    /**
     * 获取指定的Bean定义
     * @param beanName
     * @return
     * @throws BeanNotFound
     */
    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeanNotFound {
        if(!beanDefinitionStore.containsKey(beanName)){
            throw new BeanNotFound("["+beanName+"]未找到该bean的定义");
        }
        return beanDefinitionStore.get(beanName);
    }

    /**
     * 判断指定的bean定义是否存在
     * @param beanName
     * @return
     */
    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionStore.containsKey(beanName);
    }

    /**
     * 获取当前所有注册的bean定义名称
     * @return
     */
    @Override
    public String[] getBeanDefinitionNames() {
        return beanDefinitionStore.keySet().toArray(new String[0]);
    }
}
