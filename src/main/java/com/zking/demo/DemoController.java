package com.zking.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hyq
 * @create 2019-02-16 15:46
 */
@RestController
public class DemoController {

    @RequestMapping("/d")
    public void demo(){
        System.out.println("这是我的一个文件。");
    }
}
