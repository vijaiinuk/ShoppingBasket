package com.vijay.shoppingbasket.items;

import com.vijay.shoppingbasket.InvalidParameterException;

/**
 * Created by Vijay on 4/5/2016.
 */
public class Banana extends AbstractItem {

    public Banana(double price) throws InvalidParameterException {
        super(price, Banana.class.getSimpleName());
    }
}
