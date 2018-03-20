package com.leoIt.crm.service.impl;

import com.google.common.collect.Lists;
import com.leoIt.crm.service.TestDubboService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDubboServiceImpl implements TestDubboService {
    @Override
    public List<String> listName() {
        List<String> nameList = Lists.newLinkedList();
        nameList.add("张无忌");
        nameList.add("高圆圆");
        nameList.add("赵敏");
        nameList.add("法轮狮王");
        nameList.add("孙悟空");
        return nameList;
    }
}
