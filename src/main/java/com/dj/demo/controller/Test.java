package com.dj.demo.controller;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: demo_jenkins
 * @Package: com.dj.demo.controller
 * @ClassName: Test
 * @Author: cqj
 * @Description: 测试i
 * @Date: 2020/11/3 22:43
 * @Version: 1.0
 */
@RestController
public class Test {

    @RequestMapping("studentCourseShow")
    public String studentCourseShow() {
        System.out.println("123");
        return "hello";
    }

}
