/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: TableRow
 * Author:   shugan
 * Date:     2018/11/1 14:53
 * Description: 表格行
 */
package com.example.my_template.service;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 〈表格行〉
 *
 * @author shugan
 * @create 2018/11/1
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class TableRow {
    /**
     * 一行可以由多列组成
     */
    private List<BaseComponent> columns;

}