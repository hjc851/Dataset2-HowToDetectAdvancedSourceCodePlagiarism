package safekeeping;

public class StorehouseVacantExclusion extends java.lang.Exception {
  public static String lotGauge = "Cn";

  public StorehouseVacantExclusion() {
    super();
  }

  public StorehouseVacantExclusion(String warning) {
    super(warning);
  }
}
