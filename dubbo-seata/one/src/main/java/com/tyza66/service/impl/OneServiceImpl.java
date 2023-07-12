package com.tyza66.service.impl;

import com.tyza66.mapper.OneMapper;
import com.tyza66.service.TwoService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author: tyza66
 * Date: 2023/7/12 18:46
 * Github: https://github.com/tyza66
 **/

@Service
public class OneServiceImpl {

    @DubboReference(check = false)
    TwoService twoService;

    @Resource
    OneMapper oneMapper;

    @GlobalTransactional
    public void updateTwo() {
        twoService.updateOne();
        //int err = 1 / 0;
        oneMapper.updateOne();
    }
}
