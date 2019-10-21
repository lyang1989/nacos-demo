package com.princeli.nacos.nacosdemo;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : princeli
 * @version 1.0
 * @className NacosConfigController
 * @date 2019-10-21 21:59
 * @description: TODO
 */
@NacosPropertySource(dataId = "example",groupId = "DEFAULT_GROUP",autoRefreshed = true)
@RestController
public class NacosConfigController {

    @NacosValue(value = "${info:Hello Nacos}",autoRefreshed = true)
    private String info;

    @GetMapping("/get")
    public String get(){
        return info;
    }
}
