package com.dili.demo.service;

import com.dili.demo.domain.User;
import com.dili.demo.mapper.ElectricPowerMapper;
import com.dili.demo.mapper.UserMapper;
import com.dili.demo.tddomain.ElectricPower;
import com.dili.ss.base.BaseServiceImpl;
import com.dili.ss.datasource.SwitchDataSource;
import com.dili.ss.domain.BaseOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: WM
 * @time: 2021/6/17 17:17
 */
@Service
@SwitchDataSource
public class UserService extends BaseServiceImpl<User, Long> {
    @Autowired
    ElectricPowerMapper electricPowerMapper;

    /**
     * 获取dao
     * @return
     */
    public UserMapper getActualDao() {
        return (UserMapper)getDao();
    }

    /**
     * 查询所有用户
     * @return
     */
    @SwitchDataSource
    public List<User> selectAll(){
        return getActualDao().selectAll();
    }

    /**
     * 查询电力
     * @return
     */
    @SwitchDataSource("ds1")
    public List<ElectricPower> selectElectricPower(){
        return electricPowerMapper.select(1, 0);
    }
    /**
     * 更新用户积分
     * @param id
     * @param point
     * @return
     */
    public BaseOutput updatePoint(Long id, Integer point){
        int i = getActualDao().updatePoint(id, point);
        return i > 0 ? BaseOutput.success() : BaseOutput.failure();
    }
}
