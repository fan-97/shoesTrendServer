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

//    public static SizeInfo buildSizeInfo(String size, Long minPrice, Integer tradeType, LocalDateTime date) {
//        return new SizeInfo(size, minPrice, tradeType, date);
//    }

//    /**
//     * 尺码信息
//     */
//    @Data
//    @AllArgsConstructor
//    private static class SizeInfo {
//        private String size;
//        /**
//         * 最低价
//         */
//        private Long minPrice;
//        /**
//         * 发货类型 0:普通现货 1:极速发货 2：闪电直发 3：香港直邮 95：95分二手
//         */
//        private Integer tradeType;
//        /**
//         * 哪一天的价格
//         */
//        @JsonFormat(pattern = "yyyy-MM-dd")
//        private LocalDateTime date;
//    }

}
