package com.vijay.shoppingbasket.items;

import com.vijay.shoppingbasket.InvalidParameterException;

/**
 * Created by Vijay on 4/5/2016.
 */
public class Apple extends AbstractItem {

    public Apple(double price) throws InvalidParameterException {
        super(price, Apple.class.getSimpleName());
    }
}
