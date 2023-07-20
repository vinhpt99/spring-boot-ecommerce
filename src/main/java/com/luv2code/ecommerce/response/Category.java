package com.luv2code.ecommerce.response;

import com.luv2code.ecommerce.entity.ProductCategory;
import lombok.Data;

import java.util.List;

@Data
public class Category {
    private List<ProductCategory> productCategory;
}
