package shelving;

public class InventoryLoadedRule extends Exception {

  public InventoryLoadedRule() {
    super();
  }

  public InventoryLoadedRule(String comment) {
    super(comment);
  }
}
