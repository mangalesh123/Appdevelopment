package com.lingesh.stockmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lingesh.stockmanagement.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}
