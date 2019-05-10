package com.company.ice_cream_shop;

import com.company.ice_cream_shop.topping.IceCreamType;
import com.company.ice_cream_shop.topping.ToppingType;

public interface IceCream {
    String getIceCream();

    String getTopping();

    String fullPrice();

    void setIceCreamType(IceCreamType iceCreamType);

    void addTopping(ToppingType topping);


}
