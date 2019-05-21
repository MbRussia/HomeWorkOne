package com.company.ice_cream_shop;

import com.company.ice_cream_shop.topping.CupType;
import com.company.ice_cream_shop.topping.IceCreamType;
import com.company.ice_cream_shop.topping.ToppingType;

import java.util.ArrayList;

public abstract class IceCreamAbstract implements IceCream {
    protected ArrayList<ToppingType> toppings = new ArrayList<>();
    protected IceCreamType iceCreamType;
    protected CupType cupType;


    @Override
    public boolean addTopping(ToppingType topping) {
        if (toppings.size() < 4) {
            toppings.add(topping);
            return true;
        }
        return false;
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
        return null;
    }

    @Override
    public int fullPrice() {
        return cupType.getPrice() + iceCreamType.getPrice() + toppings.size();
        //return "Итоговая цена: "+(cupType.getPrice()+iceCreamType.getPrice());
    }

}