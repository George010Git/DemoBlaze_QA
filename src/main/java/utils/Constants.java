package utils;

import com.github.javafaker.Faker;

public class Constants {

    public static final String URL = "https://demoblaze.com/";
    public static final String EMAIL = emailGenerator();
    public static final String PASSWORD = "test33223@test.com";
    public static final String SING_UP_MESSAGE = "Sign up successful.";
    public static final String PRODUCT_ADDED = "Product added.";
    public static final String LOGIN_EMAIL = "TestRolando@test.com";
    public static final String NAME = "Octavian Popescu";
    public static final String COUNTRY = "Romania";
    public static final String CITY = "Bucuresti";
    public static final String  CREDIT_CARD = "4728363530496";
    public static final String  MONTH_EXPIRATION = "7";
    public static final String  YEAR_EXPIRATION = "2025";
    public static final String  THANK_YOU_FOR_PURCHASE = "Thank you for your purchase!";
    public static final String  WELCOME = "Welcome";
    public static final String  ITEM_NAME = "Samsung galaxy s6";
    public static final String  ORDER_FORM = "Place order";





    public static String emailGenerator() {

        Faker fkr = new Faker();
        return "Test" + fkr.name().firstName() + "@test.com";

    }
}

