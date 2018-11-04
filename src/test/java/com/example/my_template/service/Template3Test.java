/**
 * Copyright (C), 2008-2018, 杭州迪火科技有限公司
 * FileName: Template3Test
 * Author:   shugan
 * Date:     2018/11/3 13:30
 * Description:
 */
package com.example.my_template.service;

import ch.qos.logback.core.util.FileUtil;
import com.alibaba.fastjson.JSON;
import com.example.my_template.bo.Template;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * 〈〉
 *
 * @author shugan
 * @create 2018/11/3
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Template3Test {
    @Test
    public void test() throws IOException {

        File jsonFile = new File(this.getClass().getResource("/template.json").getFile());
        FileInputStream inputStream = new FileInputStream(jsonFile.getPath());
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        BufferedReader in  = new BufferedReader(inputStreamReader);
        StringBuilder jsonBuilder = new StringBuilder();
        String str;
        while ((str = in.readLine()) != null) {
            jsonBuilder.append(str);  //new String(str,"UTF-8")
        }
        in.close();

        String jsonTemp = jsonBuilder.toString();

        TemplateVo templateVo = JSON.parseObject(jsonTemp, TemplateVo.class);
        System.out.println(templateVo);
        List components = new ArrayList();
        templateVo.getModules().forEach(moduleVo -> {
            moduleVo.getChunks().forEach(chunk -> {
                chunk.getRows().forEach(row -> {
                    row.getColumns().forEach(baseComponent -> {
                        components.add(baseComponent);
                    });
                });
            });
        });
        System.out.println(components);
    }
}