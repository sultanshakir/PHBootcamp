package app.alert;

public class AlertsSingleton {

  private boolean withdrawAlerts = false;
  private boolean depositAlerts = false;
  private static AlertsSingleton instance;

  public static AlertsSingleton getInstance() {
    if (instance == null) {
      instance = new AlertsSingleton();
    }

    return instance;
  }

  public boolean isWithdrawAlertsOn() {
    return withdrawAlerts;
  }

  public boolean isDepositAlertsOn() {
    return depositAlerts;
  }
  public void toggleWithdrawAlerts() {
    withdrawAlerts = !withdrawAlerts;
  }
  public void toggleDepositAlerts() {
    depositAlerts = !depositAlerts;
  }
}
