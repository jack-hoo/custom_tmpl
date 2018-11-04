/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: PaperSize
 * Author:   shugan
 * Date:     2018/10/29 10:22
 * Description: 打印纸规格
 */
package com.example.my_template.bo;

/**
 * 〈打印纸规格〉
 *
 * @author shugan
 * @create 2018/10/29
 * @since 1.0.0
 */
public enum  PaperSize {
    STANDARD(58, "58mm"),
    LARGE(80, "80mm"),
    ;
    private int size;
    private String name;

    PaperSize(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}