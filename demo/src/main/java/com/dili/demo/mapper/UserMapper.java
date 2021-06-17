package com.dili.demo.mapper;

import com.dili.demo.domain.User;
import com.dili.ss.base.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends MyMapper<User> {

    /**
     * 更新用户积分
     * @param id
     * @param point
     * @return
     */
    int updatePoint(@Param("id") Long id, @Param("point") Integer point);
}