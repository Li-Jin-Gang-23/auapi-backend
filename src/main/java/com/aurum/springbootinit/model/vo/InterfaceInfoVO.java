package com.aurum.springbootinit.model.vo;

import com.aurum.auapicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * + 接口信息封装视图
 * +
 * + @Author Li_Jin_Gang
 * + @Date 2024/4/11 0011 17:25
 */

@EqualsAndHashCode(callSuper = true)
@Data
// 这里就继承InterfaceInfo，再补充一个调用次数的字段
public class InterfaceInfoVO extends InterfaceInfo {

    private static final long serialVersionUID = 1L;
    /**
     * 调用次数
     */
    private Integer totalNum;
}
