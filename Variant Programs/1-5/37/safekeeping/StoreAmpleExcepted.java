package safekeeping;

public class StoreAmpleExcepted extends Exception {

  public StoreAmpleExcepted() {
    super();
  }

  public StoreAmpleExcepted(String statement) {
    super(statement);
  }
}
