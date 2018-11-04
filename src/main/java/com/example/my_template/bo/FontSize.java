/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: FontSize
 * Author:   shugan
 * Date:     2018/10/29 14:04
 * Description: 字体大小
 */
package com.example.my_template.bo;

/**
 * 〈字体大小〉
 *
 * @author shugan
 * @create 2018/10/29
 * @since 1.0.0
 */
public enum  FontSize {
    W1H1("1倍宽1倍高"),
    W2H2("2倍宽2倍高"),
    W4H4("4倍宽4倍高")
    ;
    private String value;

    FontSize(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}