/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Component
 * Author:   shugan
 * Date:     2018/11/1 10:38
 * Description: 组件抽象类
 */
package com.example.my_template.service;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 〈组件抽象类〉
 *
 * @author shugan
 * @create 2018/11/1
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public abstract class Component implements Serializable{
    /**
     * 组件名称
     */
    private String name;
    /**
     * 组件类型:text/logo/table/thead/tbody/tableFlag
     */
    private String type;
    /**
     * 组件在模块中的排序?组件在模板中的排序？
     */
    //private int sort;

}