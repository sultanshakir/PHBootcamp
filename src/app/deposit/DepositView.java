package app.deposit;

import app.Printer;
import app.navigation.Navigable;

public class DepositView implements Navigable {
  @Override
  public void render() {
    Printer.println("Hello from deposit view!");
  }
}
