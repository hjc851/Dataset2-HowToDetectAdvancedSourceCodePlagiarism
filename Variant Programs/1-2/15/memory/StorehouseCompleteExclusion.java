package memory;

public class StorehouseCompleteExclusion extends Exception {

  public StorehouseCompleteExclusion() {
    super();
  }

  public StorehouseCompleteExclusion(String statement) {
    super(statement);
  }
}
