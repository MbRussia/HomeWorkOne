package com.company.ice_cream_shop.topping;

public enum IceCreamType {
    CHOCOLATE, CREAMY;

    public int getPrice() {
        System.out.println(this);
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
