package com.is.newto.shoeshop.product.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class ProductItem {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true, nullable = false, updatable = false)
    private String hash;

    @ManyToOne
    private Product product;

    private int count;
    private int price;

    @ManyToOne
    private Category category;

    @OneToMany
    private List<ProductPhoto> photos;

    @OneToMany
    private List<PropertyValue> properties;

}
