/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Item
 * Author:   shugan
 * Date:     2018/10/31 17:19
 * Description: 模板元素
 */
package com.example.my_template.service;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 〈模板元素〉
 *
 * @author shugan
 * @create 2018/10/31
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class BaseComponent extends Component implements Serializable{

    /**
     * 组件id
     */
    private String id;
    /**
     * 系统组件id
     */
    private int systemComponentId;
    /**
     * 所属模块id
     */
    private int moduleId;
    /**
     * 模板id
     */
    private String documentTempletId;
    /**
     * 父组件id
     */
    private String parentId;
    /**
     * 组件标签
     */
    private String label;
    /**
     * 组件值
     */
    private String value;
    /**
     * 组件标签样式
     */
    private String labelStyle;
    /**
     * 组件值样式
     */
    private String valueStyle;
    /**
     * 组件值占位符
     */
    private String placeholder;
    /**
     * 组件属性
     */
    private String componentProperty;

    /**
     * 组件所属行
     */
    private int row;
    /**
     * 组件所属列
     */
    private int column;
    /**
     * 组件宽度
     */
    private int width;

    private String chunkType;

    private int chunkSort;
}