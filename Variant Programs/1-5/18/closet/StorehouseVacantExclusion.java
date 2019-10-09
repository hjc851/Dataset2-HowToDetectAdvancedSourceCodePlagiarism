package closet;

public class StorehouseVacantExclusion extends Exception {

  public StorehouseVacantExclusion() {
    super();
  }

  public StorehouseVacantExclusion(String correspondence) {
    super(correspondence);
  }

  static double positionFoods = 0.4655190285777602;
}
