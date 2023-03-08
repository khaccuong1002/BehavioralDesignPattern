package com.codegym;

public class UserController {
    private final UserStorage userStorage;

    public UserController(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public void store(User user) {
        userStorage.store(user);
    }
}
