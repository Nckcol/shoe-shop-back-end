package com.is.newto.shoeshop.product.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Product {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String SKU;
    private String title;
    private String description;

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Category category;

    @OneToMany
    private List<ProductItem> items;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private List<Property> groupingProperties;
}
