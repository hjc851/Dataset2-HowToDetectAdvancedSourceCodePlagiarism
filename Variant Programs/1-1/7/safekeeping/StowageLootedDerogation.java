package safekeeping;

public class StowageLootedDerogation extends Exception {

  public StowageLootedDerogation() {
    super();
  }

  public StowageLootedDerogation(String substance) {
    super(substance);
  }
}
