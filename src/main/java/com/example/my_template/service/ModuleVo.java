/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Module
 * Author:   shugan
 * Date:     2018/11/1 10:13
 * Description: 模块
 */
package com.example.my_template.service;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 〈模块〉
 *
 * @author shugan
 * @create 2018/11/1
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class ModuleVo implements Serializable {
    /**
     * 模块id
     */
    private int moduleId;
    /**
     * 模块名称
     */
    private String moduleName;
    /**
     * 模块描述
     */
    private String moduleDesc;
    /**
     * 模块排序
     */
    private int moduleSort;
    /**
     * 模块行
     */
    private List<Chunk> chunks;
}