package com.example.lesson02;

import com.example.lesson02.domain.UsedGoods;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // @Controller + @ResponseBody
public class Lesson02Ex01RestController {

    // 요청 URL : http://localhost:80/lesson02/ex01
    @RequestMapping("/lesson02/ex01")
    public List<UsedGoods> ex01() {
        List<UsedGoods> usedGoodsList = ; //db에서 data 가져오게 종업원한테 시킴
        return usedGoodsList;
    }
}
