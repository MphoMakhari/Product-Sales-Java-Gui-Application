/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company.data.pizza;

/**
 *
 * @author Makhari Mpho
 */
public class PizzaPrice {

    private double smallPPrice, mediumPPrice, largePPrice;
    private String pizzaName;

    /**
     *
     * @param pizzaName
     * @param smallPPrice
     */
    public PizzaPrice(String pizzaName, double smallPPrice) {
        this.pizzaName = pizzaName;
        setSmallPPrice(smallPPrice);
        setMediumPPrice(smallPPrice);
        setLargePPrice(smallPPrice);
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public double getSmallPPrice() {
        return smallPPrice;
    }

    public double getMediumPPrice() {
        return mediumPPrice;
    }

    public double getLargePPrice() {
        return largePPrice;
    }

    public void setSmallPPrice(double smallPPrice) {
        this.smallPPrice = smallPPrice;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void setMediumPPrice(double smallPPrice) {
        final double MEDIUM_PIZZA_PRICE_PERCENTAGE = 0.6;
        if (smallPPrice > 0) {
            this.mediumPPrice = Math.round((smallPPrice + smallPPrice * MEDIUM_PIZZA_PRICE_PERCENTAGE) * 100) / 100.0;
        }
        else {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
    }

    public void setLargePPrice(double smallPPrice) {
        final double LARGE_PIZZA_PRICE_PERCENTAGE = 0.9;
        if (smallPPrice > 0) {
            this.largePPrice = Math.round((smallPPrice + smallPPrice * LARGE_PIZZA_PRICE_PERCENTAGE) * 100) / 100.0;
        }
        else {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

    }

}
