/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: ItemType
 * Author:   shugan
 * Date:     2018/10/29 11:10
 * Description: 元素类别
 */
package com.example.my_template.bo;

/**
 * 〈元素类别〉
 *
 * @author shugan
 * @create 2018/10/29
 * @since 1.0.0
 */
public enum ItemType {
    TEXT(1, "文字"),
    LOGO(2, "logo"),
    TABLE(3, "表格"),
    T_HEAD(4, "表头"),
    T_BODY(5, "表内容"),
    DYNAMIC(6, "动态内容"),
    ROW_SPLIT(7, "分隔符"),
    ;
    private int value;
    private String name;

    ItemType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
