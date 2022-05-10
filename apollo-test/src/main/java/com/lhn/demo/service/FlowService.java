package com.lhn.demo.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

/**
 * @author ：lhn
 * @description：TODO
 * @date ：2022/5/10 22:48
 */
@Service
public class FlowService {

    @SentinelResource(value = "com.lhn.demo.service.FlowService:test",
            blockHandler = "testblockHandler")
    public String test() {
        System.err.println("正常执行");
        return "test";
    }

    public String testblockHandler(BlockException ex) {
        System.err.println("流控执行, " + ex);
        return "流控执行";
    }
}



