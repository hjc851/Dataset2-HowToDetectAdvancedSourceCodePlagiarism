package stowage;

public class StorehouseVacantExclusion extends Exception {
  static double restrict = 0.13226378527936933;

  public StorehouseVacantExclusion() {
    super();
  }

  public StorehouseVacantExclusion(String letter) {
    super(letter);
  }
}
