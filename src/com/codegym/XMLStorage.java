package com.codegym;

public class XMLStorage implements UserStorage {
    @Override
    public void store(User user) {
        String xml = "<user><name>" + user.getName() + "</name><email>"
                + user.getEmail() + "</email><password>" + user.getPassword() + "</password></user>";
    }
}
