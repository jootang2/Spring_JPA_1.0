package com.hellojpa.JPQL;

import javax.persistence.*;

@Entity
public class jqplOrder {
    @Id
    @GeneratedValue
    private Long id;
    private int orderAmount;
    @Embedded
    private jpqlAddress address;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private jpqlProduct jpqlProduct;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public jpqlAddress getAddress() {
        return address;
    }

    public void setAddress(jpqlAddress address) {
        this.address = address;
    }

    public com.hellojpa.JPQL.jpqlProduct getJpqlProduct() {
        return jpqlProduct;
    }

    public void setJpqlProduct(com.hellojpa.JPQL.jpqlProduct jpqlProduct) {
        this.jpqlProduct = jpqlProduct;
    }
}
