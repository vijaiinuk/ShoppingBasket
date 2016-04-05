package com.vijay.shoppingbasket;

import com.vijay.shoppingbasket.items.Item;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vijay on 4/5/2016.
 */
public class ShoppingBasket {

    private final List<Item> items = new ArrayList<>();

    Logger logger = Logger.getLogger(ShoppingBasket.class);

    public double calculateTotal() {
        double total = 0;
        for ( Item item : items)  {
            logger.debug("Adding item: "+item);
            total += item.getPrice();
        }

        logger.info("Total Cost of basket is "+total);
        return total;
    }

    public void addToBasket(Item item) {
        logger.info("Adding item: "+item+" to basket");
        items.add(item);
    }

    public void addAllToBasket(List<Item> items)  {
        logger.info("Adding items: "+items);
        this.items.addAll(items);
    }

    public void clearBasket()  {
        logger.info("Clearing basket");
        items.clear();
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public int itemsCount() {
        return items.size();
    }
}
