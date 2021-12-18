package com.fanjie.sts.service.impl;

import com.fanjie.sts.common.exception.StsRuntimeException;
import com.fanjie.sts.entity.vo.ShoesPriceTrend;
import com.fanjie.sts.entity.vo.ShoesPriceTrendEchartVo;
import com.fanjie.sts.mapper.ShoesPriceTrendMapper;
import com.fanjie.sts.service.ShoesPriceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * @author fanjie
 * @date 2021/12/16 22:57
 */
@Service
@Slf4j
@AllArgsConstructor
public class ShoesPriceServiceImpl implements ShoesPriceService {
    private final ShoesPriceTrendMapper shoesPriceTrendMapper;

    @Override
    public Map<String, List<ShoesPriceTrend>> getAllPriceTrend() {
        return null;
    }

    @Override
    public ShoesPriceTrendEchartVo getPriceTrend(String articleNumber, String startTime, String endTime) {
        if(StringUtils.isEmpty(articleNumber)){
            throw new StsRuntimeException("货号不能为空！");
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = LocalDateTime.now().minusDays(7).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        }
        if (StringUtils.isEmpty(endTime)) {
            endTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        }
        List<ShoesPriceTrend> priceTrends = shoesPriceTrendMapper.selectShoesPriceTrend(articleNumber, startTime, endTime);
        if (CollectionUtils.isEmpty(priceTrends)) {
            return null;
        }
        return ShoesPriceTrendEchartVo.getEchartVo(priceTrends.get(0));
    }
}
