package app.alert;

import app.Action;
import app.OptionsBuilder;
import app.Printer;
import app.navigation.Navigable;

public class AlertView implements Navigable {
  @Override
  public void render() {
    Printer.println();
    Printer.println("Hello from alert view! What would you like to do?");

    OptionsBuilder<Action> optionsBuilder = new OptionsBuilder();

    AlertsSingleton singleton = AlertsSingleton.getInstance();

    optionsBuilder.addOption("Deposit Alerts on", (text) -> {
      // turn on deposit alerts
      singleton.toggleDepositAlerts();
    });
    optionsBuilder.addOption("Withdraw Alerts on", (text) -> {
      // turn on withdraw alerts
      singleton.toggleWithdrawAlerts();
    });
    optionsBuilder.addOption("Deposit Alerts off", (text) -> {
      // turn off withdraw alerts
      singleton.toggleDepositAlerts();
    });
    optionsBuilder.addOption("Withdraw Alerts off", (text) -> {
      // turn off deposit alerts
      singleton.toggleWithdrawAlerts();
    });

    optionsBuilder.build((action) -> {
      action.execute(null);
    });
  }
}
