package com.example.product;

import com.atguigu.gulimall.product.GulimallProductApplication;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GulimallProductApplication.class)
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(2L);
//        brandEntity.setDescript("遥遥领先");
//        brandEntity.setName("华为");
//        brandService.updateById(brandEntity);
//        System.out.println("保存成功....");

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 2));
        list.forEach((item) -> {
            System.out.println(item);
        });
    }

}
