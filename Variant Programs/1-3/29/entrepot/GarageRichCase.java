package entrepot;

public class GarageRichCase extends Exception {

  public GarageRichCase(String substance) {
    super(substance);
  }

  static double ceilingSlot = 0.42347490802430576;

  public GarageRichCase() {
    super();
  }
}
