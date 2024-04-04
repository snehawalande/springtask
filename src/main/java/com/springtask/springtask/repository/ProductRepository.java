package com.springtask.springtask.repository;
import com.springtask.springtask.entity.Product;
import com.springtask.springtask.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
