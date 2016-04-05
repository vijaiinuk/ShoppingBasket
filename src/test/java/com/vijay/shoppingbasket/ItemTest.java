package com.vijay.shoppingbasket;

import com.vijay.shoppingbasket.items.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vijay on 4/5/2016.
 */
public class ItemTest {


    @Test(expected = InvalidParameterException.class)
    public void testInvalidParameterThrowsException() throws InvalidParameterException {
        new Apple(-10);
    }

    @Test
    public void testSettingItemPrice() throws InvalidParameterException {
        Item item = new Apple(0);
        assertEquals(0, item.getPrice(), 0);

        Item apple1 = new Apple(20);
        assertEquals(20, apple1.getPrice(), 0);

        Item apple2 = new Apple(0.5);
        assertEquals(0.5, apple2.getPrice(), 0);
    }

    @Test
    public void testGettingItemName() throws InvalidParameterException {
        Item apple = new Apple(1);
        Item orange = new Orange(2);
        Item peach = new Peach(3);
        Item lemon = new Lemon(4);
        Item banana= new Banana(1.5);

        assertEquals("Apple", apple.getName());
        assertEquals("Orange", orange.getName());
        assertEquals("Peach", peach.getName());
        assertEquals("Lemon", lemon.getName());
        assertEquals("Banana", banana.getName());
    }
}
