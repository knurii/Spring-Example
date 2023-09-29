package com.example.lesson03.mapper;

import com.example.lesson03.domain.Review;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewMapper {
    public Review selectReview(int id);
}
