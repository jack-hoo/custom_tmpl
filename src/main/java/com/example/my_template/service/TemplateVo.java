/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: TemplateVo
 * Author:   shugan
 * Date:     2018/11/1 10:08
 * Description: 模板对象
 */
package com.example.my_template.service;

import com.example.my_template.bo.Template;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 〈模板对象〉
 *
 * @author shugan
 * @create 2018/11/1
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class TemplateVo implements Serializable {
    /**
     * 模板主键
     */
    private String id;
    /**
     * 模板名称
     */
    private String name;
    /**
     * 模板类型
     */
    private String templateType;
    /**
     * 模板预览图
     */
    private String preview;
    /**
     * 模板版本
     */
    private int version;
    /**
     * 模块
     */
    private List<ModuleVo> modules;
}