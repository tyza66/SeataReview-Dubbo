package com.tyza66.mapper;

import org.apache.ibatis.annotations.Update;

/**
 * Author: tyza66
 * Date: 2023/7/12 18:35
 * Github: https://github.com/tyza66
 **/

public interface TwoMapper{
    @Update("UPDATE `two`.`two` SET `num` = `num` + 1 WHERE `id` = 1")
    void updateOne();
}
