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
@TableName("product_sku")
@Data
public class ProductSku {

    private static final long serialVersionUID = 1L;

    /**
     * 商品skus
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Long skuId;

    private Long spuId;

    private Long propertyValueId;

    private Integer propertyLevel;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
