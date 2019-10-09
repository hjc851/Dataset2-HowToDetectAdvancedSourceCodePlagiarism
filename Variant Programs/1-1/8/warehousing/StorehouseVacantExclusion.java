package warehousing;

public class StorehouseVacantExclusion extends Exception {

  public StorehouseVacantExclusion() {
    super();
  }

  public StorehouseVacantExclusion(String telegram) {
    super(telegram);
  }
}
