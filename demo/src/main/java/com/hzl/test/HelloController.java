package com.hzl.test;

import com.hzl.test.bean.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hzl1050750
 * @Date 2021/2/19 11:41
 **/
@RestController
public class HelloController {

    @GetMapping("/")
    public Demo hello() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("小狼");
        return demo;
    }

}
