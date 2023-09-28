package com.example.lesson02.bo;

import com.example.lesson02.domain.UsedGoods;
import com.example.lesson02.mapper.UsedGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsedGoodsBO {

    @Autowired //spring bean(객체) 가져오는 것 - Dependency Injection = DI
    private UsedGoodsMapper usedGoodsMapper;

    // input : Controller로부터 요청 받음 -> controller는 다 달라고 했기 때문에 파라미터가 없음
    // output : Controller한테 돌려줌 -> List<UsedGoods>를 돌려주기만 하면 됨
    public List<UsedGoods> getUsedGoodsList() {
        return usedGoodsMapper.selectUsedGoodsList();
    }


}
