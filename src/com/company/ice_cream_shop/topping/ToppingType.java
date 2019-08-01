package com.company.ice_cream_shop.topping;

public enum ToppingType {
    NUT, CHOCOLATE, FRUCTS;

    public int getPrice() {
        switch (this) {
            case CHOCOLATE:
                return 25;
            case NUT:
                return 24;
            case FRUCTS:
                return 23;
            default:
                return 0;
        }
    }

}
