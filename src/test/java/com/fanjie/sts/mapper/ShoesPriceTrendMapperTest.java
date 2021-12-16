package com.fanjie.sts.mapper;

import com.alibaba.fastjson.JSONArray;
import com.fanjie.sts.entity.vo.ShoesPriceTrend;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author fanjie
 * @date 2021/12/16 23:08
 */
@SpringBootTest
class ShoesPriceTrendMapperTest {

    @Autowired
    private ShoesPriceTrendMapper shoesPriceTrendMapper;

    @Test
    void selectShoesPriceTrend() {
        List<ShoesPriceTrend> fw4255 = shoesPriceTrendMapper.selectShoesPriceTrend("FW4255");
        System.out.println(JSONArray.toJSONString(fw4255));
    }
}
