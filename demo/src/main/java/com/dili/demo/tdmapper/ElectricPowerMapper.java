package com.dili.demo.tdmapper;

import com.dili.demo.tddomain.ElectricPower;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 电力Mapper
 */
@Component
public interface ElectricPowerMapper {

    /**
     * 插入
     * @param electricPower
     * @return
     */
    int insert(ElectricPower electricPower);

    /**
     * 批量插入
     * @param electricPowers
     * @return
     */
    int batchInsert(List<ElectricPower> electricPowers);

    /**
     * 列表查询
     * @param limit
     * @param offset
     * @return
     */
    List<ElectricPower> select(@Param("limit") Integer limit, @Param("offset") Integer offset);

    /**
     * 创建数据库
     */
    void createDB();

    /**
     * 创建表
     */
    void createTable();
}
