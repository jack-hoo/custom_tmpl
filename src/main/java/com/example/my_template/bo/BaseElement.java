/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: BaseElement
 * Author:   shugan
 * Date:     2018/10/25 10:02
 * Description: 基础元素
 */
package com.example.my_template.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * 〈基础元素〉
 *
 * @author shugan
 * @create 2018/10/25
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class BaseElement implements Serializable{

    private String id;

    //标签名称，如 logo,shopName,显示在左侧
    private String tagName;
    //标签值，如logo地址，显示在模板上
    private String tagValue;

    //对齐方式
    private Align align;

    //倍宽倍高w2h2
    private FontSize fontSize;

    //值前缀，默认为空
    private String prefix = "";

    //如果值为空就不显示
    private boolean emptyHidden;
    //占用字符数，每个元素都有默认值不需要设置
    private String placeHolder;

    /*public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Align getAlign() {
        return align;
    }

    public void setAlign(Align align) {
        this.align = align;
    }

    public FontSize getFontSize() {
        return fontSize;
    }

    public void setFontSize(FontSize fontSize) {
        this.fontSize = fontSize;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public boolean isEmptyHidden() {
        return emptyHidden;
    }

    public void setEmptyHidden(boolean emptyHidden) {
        this.emptyHidden = emptyHidden;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.currentTimeMillis()/1000);
        TimeUnit.SECONDS.sleep(1l);
        System.out.println(System.currentTimeMillis()/1000);
    }*/
}