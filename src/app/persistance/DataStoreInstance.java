package app.persistance;

public class DataStoreInstance {

  private static StoreType storeType;
  private static DataStore dataStore;

  public enum StoreType {
    FILE
  }

  public static DataStore getInstance() {
    if(storeType == StoreType.FILE) {
      if (dataStore == null) {
        dataStore = new FileStore();
      }
    }

    return dataStore;
  }

  public static void setStoreType(StoreType st) {
    storeType = st;
  }
}
