package app.navigation;

import app.OptionsBuilder;
import app.Printer;
import app.alert.AlertView;
import app.deposit.DepositView;
import app.withdraw.WithdrawView;

public class NavigationView {

  public void render() {
    Printer.println("What would you like to do?");

    OptionsBuilder<Navigable> optionsBuilder = new OptionsBuilder<>();

    optionsBuilder.addOption("Withdraw", new WithdrawView());
    optionsBuilder.addOption("Deposit", new DepositView());
    optionsBuilder.addOption("View Text Alert Options", new AlertView());

    optionsBuilder.build((navigablePage) -> {
      navigablePage.render();
    });
  }
}
