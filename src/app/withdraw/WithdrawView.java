package app.withdraw;

import app.Printer;
import app.alert.AlertsSingleton;
import app.navigation.Navigable;

public class WithdrawView implements Navigable {

  @Override
  public void render() {
    Printer.println("Hello from withdraw view!");
    AlertsSingleton singleton = AlertsSingleton.getInstance();
    if(singleton.isWithdrawAlertsOn()) {
      // send a text message
    }
  }
}
