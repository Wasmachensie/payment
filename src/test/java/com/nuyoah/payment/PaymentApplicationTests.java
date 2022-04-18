package com.nuyoah.payment;

import com.nuyoah.payment.config.WxPayConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.security.PrivateKey;

@SpringBootTest
class PaymentApplicationTests {

    @Resource
    private WxPayConfig wxPayConfig;

    //获取商户的私钥
    /*@Test
    void testGetPrivateKey() {
        //获取私钥路径
        String privateKeyPath = wxPayConfig.getPrivateKeyPath();
        //获取私钥
        PrivateKey privateKey = wxPayConfig.getPrivateKey(privateKeyPath);
        System.out.println(privateKey);
    }*/

}
