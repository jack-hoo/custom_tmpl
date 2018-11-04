/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: CpVo
 * Author:   shugan
 * Date:     2018/10/29 19:27
 * Description:
 */
package com.example.my_template.vo;

import java.io.Serializable;

/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/10/29
 * @since 1.0.0
 */
public class CpVo implements Serializable {
    private String name;
    private Double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}