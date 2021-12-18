package com.fanjie.sts.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
     * 尺码信息
     */
    @Data
    public class SizeInfo {
        private String size;
        /**
         * 最低价
         */
        private Long minPrice;
        /**
         * 发货类型 0:普通现货 1:极速发货 2：闪电直发 3：香港直邮 95：95分二手
         */
        private Integer tradeType;
        /**
         * 哪一天的价格
         */
        @JsonFormat(pattern = "yyyy-MM-dd")
        private LocalDateTime date;
    }
