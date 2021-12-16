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
@TableName("product_price_info")
@Data
public class ProductPriceInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 商品尺码表
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer spuId;

    /**
     * 价格
     */
    private Long minPrice;

    /**
     * 关联商品的其他信息\
     */
    private Long skuId;

    private Integer faqType;

    private String inventoryNo;

    /**
     * 发货类型 0:普通现货 1:极速发货 2：闪电直发 3：香港直邮 95：95分二手
     */
    private Integer tradeType;

    /**
     * 原始json
     */
    private String originJson;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
