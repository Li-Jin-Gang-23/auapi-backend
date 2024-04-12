package com.aurum.auapicommon.service;


import com.aurum.auapicommon.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 针对表【interface_info(接口信息)】的数据库操作Service
 */
public interface InnerInterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     */
    InterfaceInfo getInterfaceInfo(String path, String method);

}
