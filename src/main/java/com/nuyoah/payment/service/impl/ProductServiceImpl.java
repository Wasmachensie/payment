package com.nuyoah.payment.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nuyoah.payment.entity.Product;
import com.nuyoah.payment.mapper.ProductMapper;
import com.nuyoah.payment.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
