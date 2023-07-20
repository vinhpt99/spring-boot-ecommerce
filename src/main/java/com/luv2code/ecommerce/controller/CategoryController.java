package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.dao.ProductCategoryRepository;
import com.luv2code.ecommerce.entity.ProductCategory;
import com.luv2code.ecommerce.response.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//http://localhost:8080/api/product-category
@RestController
public class CategoryController {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;
    @CrossOrigin
    @RequestMapping(value = "/api/product-category", method = RequestMethod.GET)

    public ResponseEntity<Object> productCategory() {
        Category responseCategory  = new Category();
        responseCategory.setProductCategory(productCategoryRepository.findAll());
        return ResponseEntity.ok().body(responseCategory);
    }

}
