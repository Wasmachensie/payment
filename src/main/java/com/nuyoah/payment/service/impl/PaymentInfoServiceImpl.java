package com.nuyoah.payment.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nuyoah.payment.entity.PaymentInfo;
import com.nuyoah.payment.mapper.PaymentInfoMapper;
import com.nuyoah.payment.service.PaymentInfoService;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

}
