package com.testassignment.shoppingcart.dto;

/**
 * Created by ashishn on 08/28/2017.
 */
public class ShoppingCartDTO {
    private Long productId;
    private Integer stock;
    private String status;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
