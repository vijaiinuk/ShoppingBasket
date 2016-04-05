package com.vijay.shoppingbasket.items;

import com.vijay.shoppingbasket.InvalidParameterException;

/**
 * Created by Vijay on 4/5/2016.
 */
public class Peach extends AbstractItem {
    public Peach(double price) throws InvalidParameterException {
        super(price, Peach.class.getSimpleName());
    }
}
