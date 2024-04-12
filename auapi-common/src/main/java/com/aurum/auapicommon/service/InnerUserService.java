package com.aurum.auapicommon.service;


import com.aurum.auapicommon.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户服务
 */
public interface InnerUserService extends IService<User> {

    /**
     * 数据库中查是否已分配给用户秘钥（accessKey）
     */
    User getInvokeUser(String accessKey);


}
