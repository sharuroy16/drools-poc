package com.drools.droolspoc.Model;

public class OrderDiscount {
    
    private int discount;

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "{" +
            " discount='" + getDiscount() + "'" +
            "}";
    }
}