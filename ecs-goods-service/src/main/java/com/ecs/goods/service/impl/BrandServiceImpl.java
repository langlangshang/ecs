package com.ecs.goods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ecs.entity.Brand;
import com.ecs.goods.service.BrandService;
import com.ecs.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandMapper brandMapper;
    @Override
    public String sayHello() {
        return "你好";
    }

    @Override
    public List<Brand> findAll() {


        return brandMapper.findAll();
    }
}
