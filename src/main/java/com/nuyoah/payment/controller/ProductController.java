package com.nuyoah.payment.controller;

import com.nuyoah.payment.entity.Product;
import com.nuyoah.payment.service.ProductService;
import com.nuyoah.payment.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author: 8Nuyoah
 * @Date: 2022/04/18/12:09
 * @Description:
 */
@Api(tags = "商品管理")
@RestController
@RequestMapping("Api/Product")
public class ProductController {

    @Resource
    private ProductService productService;

    @ApiOperation("测试接口")
    @GetMapping("/test")
    public R test(){
        return R.ok().data("msg","hello").data("now",new Date());
    }

    @GetMapping("/list")
    public R list(){
        List<Product> list = productService.list();
        return R.ok().data("productList",list);
    }
}
