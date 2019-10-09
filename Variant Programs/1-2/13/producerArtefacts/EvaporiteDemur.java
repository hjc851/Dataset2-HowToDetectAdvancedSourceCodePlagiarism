package producerArtefacts;

public class EvaporiteDemur {
  private static int craftedCalculate;

  public static int liveMatter() {
    return craftedCalculate;
  }

  private int milad;

  public EvaporiteDemur() {
    this.milad = craftedCalculate++;
  }

  public String toString() {
    return "ProducibleObject:" + this.milad;
  }
}
