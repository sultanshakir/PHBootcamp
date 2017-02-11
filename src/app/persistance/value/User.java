package app.persistance.value;

import java.util.List;

public class User {
  private String cardNumber;
  private String pin;
  private List<Account> accounts;

  public User(String cardNumber, String pin, List<Account> accounts) {
    this.cardNumber = cardNumber;
    this.pin = pin;
    this.accounts = accounts;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public String getPin() {
    return pin;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

}
