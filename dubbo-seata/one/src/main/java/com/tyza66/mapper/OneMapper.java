package com.tyza66.mapper;

import org.apache.ibatis.annotations.Update;

/**
 * Author: tyza66
 * Date: 2023/7/12 18:34
 * Github: https://github.com/tyza66
 **/

public interface OneMapper {

    @Update("UPDATE `one`.`one` SET `num` = `num` - 1 WHERE `id` = 1")
    void updateOne();
}
