package com.springtask.springtask.service;

import com.springtask.springtask.entity.Review;
import com.springtask.springtask.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Optional<Review> getReviewById(Long id) {
        return reviewRepository.findById(id);
    }

    public Review createOrUpdateReview(Review review) {
        return reviewRepository.save(review);
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }

        public List<Review> getReviewsByCustomerId(Long customerId) {
            return reviewRepository.findByCustomerCustomerId(customerId);
        }

}

