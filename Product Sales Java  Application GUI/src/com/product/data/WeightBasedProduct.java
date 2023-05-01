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
public class WeightBasedProduct extends Product {

    private double weight;

    /**
     *
     * @param weight
     * @param barcode
     * @param nameOfProduct
     * @param unitPrice
     */
    public WeightBasedProduct(double weight, String barcode, String nameOfProduct, double unitPrice) {
        super(barcode, nameOfProduct, unitPrice);
        setWeight(weight);
    }

    /**
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     *
     * @return
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @return
     */
    @Override
    public double calculateTotalCost() {
        final double TAX = 0.15;
        return (weight * super.getUnitPrice() + (super.getUnitPrice() * TAX));
    }

}
