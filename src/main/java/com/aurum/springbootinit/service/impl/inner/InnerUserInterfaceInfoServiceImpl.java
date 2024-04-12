package com.aurum.springbootinit.service.impl.inner;

import com.aurum.auapicommon.model.entity.UserInterfaceInfo;
import com.aurum.auapicommon.service.InnerUserInterfaceInfoService;
import com.aurum.springbootinit.mapper.UserInterfaceInfoMapper;
import com.aurum.springbootinit.service.UserInterfaceInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * +
 * +
 * + @Author Li_Jin_Gang
 * + @Date 2024/4/10 0010 22:08
 */

@DubboService
public class InnerUserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo> implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        // 调用注入的 UserInterfaceInfoService 的 invokeCount 方法
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }
}
