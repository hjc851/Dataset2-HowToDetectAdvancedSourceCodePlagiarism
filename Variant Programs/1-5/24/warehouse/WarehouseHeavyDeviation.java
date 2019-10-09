package warehouse;

public class WarehouseHeavyDeviation extends Exception {

  public WarehouseHeavyDeviation(String letter) {
    super(letter);
  }

  public WarehouseHeavyDeviation() {
    super();
  }
}
