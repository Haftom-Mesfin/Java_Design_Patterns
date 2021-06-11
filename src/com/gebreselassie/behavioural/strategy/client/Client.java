package com.gebreselassie.behavioural.strategy.client;

import com.gebreselassie.behavioural.strategy.Item;
import com.gebreselassie.behavioural.strategy.context.ShoppingCart;
import com.gebreselassie.behavioural.strategy.impl.CreditCardStrategy;
import com.gebreselassie.behavioural.strategy.impl.PaypalStrategy;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Item item1 = new Item("1234", 10.5);
        Item item2 = new Item("5678", 40.5);

        ShoppingCart shoppingCart = new ShoppingCart(Arrays.asList(item1, item2)); // Context

        //pay by paypal
        shoppingCart.pay(new PaypalStrategy("niaytey@gmail.com", "niyatey"));

        // pay by credit card
        shoppingCart.pay(new CreditCardStrategy("Niyat Haftom", "12345678", "323", "02/25"));

    }
}
