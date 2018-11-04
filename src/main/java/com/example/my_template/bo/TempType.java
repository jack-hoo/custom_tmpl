/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: TempType
 * Author:   shugan
 * Date:     2018/10/29 10:17
 * Description: 模板类型
 */
package com.example.my_template.bo;

/**
 * 〈模板类型〉
 *
 * @author shugan
 * @create 2018/10/29
 * @since 1.0.0
 */
public enum TempType {
    DIANCAIDAN(1,"点菜单"),
    JIEZHANGDAN_CAIWULIAN(2,"结账单(财务联)"),
    JIEZHANGDAN_KEHULIAN(2,"结账单(客户联)"),
    ;
    private int value;
    private String name;

    TempType(int value, String name) {
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
