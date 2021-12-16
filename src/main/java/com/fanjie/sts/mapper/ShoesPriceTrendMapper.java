package com.fanjie.sts.mapper;

import com.fanjie.sts.entity.vo.ShoesPriceTrend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author fanjie
 * @date 2021/12/16 22:58
 */
public interface ShoesPriceTrendMapper {

    /**
     * 根据货号获取价格趋势
     * @param articleNumber
     * @return
     */
    List<ShoesPriceTrend> selectShoesPriceTrend(@Param("articleNumber") String articleNumber);
}
