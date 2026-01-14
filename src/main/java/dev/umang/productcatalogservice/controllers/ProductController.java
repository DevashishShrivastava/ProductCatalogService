package dev.umang.productcatalogservice.controllers;

import dev.umang.productcatalogservice.dtos.ProductReponseDTO;
import dev.umang.productcatalogservice.dtos.ProductRequestDTO;
import dev.umang.productcatalogservice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/*
multiple objects of controller
req1
req2
 */
@RestController
public class ProductController {
    /*
    1. Create product
    2. Get product by id
    3. Get all products
     */


    /*
    Create product ("/products"), POST
    Get product by id ("/products/{id}"), GET
    Get all products ("/products"), GET
    @RequestMapping("/products")
    @GetMapping
    @PostMapping
     */

    @PostMapping("/products")
    ProductReponseDTO createProduct(@RequestBody ProductRequestDTO product){
        ProductReponseDTO productReponseDTO = new ProductReponseDTO();
        /*
        call the service layer to save the product
         */
        return productReponseDTO;
    }
    /*
    "name": "iphone",
    "descr": "apple",

     */
    @GetMapping("/products/{id}")
    ProductReponseDTO getProductById(@PathVariable("id") Long id){
        ProductReponseDTO productReponseDTO = new ProductReponseDTO();
        /*
        call the service layer to get the product by id
         */
        return productReponseDTO;
    }

    @GetMapping("/products")
    String getAllProducts(){
        return "Hello world";
        //List<ProductReponseDTO> products = new ArrayList<>();
        /*
        call the service layer to get all products
         */
        //return products;
    }
}
