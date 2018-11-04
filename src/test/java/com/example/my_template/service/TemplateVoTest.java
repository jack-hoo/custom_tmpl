/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: TemplateVoTest
 * Author:   shugan
 * Date:     2018/11/1 15:12
 * Description:
 */
package com.example.my_template.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/11/1
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateVoTest {
    @Test
    public void testTemp() {
        /*TemplateVo templateVo = new TemplateVo();

        List<RowVo> titleRows = new ArrayList<>();

        List<Component> components = new ArrayList<>();
        BaseComponent logo = new BaseComponent();
        logo.setRow(1)
                .setColumn(1)
                .setWidth(100)
                .setId("001")
                .setDocumentTempletId("888")
                .setLabel("商户logo")
                .setLabelStyle("")
                .setValue("http://www.baidu.com")
                .setValueStyle("{\"fontSize\":\"1\",\"align\":\"center\"}")
                .setPlaceholder("#{shopName}")
                .setSort(1);

        RowVo row1 = new RowVo();
        row1.setSort(1)
                .setRowType("logo")
                .setComponents();
        RowVo rowVo2 = new RowVo();
        rowVo2.setSort(2)
                .setRowType("basic")
                .setComponents();
        RowVo rowVo3 = new RowVo();
        rowVo3.setSort(3)
                .setRowType("basic")
                .setComponents();

        ModuleVo title = new ModuleVo();
        title.setModuleDesc("标题描述xxxxxx")
                .setModuleId("1")
                .setModuleName("标题")
                .setRows(null)
                .setSort(1);

    }*/
    }

    @Test
    /*public void testJsonToObject() {
        String tempJson = "{\n" +
                "  \"id\": \"88888\",\n" +
                "  \"modules\": [\n" +
                "    {\n" +
                "      \"moduleDesc\": \"定义商户LOGO & 票据名称（为避免打印失真，建议使用黑白商户logo图）\",\n" +
                "      \"moduleId\": 1,\n" +
                "      \"moduleName\": \"标题\",\n" +
                "      \"rows\": [\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"column\": 1,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818421921252352\",\n" +
                "              \"label\": \"商户logo\",\n" +
                "              \"moduleId\": 1,\n" +
                "              \"placeholder\": \"#{shopLogo}\",\n" +
                "              \"row\": 1,\n" +
                "              \"systemComponentId\": 0,\n" +
                "              \"type\": \"logo\",\n" +
                "              \"value\": \"https://assets.2dfire.com/frontend/5a75e835c0b8c09f51acda09bdd68125.jpg\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"center\\\"}\",\n" +
                "              \"width\": 100\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"logo\",\n" +
                "          \"showLine\": false,\n" +
                "          \"sort\": 1\n" +
                "        },\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"column\": 1,\n" +
                "              \"componentProperty\": \"{\\\"customizable\\\":true}\",\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818421933835264\",\n" +
                "              \"label\": \"店铺名称\",\n" +
                "              \"moduleId\": 1,\n" +
                "              \"placeholder\": \"#{shopName}\",\n" +
                "              \"row\": 2,\n" +
                "              \"systemComponentId\": 1,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"店铺名称\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"4\\\",\\\"align\\\":\\\"center\\\"}\",\n" +
                "              \"width\": 100\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"basic\",\n" +
                "          \"showLine\": false,\n" +
                "          \"sort\": 2\n" +
                "        },\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"column\": 1,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818421946418176\",\n" +
                "              \"label\": \"票据名称\",\n" +
                "              \"moduleId\": 1,\n" +
                "              \"placeholder\": \"#{ticketType}\",\n" +
                "              \"row\": 3,\n" +
                "              \"systemComponentId\": 2,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"结账单\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"4\\\",\\\"align\\\":\\\"center\\\"}\",\n" +
                "              \"width\": 100\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"basic\",\n" +
                "          \"showLine\": true,\n" +
                "          \"sort\": 3\n" +
                "        }\n" +
                "      ],\n" +
                "      \"sort\": 1\n" +
                "    },\n" +
                "    {\n" +
                "      \"moduleId\": 2,\n" +
                "      \"moduleName\": \"基础信息\",\n" +
                "      \"rows\": [\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"column\": 1,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818421971584000\",\n" +
                "              \"label\": \"桌台号\",\n" +
                "              \"moduleId\": 2,\n" +
                "              \"placeholder\": \"桌台号:#{tableNum}\",\n" +
                "              \"row\": 4,\n" +
                "              \"systemComponentId\": 3,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"桌台号:1\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "              \"width\": 70\n" +
                "            },\n" +
                "            {\n" +
                "              \"column\": 2,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818421984166912\",\n" +
                "              \"label\": \"单水号\",\n" +
                "              \"moduleId\": 2,\n" +
                "              \"placeholder\": \"单水号:#{serialNum}\",\n" +
                "              \"row\": 4,\n" +
                "              \"systemComponentId\": 4,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"单水号:1001\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "              \"width\": 30\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"basic\",\n" +
                "          \"showLine\": false,\n" +
                "          \"sort\": 4\n" +
                "        },\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"column\": 1,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818421996749824\",\n" +
                "              \"label\": \"账单号\",\n" +
                "              \"moduleId\": 2,\n" +
                "              \"placeholder\": \"账单号:#{orderNum}\",\n" +
                "              \"row\": 5,\n" +
                "              \"systemComponentId\": 5,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"账单号:201608221001\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "              \"width\": 80\n" +
                "            },\n" +
                "            {\n" +
                "              \"column\": 2,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818422009332736\",\n" +
                "              \"label\": \"人数\",\n" +
                "              \"moduleId\": 2,\n" +
                "              \"placeholder\": \"人数:#{peopleNum}\",\n" +
                "              \"row\": 5,\n" +
                "              \"systemComponentId\": 6,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"人数:2\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "              \"width\": 20\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"basic\",\n" +
                "          \"showLine\": false,\n" +
                "          \"sort\": 5\n" +
                "        },\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"column\": 1,\n" +
                "              \"label\": \"税号\",\n" +
                "              \"moduleId\": 2,\n" +
                "              \"placeholder\": \"税号:#{taxGSTRegNo}\",\n" +
                "              \"row\": 6,\n" +
                "              \"systemComponentId\": 605,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"税号:123232323\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "              \"width\": 100\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"basic\",\n" +
                "          \"showLine\": false,\n" +
                "          \"sort\": 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"rowType\": \"text\",\n" +
                "          \"showLine\": false,\n" +
                "          \"sort\": 7\n" +
                "        },\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"column\": 1,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818422038692864\",\n" +
                "              \"label\": \"反结账原订单流水号\",\n" +
                "              \"moduleId\": 2,\n" +
                "              \"placeholder\": \"反结账原订单流水号:#{reverseAccountOldOrderNum}\",\n" +
                "              \"row\": 8,\n" +
                "              \"systemComponentId\": 8,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"反结账原订单流水号:2\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "              \"width\": 100\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"basic\",\n" +
                "          \"showLine\": false,\n" +
                "          \"sort\": 8\n" +
                "        },\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"column\": 1,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818422051275776\",\n" +
                "              \"label\": \"就餐人数详情\",\n" +
                "              \"moduleId\": 2,\n" +
                "              \"placeholder\": \"#{mealPeopleDetail}\",\n" +
                "              \"row\": 9,\n" +
                "              \"systemComponentId\": 553,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"成人2位，儿童1位，老人1位\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"2\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "              \"width\": 100\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"basic\",\n" +
                "          \"showLine\": true,\n" +
                "          \"sort\": 9\n" +
                "        }\n" +
                "      ],\n" +
                "      \"sort\": 2\n" +
                "    },\n" +
                "    {\n" +
                "      \"moduleId\": 3,\n" +
                "      \"moduleName\": \"订单明细\",\n" +
                "      \"rows\": [\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"component\": {\n" +
                "                \"column\": 1,\n" +
                "                \"componentProperty\": \"{\\\"name\\\":\\\"goods\\\"}\",\n" +
                "                \"documentTempletId\": \"131705436516290560\",\n" +
                "                \"id\": \"153818422080635904\",\n" +
                "                \"label\": \"商品表格\",\n" +
                "                \"moduleId\": 3,\n" +
                "                \"placeholder\": \"#{goodSource}\",\n" +
                "                \"row\": 10,\n" +
                "                \"systemComponentId\": 9,\n" +
                "                \"type\": \"tableFlag\",\n" +
                "                \"width\": 100\n" +
                "              },\n" +
                "              \"name\": \"goods\",\n" +
                "              \"tableTitleLine\": false,\n" +
                "              \"tbody\": [\n" +
                "                {\n" +
                "                  \"columns\": [\n" +
                "                    {\n" +
                "                      \"column\": 1,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422143550464\",\n" +
                "                      \"label\": \"商品\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422080635904\",\n" +
                "                      \"placeholder\": \"#{good}\",\n" +
                "                      \"row\": 11,\n" +
                "                      \"systemComponentId\": 15,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"1.回锅肉\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                      \"width\": 40\n" +
                "                    },\n" +
                "                    {\n" +
                "                      \"column\": 2,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422151939072\",\n" +
                "                      \"label\": \"单价\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422080635904\",\n" +
                "                      \"placeholder\": \"#{price}\",\n" +
                "                      \"row\": 11,\n" +
                "                      \"systemComponentId\": 16,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"16.00\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                      \"width\": 20\n" +
                "                    },\n" +
                "                    {\n" +
                "                      \"column\": 3,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422164521984\",\n" +
                "                      \"label\": \"数量\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422080635904\",\n" +
                "                      \"placeholder\": \"#{number}\",\n" +
                "                      \"row\": 11,\n" +
                "                      \"systemComponentId\": 17,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"1/份\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                      \"width\": 20\n" +
                "                    },\n" +
                "                    {\n" +
                "                      \"column\": 4,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422172910592\",\n" +
                "                      \"label\": \"价格\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422080635904\",\n" +
                "                      \"placeholder\": \"#{amount}\",\n" +
                "                      \"row\": 11,\n" +
                "                      \"systemComponentId\": 18,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"16.00\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                      \"width\": 20\n" +
                "                    }\n" +
                "                  ]\n" +
                "                },\n" +
                "                {\n" +
                "                  \"columns\": [\n" +
                "                    {\n" +
                "                      \"column\": 1,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422181299200\",\n" +
                "                      \"label\": \"做法\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422080635904\",\n" +
                "                      \"placeholder\": \"#{practice}\",\n" +
                "                      \"row\": 12,\n" +
                "                      \"systemComponentId\": 19,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"【炒】\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                      \"width\": 80\n" +
                "                    },\n" +
                "                    {\n" +
                "                      \"column\": 2,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422193882112\",\n" +
                "                      \"label\": \"做法价格\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422080635904\",\n" +
                "                      \"placeholder\": \"#{practicePrice}\",\n" +
                "                      \"row\": 12,\n" +
                "                      \"systemComponentId\": 20,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"1.00\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                      \"width\": 20\n" +
                "                    }\n" +
                "                  ]\n" +
                "                },\n" +
                "                {\n" +
                "                  \"columns\": [\n" +
                "                    {\n" +
                "                      \"column\": 1,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422202270720\",\n" +
                "                      \"label\": \"配料\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422080635904\",\n" +
                "                      \"placeholder\": \"#{burdening}\",\n" +
                "                      \"row\": 13,\n" +
                "                      \"systemComponentId\": 21,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"【葱x1】\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                      \"width\": 80\n" +
                "                    },\n" +
                "                    {\n" +
                "                      \"column\": 2,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422210659328\",\n" +
                "                      \"label\": \"配料价格\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422080635904\",\n" +
                "                      \"placeholder\": \"#{burdeningPrice}\",\n" +
                "                      \"row\": 13,\n" +
                "                      \"systemComponentId\": 22,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"1.00\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                      \"width\": 20\n" +
                "                    }\n" +
                "                  ]\n" +
                "                },\n" +
                "                {\n" +
                "                  \"columns\": [\n" +
                "                    {\n" +
                "                      \"column\": 1,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422223242240\",\n" +
                "                      \"label\": \"商品备注\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422080635904\",\n" +
                "                      \"placeholder\": \"#{memo}\",\n" +
                "                      \"row\": 14,\n" +
                "                      \"systemComponentId\": 23,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"【备注:多放肉】\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                      \"width\": 100\n" +
                "                    }\n" +
                "                  ]\n" +
                "                },\n" +
                "                {\n" +
                "                  \"columns\": [\n" +
                "                    {\n" +
                "                      \"column\": 1,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422231630848\",\n" +
                "                      \"label\": \"商品优惠名称\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422080635904\",\n" +
                "                      \"placeholder\": \"#{dishDiscountName}\",\n" +
                "                      \"row\": 15,\n" +
                "                      \"systemComponentId\": 503,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"【单品5折】\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                      \"width\": 60\n" +
                "                    },\n" +
                "                    {\n" +
                "                      \"column\": 2,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422240019456\",\n" +
                "                      \"label\": \"商品优惠价格\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422080635904\",\n" +
                "                      \"placeholder\": \"#{dishDiscountPrice}\",\n" +
                "                      \"row\": 15,\n" +
                "                      \"systemComponentId\": 504,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"-10.00\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                      \"width\": 40\n" +
                "                    }\n" +
                "                  ]\n" +
                "                }\n" +
                "              ],\n" +
                "              \"thead\": [\n" +
                "                {\n" +
                "                  \"column\": 1,\n" +
                "                  \"componentProperty\": \"{\\\"notRemove\\\":true,\\\"visiable\\\":\\\"#{goodSourceSize}!=0\\\"}\",\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"id\": \"153818422093218816\",\n" +
                "                  \"label\": \"商品\",\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"placeholder\": \"商品\",\n" +
                "                  \"row\": 10,\n" +
                "                  \"systemComponentId\": 10,\n" +
                "                  \"type\": \"thead\",\n" +
                "                  \"value\": \"商品\",\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"width\": 40\n" +
                "                },\n" +
                "                {\n" +
                "                  \"column\": 2,\n" +
                "                  \"componentProperty\": \"{\\\"visiable\\\":\\\"#{goodSourceSize}!=0\\\"}\",\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"id\": \"153818422101607424\",\n" +
                "                  \"label\": \"单价\",\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"placeholder\": \"单价\",\n" +
                "                  \"row\": 10,\n" +
                "                  \"systemComponentId\": 11,\n" +
                "                  \"type\": \"thead\",\n" +
                "                  \"value\": \"单价\",\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"width\": 20\n" +
                "                },\n" +
                "                {\n" +
                "                  \"column\": 3,\n" +
                "                  \"componentProperty\": \"{\\\"visiable\\\":\\\"#{goodSourceSize}!=0\\\"}\",\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"id\": \"153818422114190336\",\n" +
                "                  \"label\": \"数量\",\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"placeholder\": \"数量\",\n" +
                "                  \"row\": 10,\n" +
                "                  \"systemComponentId\": 12,\n" +
                "                  \"type\": \"thead\",\n" +
                "                  \"value\": \"数量\",\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"width\": 20\n" +
                "                },\n" +
                "                {\n" +
                "                  \"column\": 4,\n" +
                "                  \"componentProperty\": \"{\\\"visiable\\\":\\\"#{goodSourceSize}!=0\\\"}\",\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"id\": \"153818422122578944\",\n" +
                "                  \"label\": \"价格\",\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"placeholder\": \"价格\",\n" +
                "                  \"row\": 10,\n" +
                "                  \"systemComponentId\": 13,\n" +
                "                  \"type\": \"thead\",\n" +
                "                  \"value\": \"价格\",\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"width\": 20\n" +
                "                }\n" +
                "              ],\n" +
                "              \"type\": \"table\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"table\",\n" +
                "          \"showLine\": true,\n" +
                "          \"sort\": 10\n" +
                "        },\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"component\": {\n" +
                "                \"column\": 1,\n" +
                "                \"componentProperty\": \"{\\\"name\\\":\\\"goodTotal\\\"}\",\n" +
                "                \"label\": \"合计\",\n" +
                "                \"moduleId\": 3,\n" +
                "                \"row\": 16,\n" +
                "                \"systemComponentId\": 24,\n" +
                "                \"type\": \"tableFlag\",\n" +
                "                \"width\": 100\n" +
                "              },\n" +
                "              \"name\": \"goodTotal\",\n" +
                "              \"tableTitleLine\": false,\n" +
                "              \"tbody\": [\n" +
                "                {\n" +
                "                  \"columns\": [\n" +
                "                    {\n" +
                "                      \"column\": 1,\n" +
                "                      \"label\": \"合计\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"24\",\n" +
                "                      \"placeholder\": \"合计\",\n" +
                "                      \"row\": 16,\n" +
                "                      \"systemComponentId\": 25,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"合计\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                      \"width\": 60\n" +
                "                    },\n" +
                "                    {\n" +
                "                      \"column\": 2,\n" +
                "                      \"label\": \"合计数量\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"24\",\n" +
                "                      \"placeholder\": \"#{goodNumber}\",\n" +
                "                      \"row\": 16,\n" +
                "                      \"systemComponentId\": 26,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"1\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                      \"width\": 20\n" +
                "                    },\n" +
                "                    {\n" +
                "                      \"column\": 3,\n" +
                "                      \"label\": \"合计价格\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"24\",\n" +
                "                      \"placeholder\": \"#{goodPrice}\",\n" +
                "                      \"row\": 16,\n" +
                "                      \"systemComponentId\": 27,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"18.00\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                      \"width\": 20\n" +
                "                    }\n" +
                "                  ]\n" +
                "                }\n" +
                "              ],\n" +
                "              \"thead\": [],\n" +
                "              \"type\": \"table\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"table\",\n" +
                "          \"showLine\": false,\n" +
                "          \"sort\": 16\n" +
                "        },\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"column\": 1,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818422332294144\",\n" +
                "              \"label\": \"整单备注\",\n" +
                "              \"moduleId\": 3,\n" +
                "              \"placeholder\": \"整单备注:#{orderMemo}\",\n" +
                "              \"row\": 17,\n" +
                "              \"systemComponentId\": 28,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"整单备注:不要太辣\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "              \"width\": 100\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"basic\",\n" +
                "          \"showLine\": true,\n" +
                "          \"sort\": 17\n" +
                "        },\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"component\": {\n" +
                "                \"column\": 1,\n" +
                "                \"componentProperty\": \"{\\\"name\\\":\\\"privilege\\\"}\",\n" +
                "                \"documentTempletId\": \"131705436516290560\",\n" +
                "                \"id\": \"153818422357459968\",\n" +
                "                \"label\": \"优惠活动\",\n" +
                "                \"moduleId\": 3,\n" +
                "                \"placeholder\": \"#{privilegeSource}\",\n" +
                "                \"row\": 18,\n" +
                "                \"systemComponentId\": 29,\n" +
                "                \"type\": \"tableFlag\",\n" +
                "                \"width\": 100\n" +
                "              },\n" +
                "              \"name\": \"privilege\",\n" +
                "              \"tableTitle\": {\n" +
                "                \"column\": 1,\n" +
                "                \"documentTempletId\": \"131705436516290560\",\n" +
                "                \"id\": \"153818422365848576\",\n" +
                "                \"label\": \"优惠大类\",\n" +
                "                \"moduleId\": 3,\n" +
                "                \"parentId\": \"153818422357459968\",\n" +
                "                \"placeholder\": \"#{privilegeType}\",\n" +
                "                \"row\": 18,\n" +
                "                \"systemComponentId\": 30,\n" +
                "                \"type\": \"title\",\n" +
                "                \"value\": \"手动折扣\",\n" +
                "                \"valueStyle\": \"{\\\"fontSize\\\":\\\"2\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                \"width\": 100\n" +
                "              },\n" +
                "              \"tableTitleLine\": false,\n" +
                "              \"tbody\": [\n" +
                "                {\n" +
                "                  \"columns\": [\n" +
                "                    {\n" +
                "                      \"column\": 1,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422374237184\",\n" +
                "                      \"label\": \"优惠名称\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422357459968\",\n" +
                "                      \"placeholder\": \"#{privilegeTypeDetailName}\",\n" +
                "                      \"row\": 19,\n" +
                "                      \"systemComponentId\": 31,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"单品5折\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                      \"width\": 70\n" +
                "                    },\n" +
                "                    {\n" +
                "                      \"column\": 2,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422386820096\",\n" +
                "                      \"label\": \"优惠数量\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422357459968\",\n" +
                "                      \"placeholder\": \"#{privilegeTypeDetailNumber}\",\n" +
                "                      \"row\": 19,\n" +
                "                      \"systemComponentId\": 32,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"1/份\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                      \"width\": 10\n" +
                "                    },\n" +
                "                    {\n" +
                "                      \"column\": 3,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422395208704\",\n" +
                "                      \"label\": \"优惠价格\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422357459968\",\n" +
                "                      \"placeholder\": \"#{privilegeTypeDetailNameAmount}\",\n" +
                "                      \"row\": 19,\n" +
                "                      \"systemComponentId\": 33,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"-8.00\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                      \"width\": 20\n" +
                "                    }\n" +
                "                  ]\n" +
                "                }\n" +
                "              ],\n" +
                "              \"thead\": [],\n" +
                "              \"type\": \"table\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"table\",\n" +
                "          \"showLine\": true,\n" +
                "          \"sort\": 18\n" +
                "        },\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"component\": {\n" +
                "                \"column\": 1,\n" +
                "                \"componentProperty\": \"{\\\"name\\\":\\\"extraCharge\\\"}\",\n" +
                "                \"documentTempletId\": \"131705436516290560\",\n" +
                "                \"id\": \"153818422420374528\",\n" +
                "                \"label\": \"附加费\",\n" +
                "                \"moduleId\": 3,\n" +
                "                \"placeholder\": \"#{surchargeSource}\",\n" +
                "                \"row\": 20,\n" +
                "                \"systemComponentId\": 34,\n" +
                "                \"type\": \"grid\",\n" +
                "                \"width\": 100\n" +
                "              },\n" +
                "              \"name\": \"extraCharge\",\n" +
                "              \"tableTitleLine\": false,\n" +
                "              \"tbody\": [\n" +
                "                {\n" +
                "                  \"columns\": [\n" +
                "                    {\n" +
                "                      \"column\": 1,\n" +
                "                      \"componentProperty\": \"{\\\"visiable\\\":\\\"#{surchargeAmount}!=0\\\"}\",\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422432957440\",\n" +
                "                      \"label\": \"附加费名称\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422420374528\",\n" +
                "                      \"placeholder\": \"#{surchargeName}\",\n" +
                "                      \"row\": 20,\n" +
                "                      \"systemComponentId\": 35,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"包间费\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                      \"width\": 70\n" +
                "                    },\n" +
                "                    {\n" +
                "                      \"column\": 2,\n" +
                "                      \"componentProperty\": \"{\\\"visiable\\\":\\\"#{surchargeAmount}!=0\\\"}\",\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818422441346048\",\n" +
                "                      \"label\": \"附加费金额\",\n" +
                "                      \"moduleId\": 3,\n" +
                "                      \"parentId\": \"153818422420374528\",\n" +
                "                      \"placeholder\": \"#{surchargeAmount}\",\n" +
                "                      \"row\": 20,\n" +
                "                      \"systemComponentId\": 36,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"200.00\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                      \"width\": 30\n" +
                "                    }\n" +
                "                  ]\n" +
                "                }\n" +
                "              ],\n" +
                "              \"thead\": [],\n" +
                "              \"type\": \"table\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"table\",\n" +
                "          \"showLine\": true,\n" +
                "          \"sort\": 20\n" +
                "        }\n" +
                "      ],\n" +
                "      \"sort\": 3\n" +
                "    },\n" +
                "    {\n" +
                "      \"moduleId\": 8,\n" +
                "      \"moduleName\": \"底栏\",\n" +
                "      \"rows\": [\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"column\": 1,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818423582196736\",\n" +
                "              \"label\": \"服务员\",\n" +
                "              \"moduleId\": 8,\n" +
                "              \"placeholder\": \"服务员:#{waiter}\",\n" +
                "              \"row\": 21,\n" +
                "              \"systemComponentId\": 126,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"服务员:李四\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "              \"width\": 50\n" +
                "            },\n" +
                "            {\n" +
                "              \"column\": 2,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818423594779648\",\n" +
                "              \"label\": \"操作员\",\n" +
                "              \"moduleId\": 8,\n" +
                "              \"placeholder\": \"操作员:#{cashier}\",\n" +
                "              \"row\": 21,\n" +
                "              \"systemComponentId\": 127,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"操作员:王五\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "              \"width\": 50\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"basic\",\n" +
                "          \"showLine\": false,\n" +
                "          \"sort\": 21\n" +
                "        },\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"column\": 1,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818423607362560\",\n" +
                "              \"label\": \"开单\",\n" +
                "              \"moduleId\": 8,\n" +
                "              \"placeholder\": \"开单:#{openBillingTime}\",\n" +
                "              \"row\": 22,\n" +
                "              \"systemComponentId\": 128,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"开单:YYYY-MM-DD HH:MM:SS\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "              \"width\": 50\n" +
                "            },\n" +
                "            {\n" +
                "              \"column\": 2,\n" +
                "              \"documentTempletId\": \"131705436516290560\",\n" +
                "              \"id\": \"153818423619945472\",\n" +
                "              \"label\": \"打印\",\n" +
                "              \"moduleId\": 8,\n" +
                "              \"placeholder\": \"打印:#{printTime}\",\n" +
                "              \"row\": 22,\n" +
                "              \"systemComponentId\": 129,\n" +
                "              \"type\": \"text\",\n" +
                "              \"value\": \"打印:YYYY-MM-DD HH:MM:SS\",\n" +
                "              \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "              \"width\": 50\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"basic\",\n" +
                "          \"showLine\": false,\n" +
                "          \"sort\": 22\n" +
                "        },\n" +
                "        {\n" +
                "          \"components\": [\n" +
                "            {\n" +
                "              \"component\": {\n" +
                "                \"column\": 1,\n" +
                "                \"componentProperty\": \"{\\\"name\\\":\\\"shopInfo\\\"}\",\n" +
                "                \"documentTempletId\": \"131705436516290560\",\n" +
                "                \"id\": \"153818423636722688\",\n" +
                "                \"label\": \"商户信息\",\n" +
                "                \"moduleId\": 8,\n" +
                "                \"row\": 23,\n" +
                "                \"systemComponentId\": 130,\n" +
                "                \"type\": \"tableFlag\",\n" +
                "                \"width\": 100\n" +
                "              },\n" +
                "              \"name\": \"shopInfo\",\n" +
                "              \"tableTitleLine\": false,\n" +
                "              \"tbody\": [\n" +
                "                {\n" +
                "                  \"columns\": [\n" +
                "                    {\n" +
                "                      \"column\": 1,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818423645111296\",\n" +
                "                      \"label\": \"商户地址\",\n" +
                "                      \"moduleId\": 8,\n" +
                "                      \"parentId\": \"153818423636722688\",\n" +
                "                      \"placeholder\": \"#{shopAddress}\",\n" +
                "                      \"row\": 23,\n" +
                "                      \"systemComponentId\": 131,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"XX市XX地址\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"center\\\"}\",\n" +
                "                      \"width\": 100\n" +
                "                    }\n" +
                "                  ]\n" +
                "                },\n" +
                "                {\n" +
                "                  \"columns\": [\n" +
                "                    {\n" +
                "                      \"column\": 1,\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818423657694208\",\n" +
                "                      \"label\": \"商户电话号码\",\n" +
                "                      \"moduleId\": 8,\n" +
                "                      \"parentId\": \"153818423636722688\",\n" +
                "                      \"placeholder\": \"#{shopPhone}\",\n" +
                "                      \"row\": 24,\n" +
                "                      \"systemComponentId\": 132,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"15XXXXXXXXX\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"center\\\"}\",\n" +
                "                      \"width\": 100\n" +
                "                    }\n" +
                "                  ]\n" +
                "                },\n" +
                "                {\n" +
                "                  \"columns\": [\n" +
                "                    {\n" +
                "                      \"column\": 1,\n" +
                "                      \"componentProperty\": \"{\\\"customizable\\\":true}\",\n" +
                "                      \"documentTempletId\": \"131705436516290560\",\n" +
                "                      \"id\": \"153818423666082816\",\n" +
                "                      \"label\": \"商户自定义内容\",\n" +
                "                      \"moduleId\": 8,\n" +
                "                      \"parentId\": \"153818423636722688\",\n" +
                "                      \"placeholder\": \"欢迎下次光临\",\n" +
                "                      \"row\": 25,\n" +
                "                      \"systemComponentId\": 133,\n" +
                "                      \"type\": \"text\",\n" +
                "                      \"value\": \"欢迎下次光临\",\n" +
                "                      \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"center\\\"}\",\n" +
                "                      \"width\": 100\n" +
                "                    }\n" +
                "                  ]\n" +
                "                }\n" +
                "              ],\n" +
                "              \"thead\": [],\n" +
                "              \"type\": \"table\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"rowType\": \"table\",\n" +
                "          \"showLine\": false,\n" +
                "          \"sort\": 23\n" +
                "        }\n" +
                "      ],\n" +
                "      \"sort\": 4\n" +
                "    }\n" +
                "  ],\n" +
                "  \"name\": \"五六面馆自定义模板\",\n" +
                "  \"preview\": \"http://img.keruyun.net/3e241f20caa8439085fe77898254721e.png\",\n" +
                "  \"templateType\": \"结账单客户联\",\n" +
                "  \"version\": 1\n" +
                "}";
        //json ==> 模板对象
        TemplateVo template = JSON.parseObject(tempJson, TemplateVo.class);
        JSONObject templateJson = JSONObject.parseObject(tempJson);
        JSONArray modulesJson = templateJson.getJSONArray("modules");
        List<ModuleVo> moduleVoList = new ArrayList<>();
        for (int i = 0; i < modulesJson.size(); i++) {
            ModuleVo moduleVo = JSON.parseObject(modulesJson.getString(i), ModuleVo.class);
            JSONObject module = modulesJson.getJSONObject(i);
            JSONArray rows = module.getJSONArray("rows");
            List rowList = new ArrayList<RowVo>();
            for (int j = 0; j < rows.size(); j++) {
                RowVo rowVo = JSON.parseObject(rows.getString(j),RowVo.class);
                rowVo.setComponents(null);
                JSONObject row = rows.getJSONObject(j);
                //基础组件
                if (row.getString("rowType").equals("basic") || row.getString("rowType").equals("logo")) {
                    BaseComponent[] components = JSON.parseObject(row.getJSONArray("components").toJSONString(), BaseComponent[].class);
                    List<BaseComponent> baseComponents = Arrays.asList(components);
                    rowVo.setComponents(baseComponents);
                }
                //表格组件
                if (row.getString("rowType").equals("table")) {
                    TableComponent[] tableComponents = JSON.parseObject(row.getJSONArray("components").toJSONString(), TableComponent[].class);
                    List<TableComponent> tableComponentList = Arrays.asList(tableComponents);
                    rowVo.setComponents(tableComponentList);
                }
                rowList.add(rowVo);
            }
            moduleVo.setRows(rowList);
            moduleVoList.add(moduleVo);
        }
        template.setModules(moduleVoList);
        List<BaseComponent> componentList = new ArrayList<>();
        template.getModules().forEach(module -> {
            module.getRows().forEach(row -> {
                if (row.getRowType().equals("basic") || row.getRowType().equals("logo")) {
                    row.getComponents().forEach(component -> {
                        BaseComponent comp = (BaseComponent) component;
                        addNotNull(componentList, comp);
                        //componentList.add(comp);
                    });
                }
                if (row.getRowType().equals("table")) {
                    row.getComponents().forEach(component -> {
                        TableComponent tableComponent = (TableComponent) component;
                        addNotNull(componentList, tableComponent.getComponent());
                        addNotNull(componentList, tableComponent.getTableTitle());
                        //componentList.add(tableComponent.getComponent());
                        //componentList.add(tableComponent.getTableTitle());
                        addAllNotNull(componentList, tableComponent.getThead());
                        //componentList.addAll(tableComponent.getThead());
                        tableComponent.getTbody().forEach(tableRow -> {
                            addAllNotNull(componentList, tableRow.getColumns());
                            //componentList.addAll(tableRow.getColumns());
                        });

                    });
                }
            });
        });
        System.out.println(componentList);
        System.out.println(template);
    }*/

    private <T> List<T> addNotNull(List<T> list, T t) {
        if (t != null) {
            list.add(t);
        }
        return list;
    }

    private <T>  List<T> addAllNotNull(List<T> target,List<T> list) {
        if (!list.isEmpty()) {
            target.addAll(list);
        }
        return target;
    }

    @Test
    public void test2Template() {
        String templateJSon = "{\n" +
                "  \"name\": \"五六面馆自定义模板\",\n" +
                "  \"modules\": [\n" +
                "    {\n" +
                "      \"moduleId\": 1,\n" +
                "      \"moduleName\": \"标题\",\n" +
                "      \"moduleDesc\": \"定义商户LOGO & 票据名称（为避免打印失真，建议使用黑白商户logo图）\",\n" +
                "      \"moduleSort\": 1,\n" +
                "      \"chunks\": [\n" +
                "        {\n" +
                "          \"chunkType\": \"logo\",\n" +
                "          \"showLine\": false,\n" +
                "          \"chunkSort\": 1,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818421921252352\",\n" +
                "                  \"moduleId\": 1,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"label\": \"商户logo\",\n" +
                "                  \"value\": \"https://assets.2dfire.com/frontend/5a75e835c0b8c09f51acda09bdd68125.jpg\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"center\\\"}\",\n" +
                "                  \"placeholder\": \"#{shopLogo}\",\n" +
                "                  \"type\": \"logo\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkSort\": 1,\n" +
                "                  \"chunkType\": \"logo\",\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"chunkType\": \"basic\",\n" +
                "          \"showLine\": false,\n" +
                "          \"chunkSort\": 2,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818421933835264\",\n" +
                "                  \"systemComponentId\": 1,\n" +
                "                  \"moduleId\": 1,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"店铺名称\",\n" +
                "                  \"value\": \"店铺名称\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"4\\\",\\\"align\\\":\\\"center\\\"}\",\n" +
                "                  \"placeholder\": \"#{shopName}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": \"{\\\"customizable\\\":true}\",\n" +
                "                  \"chunkSort\": 1,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"chunkType\": \"basic\",\n" +
                "          \"showLine\": true,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"chunkSort\": 3,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818421946418176\",\n" +
                "                  \"systemComponentId\": 2,\n" +
                "                  \"moduleId\": 1,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"票据名称\",\n" +
                "                  \"value\": \"结账单\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"4\\\",\\\"align\\\":\\\"center\\\"}\",\n" +
                "                  \"placeholder\": \"#{ticketType}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkSort\": 3,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"moduleId\": 2,\n" +
                "      \"moduleName\": \"基础信息\",\n" +
                "      \"moduleDescribe\": \"配置桌台号、流水号、订单号等\",\n" +
                "      \"moduleSort\": 2,\n" +
                "      \"chunks\": [\n" +
                "        {\n" +
                "          \"chunkType\": \"basic\",\n" +
                "          \"chunkSort\": 4,\n" +
                "          \"showLine\": false,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818421971584000\",\n" +
                "                  \"systemComponentId\": 3,\n" +
                "                  \"moduleId\": 2,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"label\": \"桌台号\",\n" +
                "                  \"value\": \"桌台号:1\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"桌台号:#{tableNum}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 4,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"70\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818421984166912\",\n" +
                "                  \"systemComponentId\": 4,\n" +
                "                  \"moduleId\": 2,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"单水号\",\n" +
                "                  \"value\": \"单水号:1001\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"单水号:#{serialNum}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 4,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"30\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"chunkType\": \"basic\",\n" +
                "          \"chunkSort\": 5,\n" +
                "          \"showLine\": false,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818421996749824\",\n" +
                "                  \"systemComponentId\": 5,\n" +
                "                  \"moduleId\": 2,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"账单号\",\n" +
                "                  \"value\": \"账单号:201608221001\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"账单号:#{orderNum}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 5,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"80\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422009332736\",\n" +
                "                  \"systemComponentId\": 6,\n" +
                "                  \"moduleId\": 2,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"人数\",\n" +
                "                  \"value\": \"人数:2\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"人数:#{peopleNum}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 5,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"20\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818421971584000\",\n" +
                "                  \"systemComponentId\": 3,\n" +
                "                  \"moduleId\": 2,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"label\": \"桌台号\",\n" +
                "                  \"value\": \"桌台号:1\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"桌台号:#{tableNum}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 6,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"70\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818421984166912\",\n" +
                "                  \"systemComponentId\": 4,\n" +
                "                  \"moduleId\": 2,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"单水号\",\n" +
                "                  \"value\": \"单水号:1001\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"单水号:#{serialNum}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 6,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"30\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ],\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"showLine\": false,\n" +
                "          \"chunkType\": \"basic\",\n" +
                "          \"chunkSort\": 6\n" +
                "        },\n" +
                "        {\n" +
                "          \"chunkType\": \"basic\",\n" +
                "          \"chunkSort\": 7,\n" +
                "          \"showLine\": false,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422021915648\",\n" +
                "                  \"systemComponentId\": 7,\n" +
                "                  \"moduleId\": 2,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"会员\",\n" +
                "                  \"value\": \"会员:张三(150XXXXXXXX)\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"会员:#{memberNum}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 7,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"chunkType\": \"basic\",\n" +
                "          \"chunkSort\": 8,\n" +
                "          \"showLine\": false,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422038692864\",\n" +
                "                  \"systemComponentId\": 8,\n" +
                "                  \"moduleId\": 2,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"反结账原订单流水号\",\n" +
                "                  \"value\": \"反结账原订单流水号:2\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"反结账原订单流水号:#{reverseAccountOldOrderNum}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 8,\n" +
                "                  \"row\": \"8\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"chunkType\": \"basic\",\n" +
                "          \"chunkSort\": 9,\n" +
                "          \"showLine\": true,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422051275776\",\n" +
                "                  \"systemComponentId\": 553,\n" +
                "                  \"moduleId\": 2,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"就餐人数详情\",\n" +
                "                  \"value\": \"成人2位，儿童1位，老人1位\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"2\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"#{mealPeopleDetail}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 9,\n" +
                "                  \"row\": \"9\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"moduleId\": 3,\n" +
                "      \"moduleName\": \"订单明细\",\n" +
                "      \"moduleDescribe\": \"配置商品、单价、数量、总价等(\\\"商品第二语言\\\"适用于OS7.8以上版本)\",\n" +
                "      \"moduleSort\": 3,\n" +
                "      \"chunks\": [\n" +
                "        {\n" +
                "          \"chunkType\": \"table\",\n" +
                "          \"chunkSort\": 10,\n" +
                "          \"showLine\": true,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422093218816\",\n" +
                "                  \"systemComponentId\": 10,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"商品\",\n" +
                "                  \"value\": \"商品\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"商品\",\n" +
                "                  \"type\": \"thead\",\n" +
                "                  \"componentProperty\": \"{\\\"notRemove\\\":true,\\\"visiable\\\":\\\"#{goodSourceSize}!=0\\\"}\",\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"40\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422101607424\",\n" +
                "                  \"systemComponentId\": 11,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"单价\",\n" +
                "                  \"value\": \"单价\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"单价\",\n" +
                "                  \"type\": \"thead\",\n" +
                "                  \"componentProperty\": \"{\\\"visiable\\\":\\\"#{goodSourceSize}!=0\\\"}\",\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"20\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422114190336\",\n" +
                "                  \"systemComponentId\": 12,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"数量\",\n" +
                "                  \"value\": \"数量\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"数量\",\n" +
                "                  \"type\": \"thead\",\n" +
                "                  \"componentProperty\": \"{\\\"visiable\\\":\\\"#{goodSourceSize}!=0\\\"}\",\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"3\",\n" +
                "                  \"width\": \"20\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422122578944\",\n" +
                "                  \"systemComponentId\": 13,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"价格\",\n" +
                "                  \"value\": \"价格\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"价格\",\n" +
                "                  \"type\": \"thead\",\n" +
                "                  \"componentProperty\": \"{\\\"visiable\\\":\\\"#{goodSourceSize}!=0\\\"}\",\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"10\",\n" +
                "                  \"column\": \"4\",\n" +
                "                  \"width\": \"20\"\n" +
                "                }\n" +
                "              ],\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422143550464\",\n" +
                "                  \"systemComponentId\": 15,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": 10,\n" +
                "                  \"label\": \"商品\",\n" +
                "                  \"value\": \"1.回锅肉\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"#{good}\",\n" +
                "                  \"type\": \"tbody\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"2\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"40\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422151939072\",\n" +
                "                  \"systemComponentId\": 16,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": 11,\n" +
                "                  \"label\": \"单价\",\n" +
                "                  \"value\": \"16.00\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"#{price}\",\n" +
                "                  \"type\": \"tbody\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"2\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"20\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422164521984\",\n" +
                "                  \"systemComponentId\": 17,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": 12,\n" +
                "                  \"label\": \"数量\",\n" +
                "                  \"value\": \"1/份\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"#{number}\",\n" +
                "                  \"type\": \"tbody\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"2\",\n" +
                "                  \"column\": \"3\",\n" +
                "                  \"width\": \"20\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422172910592\",\n" +
                "                  \"systemComponentId\": 18,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": 13,\n" +
                "                  \"label\": \"价格\",\n" +
                "                  \"value\": \"16.00\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"#{amount}\",\n" +
                "                  \"type\": \"tbody\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"2\",\n" +
                "                  \"column\": \"4\",\n" +
                "                  \"width\": \"20\"\n" +
                "                }\n" +
                "              ],\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422181299200\",\n" +
                "                  \"systemComponentId\": 19,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": 10,\n" +
                "                  \"label\": \"做法\",\n" +
                "                  \"value\": \"【炒】\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"#{practice}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"3\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"80\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422193882112\",\n" +
                "                  \"systemComponentId\": 20,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": 13,\n" +
                "                  \"label\": \"做法价格\",\n" +
                "                  \"value\": \"1.00\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"#{practicePrice}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"3\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"20\"\n" +
                "                }\n" +
                "              ],\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422202270720\",\n" +
                "                  \"systemComponentId\": 21,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": 10,\n" +
                "                  \"label\": \"配料\",\n" +
                "                  \"value\": \"【葱x1】\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"#{burdening}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"4\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"80\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422210659328\",\n" +
                "                  \"systemComponentId\": 22,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": 13,\n" +
                "                  \"label\": \"配料价格\",\n" +
                "                  \"value\": \"1.00\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"#{burdeningPrice}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"4\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"20\"\n" +
                "                }\n" +
                "              ],\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422223242240\",\n" +
                "                  \"systemComponentId\": 23,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": 509,\n" +
                "                  \"label\": \"商品备注\",\n" +
                "                  \"value\": \"【备注:多放肉】\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"#{memo}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"5\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ],\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422231630848\",\n" +
                "                  \"systemComponentId\": 503,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": 10,\n" +
                "                  \"label\": \"商品优惠名称\",\n" +
                "                  \"value\": \"【单品5折】\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"#{dishDiscountName}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"6\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"60\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422240019456\",\n" +
                "                  \"systemComponentId\": 504,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422080635904\",\n" +
                "                  \"refId\": 13,\n" +
                "                  \"label\": \"商品优惠价格\",\n" +
                "                  \"value\": \"-10.00\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"#{dishDiscountPrice}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 10,\n" +
                "                  \"row\": \"6\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"40\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": null,\n" +
                "                  \"parentId\": 24,\n" +
                "                  \"refId\": null,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"label\": \"合计\",\n" +
                "                  \"value\": \"合计\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"合计\",\n" +
                "                  \"type\": \"tbody\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 11,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"60\",\n" +
                "                  \"systemComponentId\": 25\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": null,\n" +
                "                  \"parentId\": 24,\n" +
                "                  \"refId\": 12,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"label\": \"合计数量\",\n" +
                "                  \"value\": \"1\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"#{goodNumber}\",\n" +
                "                  \"type\": \"tbody\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 11,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"20\",\n" +
                "                  \"systemComponentId\": 26\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": null,\n" +
                "                  \"parentId\": 24,\n" +
                "                  \"refId\": 13,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"label\": \"合计价格\",\n" +
                "                  \"value\": \"18.00\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"#{goodPrice}\",\n" +
                "                  \"type\": \"tbody\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 11,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"3\",\n" +
                "                  \"width\": \"20\",\n" +
                "                  \"systemComponentId\": 27\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": null,\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"label\": \"合计\",\n" +
                "                  \"value\": null,\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": null,\n" +
                "                  \"placeholder\": null,\n" +
                "                  \"type\": \"tableFlag\",\n" +
                "                  \"componentProperty\": \"{\\\"name\\\":\\\"goodTotal\\\"}\",\n" +
                "                  \"sort\": 51,\n" +
                "                  \"row\": \"16\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\",\n" +
                "                  \"systemComponentId\": 24\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ],\n" +
                "          \"chunkType\": \"table\",\n" +
                "          \"chunkSort\": 11,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"showLine\": false\n" +
                "        },\n" +
                "        {\n" +
                "          \"showLine\": true,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"chunkType\": \"basic\",\n" +
                "          \"chunkSort\": 12,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422332294144\",\n" +
                "                  \"systemComponentId\": 28,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"整单备注\",\n" +
                "                  \"value\": \"整单备注:不要太辣\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"整单备注:#{orderMemo}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 12,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"showLine\": true,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"chunkType\": \"table\",\n" +
                "          \"chunkSort\": 13,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422365848576\",\n" +
                "                  \"systemComponentId\": 30,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422357459968\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"赠菜明细表\",\n" +
                "                  \"value\": \"赠菜明细\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"2\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"#{privilegeType}\",\n" +
                "                  \"type\": \"title\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 13,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ],\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422374237184\",\n" +
                "                  \"systemComponentId\": 31,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422357459968\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"优惠名称\",\n" +
                "                  \"value\": \"单品5折\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"#{privilegeTypeDetailName}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 13,\n" +
                "                  \"row\": \"2\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"70\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422386820096\",\n" +
                "                  \"systemComponentId\": 32,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422357459968\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"优惠数量\",\n" +
                "                  \"value\": \"1/份\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"#{privilegeTypeDetailNumber}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 13,\n" +
                "                  \"row\": \"2\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"10\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422395208704\",\n" +
                "                  \"systemComponentId\": 33,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422357459968\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"优惠价格\",\n" +
                "                  \"value\": \"-8.00\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"#{privilegeTypeDetailNameAmount}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 13,\n" +
                "                  \"row\": \"2\",\n" +
                "                  \"column\": \"3\",\n" +
                "                  \"width\": \"20\"\n" +
                "                }\n" +
                "              ],\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422357459968\",\n" +
                "                  \"systemComponentId\": 29,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"赠菜明细模块\",\n" +
                "                  \"value\": null,\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": null,\n" +
                "                  \"placeholder\": \"#{privilegeSource}\",\n" +
                "                  \"type\": \"tableFlag\",\n" +
                "                  \"componentProperty\": \"{\\\"name\\\":\\\"privilege\\\"}\",\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 13,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"showLine\": true,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"chunkType\": \"table\",\n" +
                "          \"chunkSort\": 14,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422432957440\",\n" +
                "                  \"systemComponentId\": 35,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422420374528\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"附加费名称\",\n" +
                "                  \"value\": \"包间费\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"#{surchargeName}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": \"{\\\"visiable\\\":\\\"#{surchargeAmount}!=0\\\"}\",\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 14,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"70\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818422441346048\",\n" +
                "                  \"systemComponentId\": 36,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818422420374528\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"附加费金额\",\n" +
                "                  \"value\": \"200.00\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"#{surchargeAmount}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": \"{\\\"visiable\\\":\\\"#{surchargeAmount}!=0\\\"}\",\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 14,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"30\"\n" +
                "                }\n" +
                "              ],\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818422420374528\",\n" +
                "                  \"systemComponentId\": 34,\n" +
                "                  \"moduleId\": 3,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"附加费\",\n" +
                "                  \"value\": null,\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": null,\n" +
                "                  \"placeholder\": \"#{surchargeSource}\",\n" +
                "                  \"type\": \"tableFlag\",\n" +
                "                  \"componentProperty\": \"{\\\"name\\\":\\\"extraCharge\\\"}\",\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 14,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"moduleId\": 8,\n" +
                "      \"moduleName\": \"底栏\",\n" +
                "      \"moduleDescribe\": \"配置服务员、时间、商户信息等\",\n" +
                "      \"moduleSort\": 8,\n" +
                "      \"chunks\": [\n" +
                "        {\n" +
                "          \"showLine\": false,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"chunkType\": \"basic\",\n" +
                "          \"chunkSort\": 15,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818423582196736\",\n" +
                "                  \"systemComponentId\": 126,\n" +
                "                  \"moduleId\": 8,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"服务员\",\n" +
                "                  \"value\": \"服务员:李四\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"服务员:#{waiter}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 15,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"50\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818423594779648\",\n" +
                "                  \"systemComponentId\": 127,\n" +
                "                  \"moduleId\": 8,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"操作员\",\n" +
                "                  \"value\": \"操作员:王五\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"操作员:#{cashier}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 15,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"50\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"showLine\": false,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"chunkType\": \"basic\",\n" +
                "          \"chunkSort\": 16,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818423607362560\",\n" +
                "                  \"systemComponentId\": 128,\n" +
                "                  \"moduleId\": 8,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"开单\",\n" +
                "                  \"value\": \"开单:YYYY-MM-DD HH:MM:SS\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"left\\\"}\",\n" +
                "                  \"placeholder\": \"开单:#{openBillingTime}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 16,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"50\"\n" +
                "                },\n" +
                "                {\n" +
                "                  \"id\": \"153818423619945472\",\n" +
                "                  \"systemComponentId\": 129,\n" +
                "                  \"moduleId\": 8,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"打印\",\n" +
                "                  \"value\": \"打印:YYYY-MM-DD HH:MM:SS\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"right\\\"}\",\n" +
                "                  \"placeholder\": \"打印:#{printTime}\",\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"basic\",\n" +
                "                  \"chunkSort\": 16,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"2\",\n" +
                "                  \"width\": \"50\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"showLine\": false,\n" +
                "          \"blankNumber\": 0,\n" +
                "          \"chunkType\": \"table\",\n" +
                "          \"chunkSort\": 17,\n" +
                "          \"rows\": [\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818423645111296\",\n" +
                "                  \"systemComponentId\": 131,\n" +
                "                  \"moduleId\": 8,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818423636722688\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"商户地址\",\n" +
                "                  \"value\": \"XX市XX地址\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"center\\\"}\",\n" +
                "                  \"placeholder\": \"#{shopAddress}\",\n" +
                "                  \"type\": \"tbody\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 17,\n" +
                "                  \"row\": \"1\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818423657694208\",\n" +
                "                  \"systemComponentId\": 132,\n" +
                "                  \"moduleId\": 8,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818423636722688\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"商户电话号码\",\n" +
                "                  \"value\": \"15XXXXXXXXX\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"center\\\"}\",\n" +
                "                  \"placeholder\": \"#{shopPhone}\",\n" +
                "                  \"type\": \"tbody\",\n" +
                "                  \"componentProperty\": null,\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 17,\n" +
                "                  \"row\": \"2\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818423666082816\",\n" +
                "                  \"systemComponentId\": 133,\n" +
                "                  \"moduleId\": 8,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": \"153818423636722688\",\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"商户自定义内容\",\n" +
                "                  \"value\": \"欢迎下次光临\",\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": \"{\\\"fontSize\\\":\\\"1\\\",\\\"align\\\":\\\"center\\\"}\",\n" +
                "                  \"placeholder\": \"欢迎下次光临\",\n" +
                "                  \"type\": \"tbody\",\n" +
                "                  \"componentProperty\": \"{\\\"customizable\\\":true}\",\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 17,\n" +
                "                  \"row\": \"3\",\n" +
                "                  \"column\": \"1\",\n" +
                "                  \"width\": \"100\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            {\n" +
                "              \"columns\": [\n" +
                "                {\n" +
                "                  \"id\": \"153818423636722688\",\n" +
                "                  \"systemComponentId\": 130,\n" +
                "                  \"moduleId\": 8,\n" +
                "                  \"documentTempletId\": \"131705436516290560\",\n" +
                "                  \"parentId\": null,\n" +
                "                  \"refId\": null,\n" +
                "                  \"label\": \"商户信息\",\n" +
                "                  \"value\": null,\n" +
                "                  \"labelStyle\": null,\n" +
                "                  \"valueStyle\": null,\n" +
                "                  \"placeholder\": null,\n" +
                "                  \"type\": \"tableFlag\",\n" +
                "                  \"componentProperty\": \"{\\\"name\\\":\\\"shopInfo\\\"}\",\n" +
                "                  \"chunkType\": \"table\",\n" +
                "                  \"chunkSort\": 17,\n" +
                "                  \"row\": null,\n" +
                "                  \"column\": null,\n" +
                "                  \"width\": null\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"templateType\": \"结账单客户联\",\n" +
                "  \"id\": \"88888\",\n" +
                "  \"preview\": \"http://img.keruyun.net/3e241f20caa8439085fe77898254721e.png\",\n" +
                "  \"version\": \"1\"\n" +
                "}";
    }
}