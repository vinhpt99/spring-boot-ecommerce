package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.dao.ProductRepository;
import com.luv2code.ecommerce.entity.Product;
import com.luv2code.ecommerce.response.Paging;
import com.luv2code.ecommerce.response.ReponseProductByCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @CrossOrigin
    @RequestMapping(value = "/api/products/search/findByCategoryId", method = RequestMethod.GET)
    public ResponseEntity<Object> findByCategoryId(@RequestParam("id") long id,
                                                   @RequestParam("page") Integer page,
                                                   @RequestParam("size") Integer size)
    {
          Page<Product> pageOfProduct = productRepository.findAll(PageRequest.of(page, size));
          ReponseProductByCategory response = new ReponseProductByCategory();
          response.setPage(new Paging(page, size, pageOfProduct.getTotalElements()));
          response.setProducts(pageOfProduct.getContent());
          return ResponseEntity.ok().body(response);
    }
}




