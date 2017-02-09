package app.withdraw;

import app.Printer;
import app.navigation.Navigable;

public class WithdrawView implements Navigable {
  @Override
  public void render() {
    Printer.println("Hello from withdraw view!");
  }
}
