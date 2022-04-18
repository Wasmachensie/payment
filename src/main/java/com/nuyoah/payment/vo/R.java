package com.nuyoah.payment.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 8Nuyoah
 * @Date: 2022/04/18/12:28
 * @Description:
 * vo:value object值对象
 * R:封装需要在页面或者给前端的一些基本数据
 */
@Data
public class R {
    //响应码
    private Integer code;
    //响应消息
    private String msg;
    //响应中的数据
    private Map<String, Object> data = new HashMap<>();

    /**
     * 提供给前端的成功响应
     * @return
     */
    public static R ok() {
        R r = new R();
        r.setCode(0);
        r.setMsg("成功");
        return r;
    }

    /**
     * 提供给前端的失败响应
     * @return
     */
    public static R error() {
        R r = new R();
        r.setCode(-1);
        r.setMsg("失败");
        return r;
    }

    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

}
