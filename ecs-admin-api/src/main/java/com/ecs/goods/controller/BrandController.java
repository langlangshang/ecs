package com.ecs.goods.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ecs.entity.Brand;
import com.ecs.goods.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandController {
    @Reference
    BrandService brandService;

    @RequestMapping("hello")
    public String sayHello(){
        return  brandService.sayHello();
    }

    @RequestMapping("findAll")
    public List<Brand> findAll(Brand brand){

        return brandService.findAll();
    }

}
