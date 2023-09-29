package com.example.lesson03;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.domain.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson03Ex01RestController {

    @Autowired
    private ReviewBO reviewBO;

    // 요청 URL : http://localhost/lesson03/ex01
    // 요청 URL : http://localhost/lesson03/ex01?id=5
    @RequestMapping("/lesson03/ex01")
    public Review ex01(
            @RequestParam("id") int id // 필수 파라미터
            // @RequestParam(value = "id") int id // 필수 파라미터 = Id를 안보내면 에러 발생
            // @RequestParam(value = "id", required = true) int id // 필수 파라미터
            // @RequestParam(value = "id", required = false) Integer id // 비필수 파라미터
            // @RequestParam(value = "id", defaultValue = "1") int id // 비필수 파라미터이고 디폴트 값은 1
            ) {
        return reviewBO.getReview(id);
    } // response body -> json
}
