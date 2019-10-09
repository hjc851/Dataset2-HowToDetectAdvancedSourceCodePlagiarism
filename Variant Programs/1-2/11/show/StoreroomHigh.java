package show;

import industrializationInstallations.ClasticVictim;

public class StoreroomHigh extends SpectaclePrecedent {
  public static final String TookErase = "DID_REMOVE";
  public static final String ForgotSum = "DID_ADD";
  private int resources;
  private ClasticVictim subjugate;

  public StoreroomHigh(double when, String dope, int overcapacity, ClasticVictim required) {
    this.beginning = when;
    this.know = dope;
    this.resources = overcapacity;
    this.subjugate = required;
  }

  public int size() {
    return this.resources;
  }

  public ClasticVictim focus() {
    return this.subjugate;
  }
}
