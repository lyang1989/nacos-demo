package com.princeli.nacos.nacosdemo;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Properties;

/**
 * @author : princeli
 * @version 1.0
 * @className NacosSdkDemo
 * @date 2019-10-21 22:11
 * @description: TODO
 */
public class NacosSdkDemo {
    public static void main(String[] args) {
        String serverAddr = "localhost:8848";
        String dataId = "example";
        String groupId = "DEFAULT_GROUP";

        Properties properties = new Properties();
        properties.setProperty("serverAddr",serverAddr);


        try {
            ConfigService configService =  NacosFactory.createConfigService(properties);
            String content = configService.getConfig(dataId,groupId,3000);
            System.out.println(content);
        } catch (NacosException e) {
            e.printStackTrace();
        }


    }
}
