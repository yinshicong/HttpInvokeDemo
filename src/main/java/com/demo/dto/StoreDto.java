package com.demo.dto;

import java.io.Serializable;

/**
 * Created by Max on 2017/3/9.
 */
public class StoreDto implements Serializable{

    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
