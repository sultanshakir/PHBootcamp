package app;

import app.login.LoginView;

public class Main {

    public static void main(String[] args) {
        /*
            log in with cardnumber & pin
            choose account to make transactions with
            withdraw money from selected account
            deposit money from select account
            receive text alerts when withdraw or deposit money
            be able to save information when exited
         */

        new LoginView().render();
    }
}
