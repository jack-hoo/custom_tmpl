/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Alignment
 * Author:   shugan
 * Date:     2018/10/29 14:00
 * Description: 元素对齐方式
 */
package com.example.my_template.bo;

/**
 * 〈元素对齐方式〉
 *
 * @author shugan
 * @create 2018/10/29
 * @since 1.0.0
 */
public enum Align {
    CENTER("居中"),
    LEFT("居左"),
    RIGHT("居右")
    ;
    private String name;

    Align(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
