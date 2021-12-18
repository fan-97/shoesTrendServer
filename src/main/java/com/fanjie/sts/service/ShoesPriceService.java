package com.fanjie.sts.service;

import com.fanjie.sts.entity.vo.ShoesPriceTrend;
import com.fanjie.sts.entity.vo.ShoesPriceTrendEchartVo;

import java.util.List;
import java.util.Map;

/**
 * @author fanjie
 * @date 2021/12/16 22:57
 */
public interface ShoesPriceService {
    /**
     * 获取所有的价格趋势
     * @return
     */
    Map<String,List<ShoesPriceTrend>> getAllPriceTrend();

    /**
     * 根据参数获取价格趋势
     * @param articleNumber 货号
     * @param startTime 默认最近七天
     * @param endTime
     * @return key:尺码
     */
    ShoesPriceTrendEchartVo getPriceTrend(String articleNumber, String startTime, String endTime);
}
