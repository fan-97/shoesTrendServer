package com.fanjie.sts.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author fanjie
 * @since 2021-12-16
 */
@TableName("sold_history")
@Data
public class SoldHistory {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 用户头像地址
     */
    private String avatar;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 格式化之后的时间 eg：x小时前
     */
    private String formatTime;

    private String orderSubTypeName;

    /**
     * 购买价格
     */
    private BigDecimal price;

    /**
     * 尺码
     */
    private String propertiesValues;

    /**
     * md5 json串 去重
     */
    private String md5;

    /**
     * 原始json串
     */
    private String originJson;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
