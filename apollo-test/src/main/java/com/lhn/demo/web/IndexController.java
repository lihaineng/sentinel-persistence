package com.lhn.demo.web;

import com.lhn.demo.service.FlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：lhn
 * @description：TODO
 * @date ：2022/5/10 22:47
 */
@RestController
public class IndexController {

    @Autowired
    private FlowService flowService;

    @RequestMapping("/test")
    public String test() {
        return flowService.test();
    }

}
