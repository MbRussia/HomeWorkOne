package com.company.ice_cream_shop;

public class ExtraIceCream extends IceCreamAbstract {
    @Override
    public int fullPrice() {
        return super.fullPrice() + 5;
    }
}
