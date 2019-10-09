package warehouses;

public class InventoryAbandonRule extends Exception {

  public InventoryAbandonRule() {
    super();
  }

  public InventoryAbandonRule(String signals) {
    super(signals);
  }
}
