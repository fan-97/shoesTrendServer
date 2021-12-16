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
@TableName("product_property")
@Data
public class ProductProperty {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Long spuId;

    private Long propertyId;

    /**
     * 属性名
     */
    private String name;

    /**
     * 属性值
     */
    private String value;

    /**
     * 属性值对应的id
     */
    private Long propertyValueId;

    private Long definitionId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
