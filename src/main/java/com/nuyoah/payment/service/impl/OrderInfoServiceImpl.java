package com.nuyoah.payment.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nuyoah.payment.entity.OrderInfo;
import com.nuyoah.payment.mapper.OrderInfoMapper;
import com.nuyoah.payment.service.OrderInfoService;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
