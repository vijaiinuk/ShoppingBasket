package com.vijay.shoppingbasket.items;

import com.vijay.shoppingbasket.InvalidParameterException;

/**
 * Created by Vijay on 4/5/2016.
 */
public class AbstractItem implements Item {

    private final double price;
    private final String name;

    public AbstractItem(double price, String name) throws InvalidParameterException {
        validatePrice(price);
        this.price = price;
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    void validatePrice(double price) throws InvalidParameterException {
        if(price < 0)  {
            throw new InvalidParameterException();
        }
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
