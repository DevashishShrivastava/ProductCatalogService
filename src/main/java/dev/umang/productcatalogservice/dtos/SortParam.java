package dev.umang.productcatalogservice.dtos;

/*
Within all results
sort by description, sort by price
electronics 300
electronics 250
 */
public class SortParam {
    private String paramName;
    private String order;

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
