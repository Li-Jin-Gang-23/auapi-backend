package com.aurum.springbootinit.service;

import com.aurum.springbootinit.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 接口调用统计
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
