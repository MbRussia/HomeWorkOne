package com.company.ice_cream_shop;

import com.company.ice_cream_shop.exceptions.ToppingException;
import com.company.ice_cream_shop.topping.CupType;
import com.company.ice_cream_shop.topping.IceCreamType;
import com.company.ice_cream_shop.topping.ToppingType;

import java.util.ArrayList;

public abstract class IceCreamAbstract implements IceCream {
    protected ArrayList<ToppingType> toppings = new ArrayList<>();
    protected IceCreamType iceCreamType;
    protected CupType cupType;


    @Override
    public void addTopping(ToppingType topping) throws ToppingException {
        if (toppings.size() < 4) {
            toppings.add(topping);
        } else {
            throw new ToppingException();
        }
    }

    @Override
    public String getCupType() {
        if (cupType != null) {
            return cupType.name();
        }
        return null;
    }

    @Override
    public void setCupType(CupType cupType) {
        this.cupType = cupType;
        return;
    }

    @Override
    public String getIceCreamType() {
        if (iceCreamType != null) {
            return iceCreamType.name();
        }
        return null;
    }

    @Override
    public void setIceCreamType(IceCreamType iceCreamType) {
        this.iceCreamType = iceCreamType;
    }

    @Override
    public String getTopping() { // решить, что с ним сделать

        return toppings.toString();
    }

    @Override
    public int fullPrice() {
        int toppingsSumm = 0;
        for (int i = 0; i < toppings.size(); i++) {
            toppingsSumm = toppingsSumm + toppings.get(i).getPrice();
        }
        return cupType.getPrice() + iceCreamType.getPrice() + toppingsSumm;
    }

}