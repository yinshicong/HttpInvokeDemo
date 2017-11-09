package com.demo.dto;

import java.io.Serializable;

/**
 * Created by Max on 2017/3/10.
 */
public class ProductDto implements Serializable {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
