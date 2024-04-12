package com.aurum.springbootinit.service.impl.inner;

import com.aurum.auapicommon.model.entity.User;
import com.aurum.auapicommon.service.InnerUserService;
import com.aurum.springbootinit.common.ErrorCode;
import com.aurum.springbootinit.exception.BusinessException;
import com.aurum.springbootinit.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * +
 * +
 * + @Author Li_Jin_Gang
 * + @Date 2024/4/10 0010 22:06
 */

@DubboService
public class InnerUserServiceImpl extends ServiceImpl<UserMapper, User> implements InnerUserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 实现接口中的 getInvokeUser 方法，用于根据密钥获取内部用户信息。
     */
    @Override
    public User getInvokeUser(String accessKey) {
        // 参数校验
        if (StringUtils.isAnyBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 创建查询条件包装器
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);

        // 使用 UserMapper 的 selectOne 方法查询用户信息
        return userMapper.selectOne(queryWrapper);
    }
}
