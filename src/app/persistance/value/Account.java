package app.persistance.value;

public class Account {
  private String name;
  private int amount;

  public Account(String name, int amount) {
    this.name = name;
    this.amount = amount;
  }

  public String getName() {
    return name;
  }

  public int getAmount() {
    return amount;
  }

}
