package com.fanjie.sts.mapper;

import com.alibaba.fastjson.JSONArray;
import com.fanjie.sts.entity.vo.ShoesPriceTrendEchartVo;
import com.fanjie.sts.service.ShoesPriceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author fanjie
 * @date 2021/12/16 23:08
 */
@SpringBootTest
class ShoesPriceTrendMapperTest {

    @Autowired
    private ShoesPriceTrendMapper shoesPriceTrendMapper;
    @Autowired
    private ShoesPriceService shoesPriceService;

    @Test
    void selectShoesPriceTrend() {
        ShoesPriceTrendEchartVo gv9872 = shoesPriceService.getPriceTrend("GV9872", null, null);

        System.out.println(JSONArray.toJSONString(gv9872));
    }
}
