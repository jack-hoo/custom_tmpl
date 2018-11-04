/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: TestVo
 * Author:   shugan
 * Date:     2018/10/29 19:26
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
public class TestVo implements Serializable {
    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}