/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Row
 * Author:   shugan
 * Date:     2018/11/3 13:27
 * Description: 行
 */
package com.example.my_template.service;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 〈行〉
 *
 * @author shugan
 * @create 2018/11/3
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class Row implements Serializable {
    private List<BaseComponent> columns;
}