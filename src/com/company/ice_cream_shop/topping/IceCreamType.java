package com.company.ice_cream_shop.topping;

public enum IceCreamType {
    CHOCOLATE, CREAMY;

    public int getPrice() {
        switch (this) {
            case CREAMY:
                return 10;
            case CHOCOLATE:
                return 15;
            default:
                return 0;
        }
    }
}
