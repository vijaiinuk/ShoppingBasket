package com.vijay.shoppingbasket;

import com.vijay.shoppingbasket.items.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Vijay on 4/5/2016.
 */
public class ShoppingBasketTest {

    ShoppingBasket basket;

    @Before
    public void setup()  {
        basket = new ShoppingBasket();
    }

    @Test
    public void testNotNull()  {
        assertNotNull(basket);
    }

    @Test
    public void test_total_is_zero_for_empty_basket()  {
        assertEquals(0, basket.calculateTotal(), 0.0);
    }

    @Test
    public void test_total_is_correct_for_oneitem_basket() throws InvalidParameterException {
        basket.addToBasket(new Banana(10.0));
        assertEquals(10.0, basket.calculateTotal(), 0.0);
    }

    @Test
    public void test_total_correct_for_multiitem_basket() throws InvalidParameterException {
        basket.addToBasket(new Orange(1.5));
        basket.addToBasket(new Banana(2.5));
        basket.addToBasket(new Peach(1.0));

        assertEquals(5, basket.calculateTotal(), 0.0);

        basket.addToBasket(new Lemon(10.5));
        assertEquals(15.5, basket.calculateTotal(),0);

        basket.addToBasket(new Apple(4.5));
        assertEquals(20.0, basket.calculateTotal(), 0.0);
    }

    @Test
    public void testItemsCount_returns_item_count() throws InvalidParameterException {
        assertEquals(0, basket.itemsCount());

        basket.addToBasket(new Orange(1.0));
        basket.addToBasket(new Banana(1.0));
        basket.addToBasket(new Lemon(2.0));

        assertEquals(3, basket.itemsCount());
    }

    @Test
    public void testClearBasket_clears_all_the_items() throws InvalidParameterException {
        basket.addToBasket(new Apple(1));
        basket.addToBasket(new Lemon(2));

        assertEquals(2, basket.itemsCount());
        assertEquals(3, basket.calculateTotal(), 0.0);

        basket.clearBasket();

        assertEquals(0, basket.itemsCount());
        assertEquals(0, basket.calculateTotal(), 0.0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testModifying_basketCollection_throws_UnsupportedException() throws InvalidParameterException {
        basket.addToBasket(new Lemon(0.5));

        basket.getItems().add(new Peach(1));
    }

    @Test
    public void testGetItems_returns_correct_collection() throws InvalidParameterException {
        basket.addToBasket(new Apple(0.5));
        assertEquals(basket.itemsCount(), basket.getItems().size());
    }

    @Test
    public void testAddAllToBasket_addsItems() throws InvalidParameterException {
        basket.addToBasket(new Peach(10));

        List<Item> newItems = new ArrayList<>();
        newItems.add(new Peach(10));
        newItems.add(new Apple(15));
        newItems.add(new Orange(2));

        basket.addAllToBasket(newItems);

        assertEquals(4, basket.itemsCount());
        assertEquals(37.0, basket.calculateTotal(), 0.0);
    }
}
