/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Element
 * Author:   shugan
 * Date:     2018/10/25 10:01
 * Description: 模板基本元素
 */
package com.example.my_template.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 〈模板元素〉
 *
 * @author shugan
 * @create 2018/10/25
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class Item implements Serializable{
    /**
     * 元素在某个类型模板的行位置
     */
    private int row;
    /**
     * 元素在某个类型模板的列位置
     */
    private int column;
    /**
     * 基础元素
     */
    private BaseElement element;
    /**
     * 模板id
     */
    private String templateId;
    /**
     * 子元素
     */
    private Item child;
    /**
     * @see ItemType 元素类型
     */
    private ItemType itemType;

    /**
     * 样例数据
     */
    private String example;

    /*public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public BaseElement getElement() {
        return element;
    }

    public void setElement(BaseElement element) {
        this.element = element;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Item getChild() {
        return child;
    }

    public void setChild(Item child) {
        this.child = child;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }*/
}