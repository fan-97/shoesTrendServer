package com.fanjie.sts.controller;

import com.fanjie.sts.common.ApiResponse;
import com.fanjie.sts.service.ShoesPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanjie
 * @date 2021/12/16 21:40
 */
@RestController
@RequestMapping("/shoes/trend")
public class ShoesTrendController {

    @Autowired
    private ShoesPriceService shoesPriceService;

    @GetMapping()
    public ApiResponse getSHoesTrend(String articleNumber, String startTime, String endTime) {
        return ApiResponse.success(shoesPriceService.getPriceTrend(articleNumber, startTime, endTime));
    }
}
