package com.luv2code.ecommerce.response;

import com.luv2code.ecommerce.entity.Product;
import lombok.Data;
import java.util.List;


@Data
public class ReponseProductByCategory {
    private List<Product> products;
    private Paging page;

    public void setPage(Paging page) {
        this.page = page;
    }
}


