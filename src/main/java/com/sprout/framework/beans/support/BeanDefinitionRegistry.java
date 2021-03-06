package com.sprout.framework.beans.support;

import com.sprout.framework.beans.BeanDefinition;
import com.sprout.framework.beans.exception.BeanNotFound;

/**
 * bean定义注册管理
 * @author idealist
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 使用Bean名称查询BeanDefinition
     *
     * @param beanName
     * @return
     * @throws BeanNotFound
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeanNotFound;

    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * Return the names of all beans defined in this registry.
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();

}
