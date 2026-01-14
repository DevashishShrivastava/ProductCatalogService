package dev.umang.productcatalogservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Category extends BaseModel{
    /*
    name                          : String
    description                  : String
    products                     : List<Product>
     */

    private String name;
    private String description;
    private List<Product> products;
}
