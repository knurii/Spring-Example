package com.example.lesson03.bo;

import com.example.lesson03.domain.Review;
import com.example.lesson03.mapper.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewBO {
    @Autowired
    private ReviewMapper reviewMapper;

    // input :
    // output : Review(단건)
    public Review getReview(int id) {
        return reviewMapper.selectReview(id);
    }
}
