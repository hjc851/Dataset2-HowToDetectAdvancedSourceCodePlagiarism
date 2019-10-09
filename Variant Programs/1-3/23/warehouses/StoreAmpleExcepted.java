package warehouses;

public class StoreAmpleExcepted extends Exception {

  public StoreAmpleExcepted() {
    super();
  }

  public StoreAmpleExcepted(String substance) {
    super(substance);
  }
}
