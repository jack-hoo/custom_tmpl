/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Row
 * Author:   shugan
 * Date:     2018/11/1 10:21
 * Description: 模块行
 */
package com.example.my_template.service;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 〈模块行〉
 *
 * @author shugan
 * @create 2018/11/1
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class RowVo<T extends Component> implements Serializable {
    /**
     * 行类型:basic/table
     */
    private String rowType;
    /**
     * 是否展示分割线
     */
    private boolean showLine;
    /**
     * 行在模块中的排序
     */
    private int rowSort;
    /**
     * @see Component
     * 行里面的组件
     */
    private List<T> components;

}