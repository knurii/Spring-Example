package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lesson01Ex02Controller {
    // 요청 URL : http://localhost/lesson01/ex02
    @RequestMapping("/lesson01/ex02")
    public String ex02() {
        // 어느 jsp로 뿌려줄거다 쓰면 자동으로 찾아줌
        // jsp 경로를 리턴한다.
        // 응답값은 Jsp 경로가 되면서 Jsp가 Html로 해석이 되고 response body에 담겨서 내려감
        // return "/WEB-INF/jsp/lesson01/ex02.jsp"; 원래는 이렇게 하는데 prefix랑 suffix 설정해둬서 안됨
        // /WEB-INF/jsp/   중간경로   .jsp
        return "lesson01/ex02"; // jsp view 경로와 이름
    }
}
