/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Client
 * Author:   shugan
 * Date:     2018/10/29 13:57
 * Description:
 */
package com.example.my_template.bo;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/10/29
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Integer rate = new Integer(20);
        System.out.println(new BigDecimal(rate).divide(new BigDecimal(100)) );
        /*//模板
        ArrayList<Item> template = new ArrayList<>();
        
        //元素通用基础信息
        BaseElement logo = new BaseElement();
        logo.setTagName("店铺logo");
        logo.setTagValue("${shopDetail.logo}");
        logo.setAlign(Align.CENTER);
        logo.setEmptyHidden(false);
        logo.setFontSize(FontSize.W4H4);
        logo.setId("001");
        logo.setPlaceHolder("p0");
        logo.setPrefix(null);
        //模板元素
        Item item1 = new Item();
        item1.setRow(1);
        item1.setColumn(1);
        item1.setElement(logo);
        item1.setItemType(ItemType.DYNAMIC);
        item1.setTemplateId("888");
        item1.setExample("http://www.baidu.com");
        template.add(item1);

        BaseElement shopName = new BaseElement();
        shopName.setTagName("店铺名称");
        shopName.setTagValue("${shopDetail.name}");
        shopName.setAlign(Align.CENTER);
        shopName.setFontSize(FontSize.W2H2);
        shopName.setId("002");
        shopName.setPlaceHolder("p0");
        shopName.setPrefix(null);
        Item item2 = new Item();
        item2.setRow(2);
        item2.setColumn(1);
        item2.setElement(shopName);
        item2.setItemType(ItemType.DYNAMIC);
        item2.setTemplateId("888");
        item2.setExample("阿里烧烤");
        template.add(item2);

        Item split = new Item();
        split.setItemType(ItemType.ROW_SPLIT);
        template.add(split);

        BaseElement deskNum = new BaseElement();
        deskNum.setTagName("桌台号");
        deskNum.setTagValue("${order.seatName}");
        deskNum.setAlign(Align.LEFT);
        deskNum.setFontSize(FontSize.W1H1);
        deskNum.setId("003");
        deskNum.setPlaceHolder("p7");
        deskNum.setPrefix("桌台号:");
        Item item3 = new Item();
        item3.setRow(3);
        item3.setColumn(1);
        item3.setElement(deskNum);
        item3.setItemType(ItemType.DYNAMIC);
        item3.setTemplateId("888");
        item3.setExample("桌台号:1");
        template.add(item3);*/
    }

}