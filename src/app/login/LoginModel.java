package app.login;

import app.persistance.DataStore;
import app.persistance.DataStoreInstance;
import app.persistance.value.User;

public class LoginModel {

  private DataStore dataStore = DataStoreInstance.getInstance();

  public User getUser() {
    return dataStore.getUser();
  }

}
