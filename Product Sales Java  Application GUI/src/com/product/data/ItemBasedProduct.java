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
public class ItemBasedProduct extends Product {

    private String manufacturer;

    /**
     *
     * @param manufacturer
     * @param barcode
     * @param nameOfProduct
     * @param unitPrice
     */
    public ItemBasedProduct(String manufacturer, String barcode, String nameOfProduct, double unitPrice) {
        super(barcode, nameOfProduct, unitPrice);
        setManufacturer(manufacturer);
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    /**
     *
     * @return
     */
    @Override
    public double calculateTotalCost() {
        final double TAX = 0.15;
        return (super.getUnitPrice() + (super.getUnitPrice() * TAX));
    }

}
