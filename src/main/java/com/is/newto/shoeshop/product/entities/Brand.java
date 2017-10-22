package com.is.newto.shoeshop.product.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table
public class Brand {

    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;
}
