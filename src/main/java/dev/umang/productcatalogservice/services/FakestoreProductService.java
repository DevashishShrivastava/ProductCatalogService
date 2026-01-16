package dev.umang.productcatalogservice.services;

import dev.umang.productcatalogservice.dtos.FakestoreProductDto;
import dev.umang.productcatalogservice.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
/*
Spring cloud class - more on configurations
Rest template is a library we are going to use for talking to 3rd party APIs
 */
@Service
public class FakestoreProductService implements IProductService {
    private RestTemplate restTemplate;

    private FakestoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductById(Long id) {
//        FakestoreProductDto fakestoreProductDto = restTemplate.getForObject(
//                "https://fakestoreapi.com/products/{id}",
//                FakestoreProductDto.class,
//                id);

        ResponseEntity<FakestoreProductDto> fakestoreProductDtoResponseEntity = restTemplate.getForEntity(
                "https://fakestoreapi.com/products/{id}",
                FakestoreProductDto.class,
                id
        );



        if(fakestoreProductDtoResponseEntity.hasBody() &&
                fakestoreProductDtoResponseEntity.getStatusCode().equals(
                        HttpStatusCode.valueOf(200)
        )){
            return fakestoreProductDtoResponseEntity.getBody().from(fakestoreProductDtoResponseEntity.getBody());
        }

        return null;
        /*
        FakestoreProductDTO to Product
        A to B

        a.convert(a) -> b

        B{
            convert(){}
        }
         */


    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product createProduct(Product input) {
        return null;
    }
}
