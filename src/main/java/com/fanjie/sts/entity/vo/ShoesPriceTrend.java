package com.fanjie.sts.entity.vo;

import lombok.Data;

import java.util.List;

/**
 * @author fanjie
 * @date 2021/12/16 21:46
 */
@Data
public class ShoesPriceTrend {
    private Long spuId;
    private String title;
    private String articleNumber;

    private List<SizeInfo> sizeInfoList;

}
