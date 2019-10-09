package store;

public class CacheTotalAnomaly extends Exception {

  public CacheTotalAnomaly() {
    super();
  }

  public CacheTotalAnomaly(String statement) {
    super(statement);
  }
}
