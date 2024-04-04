    package com.springtask.springtask.service;
    
    import com.springtask.springtask.entity.Product;
    import com.springtask.springtask.entity.Review;
    import com.springtask.springtask.repository.ProductRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    
    import java.util.Collections;
    import java.util.List;
    import java.util.Optional;
    import java.util.stream.Collectors;
    
    @Service
    public class ProductService {
    
        @Autowired
        private ProductRepository productRepository;
    
        public List<Product> getAllProducts() {
            return productRepository.findAll();
        }
    
        public Optional<Product> getProductById(Long id) {
            return productRepository.findById(id);
        }
    
        public Product createOrUpdateProduct(Product product) {
            return productRepository.save(product);
        }
    
        public void deleteProduct(Long id) {
            productRepository.deleteById(id);
        }
    
        public List<Review> getReviewsByProductId(Long productId) {
            Optional<Product> product = productRepository.findById(productId);
            if (product.isPresent()) {
                // Filter reviews by customer
                return product.get().getReviews().stream()
                        .filter(review -> review.getCustomer() != null) // Assuming customer field exists in Review entity
                        .collect(Collectors.toList());
            } else {
                // Product not found, return empty list
                return Collections.emptyList();
            }
        }
    }
