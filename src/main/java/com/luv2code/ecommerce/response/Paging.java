package com.luv2code.ecommerce.response;

import lombok.Data;

public class Paging {
    public Paging(Integer number, Integer size, Long totalElements) {
        this.number = number;
        this.size = size;
        this.totalElements = totalElements;
    }

    public Integer number;
    public Integer size;
    public Long totalElements;

}
