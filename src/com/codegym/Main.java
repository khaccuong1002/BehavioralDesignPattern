package com.codegym;

public class Main {
    public static void main(String[] args) {
        UserStorage storage = new XMLStorage();
        UserController controller = new UserController(storage);
        User user = new User("John Doe", "johndoe@example.com", "password123");
        controller.store(user);
    }
}