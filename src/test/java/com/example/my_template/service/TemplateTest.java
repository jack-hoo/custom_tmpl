/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: TemplateTest
 * Author:   shugan
 * Date:     2018/10/29 15:01
 * Description:
 */
package com.example.my_template.service;

import com.alibaba.fastjson.JSON;
import com.example.my_template.bo.*;
import com.example.my_template.vo.CpVo;
import com.example.my_template.vo.TestVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/10/29
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateTest {

    @Test
    public void testCopy() {
        TestVo testVo = new TestVo();
        testVo.setMoney(2);
        testVo.setName("hu");
        CpVo cpVo = new CpVo();
        BeanUtils.copyProperties(testVo,cpVo);
        System.out.println(cpVo);
    }

    @Test
    public void testGenerateTemp() {
        //模板
        ArrayList<Item> template = new ArrayList<>();

        //元素通用基础信息
        BaseElement logo = new BaseElement();
        logo.setTagName("店铺logo")
                .setTagValue("${shopDetail.logo}")
                .setAlign(Align.CENTER)
                .setEmptyHidden(false)
                .setFontSize(FontSize.W4H4)
                .setId("001")
                .setPlaceHolder("p0")
                .setPrefix(null);
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
        deskNum.setTagName("桌台号标签");
        deskNum.setTagValue("");
        deskNum.setAlign(Align.LEFT);
        deskNum.setFontSize(FontSize.W1H1);
        deskNum.setId("003");
        deskNum.setPlaceHolder("p7");
        deskNum.setPrefix("桌台号:");
        Item item3 = new Item();
        item3.setRow(3);
        item3.setColumn(1);
        item3.setElement(deskNum);
        item3.setItemType(ItemType.TEXT);
        item3.setTemplateId("888");
        item3.setExample("桌台号:101");
        template.add(item3);

        BaseElement deskNumValue = new BaseElement();
        deskNumValue.setTagName("桌台号值")
                .setTagValue("${order.seatName}")
                .setAlign(Align.LEFT)
                .setFontSize(FontSize.W2H2)
                .setId("004")
                .setPlaceHolder("p0")
                .setPrefix("");
        Item dItem = new Item();
        dItem.setRow(3)
                .setColumn(2)
                .setElement(deskNumValue)
                .setItemType(ItemType.DYNAMIC)
                .setTemplateId("888")
                .setExample("1101");
        template.add(dItem);

        BaseElement serialNumberTag = new BaseElement();
        serialNumberTag.setTagName("单号标签")
                .setTagValue("")
                .setAlign(Align.LEFT)
                .setFontSize(FontSize.W1H1)
                .setId("005")
                .setPlaceHolder("p7")
                .setPrefix("单号:");
        Item item4 = new Item();
        item4.setRow(3)
                .setColumn(3)
                .setElement(serialNumberTag)
                .setItemType(ItemType.TEXT)
                .setTemplateId("888")
                .setExample("单号:");
        template.add(item4);

        BaseElement serialNumberValue = new BaseElement();
        serialNumberValue.setTagValue("单号值")
                .setTagValue("${order.code}")
                .setAlign(Align.LEFT)
                .setFontSize(FontSize.W2H2)
                .setId("006")
                .setPlaceHolder("p8")
                .setPrefix("");
        Item sItem = new Item();
        sItem.setRow(3)
                .setColumn(4)
                .setElement(serialNumberValue)
                .setItemType(ItemType.DYNAMIC)
                .setTemplateId("888")
                .setExample("10001");
        template.add(sItem);

        BaseElement innerCode = new BaseElement();
        innerCode.setTagName("账单号")
                .setTagValue("${order.innerCode}")
                .setAlign(Align.LEFT)
                .setFontSize(FontSize.W1H1)
                .setId("007")
                .setPlaceHolder("p0")
                .setPrefix("账单号:");
        Item item5 = new Item();
        item5.setRow(4)
                .setColumn(1)
                .setElement(innerCode)
                .setItemType(ItemType.DYNAMIC)
                .setTemplateId("888")
                .setExample("账单号:20181111111111");
        template.add(item5);

        BaseElement dinnerNum = new BaseElement();
        dinnerNum.setTagName("用餐人数")
                .setTagValue("${order.peopleCount}")
                .setAlign(Align.LEFT)
                .setFontSize(FontSize.W1H1)
                .setId("008")
                .setPlaceHolder("p12")
                .setPrefix("人数:");
        Item item6 = new Item();
        item6.setRow(4)
                .setColumn(2)
                .setElement(dinnerNum)
                .setItemType(ItemType.DYNAMIC)
                .setTemplateId("888")
                .setExample("人数:4");
        template.add(item6);
        BaseElement waiter = new BaseElement();
        waiter.setTagName("服务员")
                .setTagValue("${order.waiter}")
                .setAlign(Align.LEFT)
                .setFontSize(FontSize.W1H1)
                .setId("009")
                .setPlaceHolder("p0")
                .setPrefix("服务员:");
        Item item9 = new Item();
        item9.setRow(5)
                .setColumn(1)
                .setElement(waiter)
                .setItemType(ItemType.DYNAMIC)
                .setTemplateId("888")
                .setExample("服务员:林小西");
        template.add(item9);
        BaseElement moneyUnit = new BaseElement();
        moneyUnit.setTagName("费用单位")
                .setTagValue("${money.unit}")
                .setAlign(Align.LEFT)
                .setFontSize(FontSize.W1H1)
                .setId("010")
                .setPlaceHolder("p8")
                .setPrefix("单位:");
        Item item10 = new Item();
        item10.setRow(5)
                .setColumn(2)
                .setElement(moneyUnit)
                .setItemType(ItemType.DYNAMIC)
                .setTemplateId("888")
                .setExample("单位:元");
        template.add(item10);



        System.out.println(template);
    }
}