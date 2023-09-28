package com.example.lesson02.mapper;

import com.example.lesson02.domain.UsedGoods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsedGoodsMapper {
    // input (BO-Service 요청) : X
    // output (BO-Service 결과 돌려줌) : List<UsedGoods>
    public List<UsedGoods> selectUsedGoodsList();
}
