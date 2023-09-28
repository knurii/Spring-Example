package com.example.lesson02;

import com.example.lesson02.bo.UsedGoodsBO;
import com.example.lesson02.domain.UsedGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // @Controller + @ResponseBody
public class Lesson02Ex01RestController {

    @Autowired //DI (Spring Bean을 주입한다, New를 안해도 사용할 수 있게)
    private UsedGoodsBO usedGoodsBO;

    // 요청 URL : http://localhost:80/lesson02/ex01
    @RequestMapping("/lesson02/ex01")
    public List<UsedGoods> ex01() {
        List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList(); //db에서 data 가져오게 종업원한테 시킴
        return usedGoodsList; // json response body에 담기게 됨
    }
}
