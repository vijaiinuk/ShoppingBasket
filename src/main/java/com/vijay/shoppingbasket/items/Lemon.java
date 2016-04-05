package com.vijay.shoppingbasket.items;

import com.vijay.shoppingbasket.InvalidParameterException;

/**
 * Created by Vijay on 4/5/2016.
 */
public class Lemon extends AbstractItem {
    public Lemon(double price) throws InvalidParameterException {
        super(price, Lemon.class.getSimpleName());
    }
}
