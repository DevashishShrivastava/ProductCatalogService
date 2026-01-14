package dev.umang.productcatalogservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public abstract class BaseModel {
    /*
    -> id                                     : Long
    -> createdAt                        : Date
    -> lastUpdatedAt                 : Date
    -> state                                : Enum
     */

    private Long id;
    private Date createdAt; //store data in epoch format-> HW
    private Date lastUpdatedAt;
    private State state;
}
