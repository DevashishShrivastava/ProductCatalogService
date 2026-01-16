package dev.umang.productcatalogservice.controllers;

import dev.umang.productcatalogservice.dtos.ProductDTO;
import dev.umang.productcatalogservice.models.Product;
import dev.umang.productcatalogservice.services.FakestoreProductService;
import dev.umang.productcatalogservice.services.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/*
multiple objects of controller
req1
req2
 */
@RestController
public class ProductController {
    IProductService productService;

    /*
    Constructor injection
     */

    public ProductController(IProductService productService){
        this.productService = productService;
    }

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
    ProductDTO createProduct(@RequestBody ProductDTO product){

        ProductDTO productReponseDTO = new ProductDTO();
        /*
        call the service layer to save the product
         */

        //productService.createProduct(product);
        return productReponseDTO;
    }
    /*
    "name": "iphone",
    "descr": "apple",

     */
    @GetMapping("/products/{id}")
    ResponseEntity<ProductDTO> getProductById(@PathVariable("id") Long id){
        //RestTemplate
        /*
        call the service layer to get the product by id
         */

        if(id < 1){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }



        Product product = productService.getProductById(id);


        if(product == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }



        /*
        product
        to productDTO

        obj.from(obj) -> newObj
         */

        ProductDTO productDTO = product.convert();

        return new ResponseEntity<>(productDTO,HttpStatus.OK);
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
