package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: danghongbo
 * ===============================
 * Created with IDEA
 * Date: 2024/5/13
 * Time: 20:41
 * ===============================
 */

/**
 * 1、整合Mybatis-plus
 *      1-1:导入依赖
 *      1-2:配置
 *          1-2-1: 配置数据源
 *              1) 导入数据库的驱动
 *              2) 在application.yml配置数据源相关信息
 *          1-2-2: 配置Mybatis-Plus
 *              1) 使用MapperScan
 *              2）告诉Mybatis-Plus， sql映射位置
 *
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }
}
