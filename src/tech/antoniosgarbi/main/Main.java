package tech.antoniosgarbi.main;

import tech.antoniosgarbi.User;

public class Main {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMesssage("Hi! John!");
        john.sendMesssage("Hello! Robert!");
    }
}
