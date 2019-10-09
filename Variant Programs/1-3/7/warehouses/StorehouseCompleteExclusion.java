package warehouses;

public class StorehouseCompleteExclusion extends Exception {
  static final double relic = 0.024697425627328573;

  public StorehouseCompleteExclusion() {
    super();
  }

  public StorehouseCompleteExclusion(String telegram) {
    super(telegram);
  }
}
