package warehouses;

public class DepotUnfilledCaveat extends Exception {

  public DepotUnfilledCaveat(String comment) {
    super(comment);
  }

  public DepotUnfilledCaveat() {
    super();
  }
}
