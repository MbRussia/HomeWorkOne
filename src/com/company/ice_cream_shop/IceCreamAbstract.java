package com.company.ice_cream_shop;

import com.company.ice_cream_shop.topping.IceCreamType;
import com.company.ice_cream_shop.topping.ToppingType;

import java.util.ArrayList;

public abstract class IceCreamAbstract implements IceCream {
    protected ArrayList<ToppingType> toppings = new ArrayList<>();
    protected IceCreamType iceCreamType;

    @Override
    public void addTopping(ToppingType topping) {
        toppings.add(topping);
    }
}
