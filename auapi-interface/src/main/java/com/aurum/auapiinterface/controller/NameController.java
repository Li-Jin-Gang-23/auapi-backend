package com.aurum.auapiinterface.controller;

import com.aurum.auapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;
import com.aurum.auapiclientsdk.model.User;

import javax.servlet.http.HttpServletRequest;

/**
 * + 名称 API
 * +
 * + @Author Li_Jin_Gang
 * + @Date 2024/4/8 0008 18:20
 */

@RestController
@RequestMapping("name")
public class NameController {
    @GetMapping("/get")
    public String getNameByGet(String name, HttpServletRequest request) {
        System.out.println(request.getHeader("aurum"));
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
        // 从请求头中获取参数
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");

        //todo 实际情况应该是去数据库中查是否已分配给用户
//        if (!accessKey.equals("aurum")){
//            throw new RuntimeException("无权限");
//        }
        // 校验随机数，模拟一下，直接判断 nonce 是否大于10000
//        if (Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("无权限");
//        }

        // 时间和当前时间不能超过 5分钟
//        long timeMillis = System.currentTimeMillis() / 1000 - Long.parseLong(timestamp);
//        if (timeMillis > 5 * 60) {
//            throw new RuntimeException("无权限");
//        }

        // todo 实际情况应该是去数据库中查出 secretKey
//        String severSign = SignUtils.genSign(body, "auapi");
//        if (!sign.equals(severSign)) {
//            throw new RuntimeException("无权限");
//        }
        // todo 调用次数 +1
        return "POST 用户名字是" + user.getUsername();
    }
}
