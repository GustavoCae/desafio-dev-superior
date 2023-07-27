package com.devsuperior.aula.models;

public class Order {
    private Integer code;

    private double basicValue;

    private double discount;

    public Order() {
    }

    public Order(Integer code, double basicValue, double discount) {
        this.code = code;
        this.basicValue = basicValue;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public double getBasicValue() {
        return basicValue;
    }

    public void setBasicValue(double basicValue) {
        this.basicValue = basicValue;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
