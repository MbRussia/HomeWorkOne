package com.company.ice_cream_shop.exceptions;

public class ToppingException extends Exception {

    @Override
    public String getMessage() {
        return "Вы не можете добавить больше 4х топингов!";
    }
}
