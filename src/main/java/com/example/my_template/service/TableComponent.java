/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: TableComponent
 * Author:   shugan
 * Date:     2018/11/1 14:10
 * Description: 表格组件
 */
package com.example.my_template.service;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 〈表格组件〉
 *
 * @author shugan
 * @create 2018/11/1
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class TableComponent extends Component {
    /**
     * 表格title
     */
    private BaseComponent tableTitle;
    /**
     * 是否显示表头下方的横线
     */
    private boolean tableTitleLine;
    /**
     * 表头，由一行组成
     */
    private List<BaseComponent> thead;
    /**
     * 表主体部分，由多行组成
     */
    private List<TableRow> tbody;
    /**
     * 表格标识组件，一般不显示
     */
    private BaseComponent component;

}