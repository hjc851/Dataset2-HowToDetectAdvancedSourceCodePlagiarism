package memory;

public class InventoryAbandonRule extends Exception {

  public InventoryAbandonRule() {
    super();
  }

  public InventoryAbandonRule(String comment) {
    super(comment);
  }
}
