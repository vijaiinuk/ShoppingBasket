package com.vijay.shoppingbasket.items;

import com.vijay.shoppingbasket.InvalidParameterException;

/**
 * Created by Vijay on 4/5/2016.
 */
public class Orange extends AbstractItem {
    public Orange(double price) throws InvalidParameterException {
        super(price, Orange.class.getSimpleName());
    }
}
