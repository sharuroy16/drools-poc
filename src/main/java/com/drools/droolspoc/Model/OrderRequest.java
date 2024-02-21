package com.drools.droolspoc.Model;

public class OrderRequest {
    
    private String customerNumber;
    private Integer age;
    private Integer amount;
    private CustomerType customerType;

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public CustomerType getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "{" +
            " customerNumber='" + getCustomerNumber() + "'" +
            ", age='" + getAge() + "'" +
            ", amount='" + getAmount() + "'" +
            ", customerType='" + getCustomerType() + "'" +
            "}";
    }
}