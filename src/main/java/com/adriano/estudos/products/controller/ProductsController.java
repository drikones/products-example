package com.adriano.estudos.products.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/products")
public class ProductsController {

	@GetMapping
    public Map<Long, String> findAll() {
		Map<Long, String> map = new HashMap<Long, String>();
		map.put(1L, "Product 1");
		map.put(2L, "Product 2");
		map.put(3L, "Product 3");
		map.put(4L, "Product 4");
        return map;
    }

}
