package com.nuyoah.payment.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nuyoah.payment.entity.RefundInfo;
import com.nuyoah.payment.mapper.RefundInfoMapper;
import com.nuyoah.payment.service.RefundInfoService;
import org.springframework.stereotype.Service;

@Service
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoMapper, RefundInfo> implements RefundInfoService {

}
