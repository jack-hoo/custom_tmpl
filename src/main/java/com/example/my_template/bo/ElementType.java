/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: ElementType
 * Author:   shugan
 * Date:     2018/10/25 13:55
 * Description: 元素类型
 */
package com.example.my_template.bo;

/**
 * 〈元素类型〉
 *
 * @author shugan
 * @create 2018/10/25
 * @since 1.0.0
 */
public enum ElementType {
    BLOCK("块级元素"),
    INLINE("内联元素"),
    ;
    private String name;

    ElementType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
