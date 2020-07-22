package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private static Address address;

    public Address getAddress() {
        return address;
    }

    public static class Address {
        private String city;
        private String street;
        private int home;
        private int apartment;
    }


    List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }
}


