package com.company;

public class Main {

    public static void main(String[] args) {
        Phone ericsPhone = new Phone("blue", "2019", "4g", "Samsung",
                "12GB", 12884895290L, 1099511627776L);

        System.out.println(ericsPhone.getNetworkSpeed());
        ericsPhone.setNetworkSpeed("5G");
        System.out.println(ericsPhone.toString());
    }
}
