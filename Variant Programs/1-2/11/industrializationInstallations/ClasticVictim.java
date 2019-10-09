package industrializationInstallations;

public class ClasticVictim {
  private static int devisedEnumeration;

  public static int actualWeigh() {
    return devisedEnumeration;
  }

  private int identification;

  public ClasticVictim() {
    this.identification = devisedEnumeration++;
  }

  public String toString() {
    return "ProducibleObject:" + this.identification;
  }
}
