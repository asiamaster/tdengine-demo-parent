package com.dili;

import com.dili.ss.dto.DTOScan;
import com.dili.ss.retrofitful.annotation.RestfulScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 由MyBatis Generator工具自动生成
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.dili.demo.mapper", "com.dili.demo.tdmapper", "com.dili.ss.dao"})
@ComponentScan(basePackages={"com.dili.ss", "com.dili.demo"})
@RestfulScan({"com.dili.demo.rpc"})
@DTOScan(value={"com.dili.ss", "com.dili.demo.domain"})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
