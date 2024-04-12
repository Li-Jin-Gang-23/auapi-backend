package com.aurum.springbootinit.service;

import com.aurum.auapicommon.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户接口信息服务
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
