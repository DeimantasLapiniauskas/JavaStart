package org.example;

import itaphones.phone.AutomaticDialer;
import itaphones.phone.MobilePhone;

public class Main {
    public static void main(String[] args) {
        System.out.println(new MobilePhone()
                .dial(new PhoneAdapter(
                        new AutomaticDialer())
                        .dial()));
    }
}