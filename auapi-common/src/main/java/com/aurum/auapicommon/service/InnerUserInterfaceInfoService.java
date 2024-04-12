package com.aurum.auapicommon.service;


import com.aurum.auapicommon.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
 */
public interface InnerUserInterfaceInfoService extends IService<UserInterfaceInfo> {

    /**
     * 调用接口统计
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
