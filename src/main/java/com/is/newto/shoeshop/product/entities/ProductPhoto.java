package com.is.newto.shoeshop.product.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class ProductPhoto {

    int order;

    @OneToMany
    private ProductItem productItem;

    @ManyToOne
    private Photo photo;
}
