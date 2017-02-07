package app.login;

import app.Printer;
import app.accounts.AccountView;

import java.util.Scanner;

public class LoginView {

    public void render() {
        Printer.println("Welcome to the banking application! Please enter your account information");

        Scanner scanner = new Scanner(System.in);
        Printer.print("Card Number: ");
        String cardNumber = scanner.nextLine();

        Printer.println();

        Printer.print("Pin Number: ");
        String pin = scanner.nextLine();

        LoginPresenter presenter = new LoginPresenter();

        boolean pinIsValid = presenter.validatePin(cardNumber, pin);
        if (pinIsValid) {
            new AccountView().render();
        } else {
            Printer.println("Didn't recognize that pin/number");
        }
    }
}
