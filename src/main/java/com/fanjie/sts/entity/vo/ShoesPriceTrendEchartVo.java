package com.fanjie.sts.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 返回给前端进行echar图表渲染
 *
 * @author fanjie
 * @date 2021/12/17 14:34
 */
@Data
public class ShoesPriceTrendEchartVo {
    private String titleText;
    private String titleSubText;
    private Long spuId;
    private Set<String> date;
    private Set<String> legend;
    private List<SeriesData> seriesData;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static ShoesPriceTrendEchartVo getEchartVo(ShoesPriceTrend trend) {
        if (trend == null) {
            return null;
        }
        ShoesPriceTrendEchartVo vo = new ShoesPriceTrendEchartVo();
        vo.setTitleText(trend.getArticleNumber());
        vo.setTitleSubText(trend.getTitle());
        vo.setSpuId(trend.getSpuId());

        List<SeriesData> seriesData = new ArrayList<>();
        vo.setSeriesData(seriesData);

        Set<String> date = trend.getSizeInfoList().stream().map(size -> size.getDate().format(FORMATTER)).collect(Collectors.toSet());
        vo.setDate(date);

        Set<String> legend = trend.getSizeInfoList().stream().map(SizeInfo::getSize).collect(Collectors.toSet());
        vo.setLegend(legend);

        Map<String, List<SizeInfo>> map = trend.getSizeInfoList().stream().collect(Collectors.groupingBy(SizeInfo::getSize));
        List<SeriesData> seriesDataList = new ArrayList<>();
        vo.setSeriesData(seriesDataList);
        map.forEach((k, v) -> {
            List<Long> priceList = v.stream().map(SizeInfo::getMinPrice).collect(Collectors.toList());
            seriesDataList.add(new SeriesData(k, priceList));
        });
        return vo;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class SeriesData {
        private String size;
        private List<Long> price;

    }
}
