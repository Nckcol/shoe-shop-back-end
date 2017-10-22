package com.is.newto.shoeshop.product.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Photo {

    private ProductPhoto productPhoto;

    private String name;
    private String namespace;
}
