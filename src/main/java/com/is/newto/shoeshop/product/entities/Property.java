package com.is.newto.shoeshop.product.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Property {

    @ManyToMany(mappedBy = "groupingProperties")
    private Product product;
}
