package warehousing;

public class InventoryLoadedRule extends Exception {

  public InventoryLoadedRule() {
    super();
  }

  public InventoryLoadedRule(String text) {
    super(text);
  }
}
