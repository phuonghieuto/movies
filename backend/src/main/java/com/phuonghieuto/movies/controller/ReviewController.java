package com.phuonghieuto.movies.controller;

import com.phuonghieuto.movies.entity.Review;
import com.phuonghieuto.movies.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "*")
public class ReviewController {
    private ReviewService reviewService;
    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
