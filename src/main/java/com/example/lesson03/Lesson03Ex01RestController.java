package com.example.lesson03;

import com.example.lesson03.domain.Review;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson03Ex01RestController {

    // 요청 URL : http://localhost/lesson03/ex01
    @RequestMapping("/lesson03/ex01")
    public Review ex01() {
        return ;
    }
}
