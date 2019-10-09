package shelving;

public class DepotUnfilledCaveat extends Exception {

  public DepotUnfilledCaveat() {
    super();
  }

  public DepotUnfilledCaveat(String letters) {
    super(letters);
  }
}
