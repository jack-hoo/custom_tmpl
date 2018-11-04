/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Template
 * Author:   shugan
 * Date:     2018/10/29 9:57
 * Description: 模板
 */
package com.example.my_template.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 〈模板:规格：58mm/80mm,模板类型：客户联/交接单等等〉
 *
 * @author shugan
 * @create 2018/10/29
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
public class Template implements Serializable {
    /**
     * 模板id主键
     */
    private String templateId;
    /**
     * @see TempType 模板类型
     */
    private TempType type;
    /**
     * 打印纸大小
     */
    private PaperSize paperSize;

    /**
     * 创建者 SYSTEM或者OTHER
     */
    private String maker;
    /**
     * entityId
     */
    private String entityId;

    /*public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TempType getType() {
        return type;
    }

    public void setType(TempType type) {
        this.type = type;
    }

    public PaperSize getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(PaperSize paperSize) {
        this.paperSize = paperSize;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }*/
}