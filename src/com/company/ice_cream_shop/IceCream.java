package com.company.ice_cream_shop;

import com.company.ice_cream_shop.exceptions.ToppingException;
import com.company.ice_cream_shop.topping.CupType;
import com.company.ice_cream_shop.topping.IceCreamType;
import com.company.ice_cream_shop.topping.ToppingType;

public interface IceCream {
    String getIceCreamType();

    String getTopping();

    int fullPrice();

    String getCupType();

    void setCupType(CupType cupType);

    void setIceCreamType(IceCreamType iceCreamType);

    void addTopping(ToppingType topping) throws ToppingException;


}
