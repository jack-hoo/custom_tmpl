/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Category
 * Author:   shugan
 * Date:     2018/10/25 11:33
 * Description: 类目
 */
package com.example.my_template.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 〈类目〉
 *
 * @author shugan
 * @create 2018/10/25
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class Module implements Serializable {
    /**
     * 模块主键id
     */
    private String moduleId;
    /**
     * @see TempType 模块所属的模板类型
     */
    private TempType tempType;
    /**
     * 模块索引
     */
    private int index;
    /**
     * 模块名称
     */
    private String moduleName;
    /**
     * 模块关联的基础元素id
     */
    private String elementId;

    /*public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public TempType getTempType() {
        return tempType;
    }

    public void setTempType(TempType tempType) {
        this.tempType = tempType;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }*/

    /*BASIC("基础"),
    ORDER_INFO("订单信息"),
    INSTANCE_INFO("商品信息"),
    OTHER("其它元素"),
    ;
    private String name;

    Module(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }*/
}