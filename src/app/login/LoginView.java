package app.login;

import app.Printer;
import app.Prompter;
import app.accounts.AccountView;
import app.navigation.NavigationView;

public class LoginView {

    public void render() {
        Printer.println("Welcome to the banking application! Please enter your account information");
        LoginCredentials.Builder builder = new LoginCredentials.Builder();

        Prompter.prompt("Card Number:", variable -> {
            builder.setCardNumber(variable);
        });

        Prompter.prompt("Pin:", (input)-> {
            builder.setPin(input);
        });

        LoginPresenter presenter = new LoginPresenter();
        LoginCredentials credentials = builder.build();

        boolean pinIsValid = presenter.validatePin(credentials.getCardNumber(), credentials.getPin());
        if (pinIsValid) {
            // TODO: remove comment when AccountView is implemented
            // new AccountView().render();

            new NavigationView().render();
        } else {
            Printer.println("Didn't recognize that pin/number");
        }
    }
}
