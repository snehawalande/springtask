package com.springtask.springtask.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springtask.springtask.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{
}
