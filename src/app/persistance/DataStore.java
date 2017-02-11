package app.persistance;

import app.persistance.value.Account;
import app.persistance.value.User;

public interface DataStore {
  User getUser();
  void addUser(User user);
  void updateAccount(Account account);
  void addAccount(Account account);
}
