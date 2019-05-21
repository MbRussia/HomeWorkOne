package com.company.ice_cream_shop;

public enum TextOutput {
    DEFAULT, SELECT_CUP;

    public static String getMessage(TextOutput type) {
        switch (type) {
            case DEFAULT:
                return "Вы не выбрали ни одни вариант";
            case SELECT_CUP:
                return "Выберите Стаканчик из списка:\n";
            default:
                return "OLOLO";
        }
    }

}
