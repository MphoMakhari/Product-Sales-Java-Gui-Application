/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.data;

/**
 *
 * @author Makhari Mpho
 */
public abstract class Product {

    private String barcode;
    private String nameOfProduct;
    private double unitPrice;

    /**
     *
     * @param barcode
     * @param nameOfProduct
     * @param unitPrice
     */
    public Product(String barcode, String nameOfProduct, double unitPrice) {
        setBarcode(barcode);
        setNameOfProduct(nameOfProduct);
        setUnitPrice(unitPrice);
    }

    public abstract double calculateTotalCost();

    public void setBarcode(String barcode) {
        if (barcode.matches("\\d{12}")) {
            this.barcode = barcode;
        }
        else {
            throw new IllegalArgumentException("Barcode should be digit with the length of 12");
        }

    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

}
