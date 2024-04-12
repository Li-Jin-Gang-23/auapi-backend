package com.aurum.springbootinit.service.impl.inner;

import com.aurum.auapicommon.model.entity.InterfaceInfo;
import com.aurum.auapicommon.service.InnerInterfaceInfoService;
import com.aurum.springbootinit.common.ErrorCode;
import com.aurum.springbootinit.exception.BusinessException;
import com.aurum.springbootinit.mapper.InterfaceInfoMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * +
 * +
 * + @Author Li_Jin_Gang
 * + @Date 2024/4/10 0010 22:08
 */

@DubboService
public class InnerInterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo> implements InnerInterfaceInfoService {
    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    /**
     * 实现接口中的 getInterfaceInfo 方法，用于根据URL和请求方法获取内部接口信息。
     *
     * @param url    请求URL
     * @param method 请求方法
     * @return 内部接口信息，如果找不到匹配的接口则返回 null
     * @throws BusinessException 参数错误时抛出业务异常
     */
    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        // 参数校验
        if (StringUtils.isAnyBlank(url, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 创建查询条件包装器
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url", url);
        queryWrapper.eq("method", method);

        // 使用 InterfaceInfoMapper 的 selectOne 方法查询接口信息
        return interfaceInfoMapper.selectOne(queryWrapper);
    }
}
