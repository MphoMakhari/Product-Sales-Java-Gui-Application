/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.test;

import org.junit.Test;
import static org.junit.Assert.*;
import company.data.pizza.PizzaPrice;

/**
 *
 * @author Makhari Mpho
 */
public class PizzaPriceTest {

    private PizzaPrice pPrice = null;

    @Test
    public void testSetsmallPPrice() {
        pPrice = new PizzaPrice("Four Seasons", 17.50);
        pPrice.setSmallPPrice(17.50);
        assertEquals(17.50, pPrice.getSmallPPrice(), 0.0);
    }

    /**
     * purpose: test setMediumPPrice for 1750
     */
    @Test
    public void testSetMediumPPrice1750() {
        pPrice = new PizzaPrice("Four Seasons", 17.50);
        pPrice.setMediumPPrice(17.50);
        assertEquals(28.00, pPrice.getMediumPPrice(), 0.0);

    }

    /**
     * purpose: test setLargePPrice for 1750
     */
    @Test
    public void testSetLargePPrice1750() {
        pPrice = new PizzaPrice("Four Seasons", 17.50);
        pPrice.setLargePPrice(17.50);
        assertEquals(33.25, pPrice.getLargePPrice(), 0.0);
    }

    /**
     * purpose: test setMediumPPrice for -1750
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetMediumPPriceNeg1750() {
        pPrice = new PizzaPrice("Four Seasons", 17.50);
        pPrice.setMediumPPrice(-17.50);
        assertEquals(28.00, pPrice.getMediumPPrice(), 0.0);
    }

    @Test
    public void testSetMediumPPrice2160() {
        pPrice = new PizzaPrice("Marguarita", 21.60);
        pPrice.setMediumPPrice(21.60);
        assertEquals(34.56, pPrice.getMediumPPrice(), 0.0);
    }

    @Test
    public void testSetLargePPrice2160() {
        pPrice = new PizzaPrice("Marguarita", 21.60);
        pPrice.setLargePPrice(21.60);
        assertEquals(41.04, pPrice.getLargePPrice(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLargePPriceNeg2160() {
        pPrice = new PizzaPrice("Marguarita", -21.60);
        pPrice.setLargePPrice(21.60);
        assertEquals(41.04, pPrice.getLargePPrice(), 0.0);
    }

}
