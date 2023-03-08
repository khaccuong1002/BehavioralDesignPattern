package com.codegym;

public class MySQLStorage implements  UserStorage {
    @Override
    public void store (User user) {
        String sql = "INSERT INTO users(name, email, password) VALUES('"
                + user.getName() + "', '" + user.getEmail() + "', '" + user.getPassword() + "')";
    }
}
