package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Users adminUser = new Users("Name1", "password1", Types.ADMIN);
        Users premiumUser = new Users("Name2", "password2", Types.PREMIUM);
        Users authorizedUser = new Users("Name3", "password3", Types.AUTHORIZED);
        Users guestUser = new Users("Name4", "password4", Types.GUEST);
        Types[] array = Types.values();

        System.out.println("Service order of " + Arrays.toString(array) + " user types will be " + Types.ADMIN.ordinal() + " " +
                Types.PREMIUM.ordinal() + " " + Types.AUTHORIZED.ordinal() + " " + Types.GUEST.ordinal());

        if (adminUser.equals(premiumUser) && adminUser.equals(authorizedUser) && adminUser.equals(guestUser)) {
            System.out.println("Same objects");
        } else {
            System.out.println("Different objects");
        }
    }
}
