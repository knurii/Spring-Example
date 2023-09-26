package com.example.lesson01;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/lesson01/ex01")
@RestController // = @Controller + @ResponseBody
public class Lesson01Ex01RestController {
    // String 출력
    // 요청 URL : http://localhost:8080/lesson01/ex01/3
    @RequestMapping("/3")
    public String ex01_3() {
        return "<h3>@RestController를 사용해 String을 리턴해본다.</h3>";
    }
    // Map -> JSON String 출력
    // 요청 URL : http://localhost:8080/lesson01/ex01/4
    @RequestMapping("/4")
    public Map<String, String> ex01_4() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1111");
        map.put("b", "1221");
        map.put("c", "1331");
        map.put("d", "1441");
        return map; // map => JSON
    }
    // 객체(내가 만든 클래스) -> JSON String 출력
    // 요청 URL : http://localhost:8080/lesson01/ex01/5
    @RequestMapping("/5")
    public Data ex01_5() {
        Data data = new Data(); // 일반 자바 bean(객체)
        data.setId(1);
        data.setName("누리");
        return data; // 일반 자바 빈 객체도 JSON으로 내려간다. (key-value)
    }
    // 요청 URL : http://localhost:8080/lesson01/ex01/6
    @RequestMapping("/6")
    public ResponseEntity<Data> ex01_6() {
        Data data = new Data(); // 일반 자바 bean(객체)
        data.setId(1);
        data.setName("누리");

        // return new ResponseEntity<>(data, HttpStatus.OK); // 200 OK
        return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR); // 500 error
    }
}
