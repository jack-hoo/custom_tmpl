/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Chunk
 * Author:   shugan
 * Date:     2018/11/3 13:24
 * Description: 模板内部块
 */
package com.example.my_template.service;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 〈模板内部块〉
 *
 * @author shugan
 * @create 2018/11/3
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class Chunk implements Serializable{
    //"chunkType": "table",
    //        "chunkSort": 10,
    //        "showLine": true,
    private String chunkType;
    private int chunkSort;
    private boolean showLine;
    private List<Row> rows;

}