package com.fanjie.sts.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author fanjie
 * @since 2021-12-16
 */
@TableName("product_details")
@Data
public class ProductDetails {

    private static final long serialVersionUID = 1L;

    /**
     * 商品信息
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品id
     */
    private Long productId;

    /**
     * 暂时知道是商品id
     */
    private Long spuId;

    /**
     * 商品图片地址
     */
    private String logoUrl;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 销售数量
     */
    private Long soldNum;

    /**
     * 货号
     */
    private String articleNumber;

    /**
     * 原始json
     */
    private String originJson;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
