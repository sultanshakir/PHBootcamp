package app.alert;

import app.Printer;
import app.navigation.Navigable;

public class AlertView implements Navigable {
  @Override
  public void render() {
    Printer.println("Hello from alert view!");
  }
}
