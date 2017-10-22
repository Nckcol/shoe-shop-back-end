package com.is.newto.shoeshop.product;

import com.is.newto.shoeshop.product.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;


@RestController
@RequestMapping("/products")
public class ProductRestController {

    private final ProductRepository productRepository;

    @Autowired
    ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    Collection<Product> getList(@RequestParam("skip") int skip, @RequestParam("count") int count) {
        return this.productRepository.findPaginated(skip, count);
    }

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody Product input) {
        Product result = productRepository.save(new Product(input.uri, input.description));
        return ResponseEntity.ok().build();
        //else ResponseEntity.noContent().build()
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{productId}")
    Product getById(@PathVariable Long productId) {
        return this.productRepository.findOne(productId);
    }
}

