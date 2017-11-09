package com.demo.service;

import com.demo.dto.ProductDto;

/**
 * Created by Max on 2017/3/10.
 */
public class ProductServiceImpl implements ProductService {
    public ProductDto getProductByName(String name) {

        ProductDto productDto = new ProductDto();
        productDto.setId(1);
        productDto.setName("光明牛奶");
        return productDto;

    }
}
