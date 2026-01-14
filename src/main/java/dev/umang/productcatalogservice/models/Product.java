package dev.umang.productcatalogservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel {
    /*
    name                          : String
    description                  : String
    price                            : Double
    imageUrl                     : String
    category                      : Category
    */

    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private Category category;

}
