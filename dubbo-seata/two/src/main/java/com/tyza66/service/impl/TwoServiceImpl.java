package com.tyza66.service.impl;

import com.tyza66.mapper.TwoMapper;
import com.tyza66.service.TwoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author: tyza66
 * Date: 2023/7/12 18:40
 * Github: https://github.com/tyza66
 **/

@DubboService
public class TwoServiceImpl implements TwoService {
    @Resource
    TwoMapper twoMapper;

    public void updateOne() {
        twoMapper.updateOne();
    }
}
