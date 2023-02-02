package top.roud.nacosdemo.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description : TODO
 * @author: guangrui_hu
 * @date: 2023/2/2
 * @version:
 */
@RestController
@RequestMapping("nacosdemo")
@RefreshScope
public class DemoCotroller {
    @Value("${user.id}")
    private String id;
    @Value("${user.name}")
    private String name;
    @Value("${user.age}")
    private String age;

    @GetMapping("/test")
    public String test(){
        return "大家好，我是练习时长两年半的个人练习生，id为"+id+"，名字叫"+name+"，今年"+age+"岁。";
    }
}
