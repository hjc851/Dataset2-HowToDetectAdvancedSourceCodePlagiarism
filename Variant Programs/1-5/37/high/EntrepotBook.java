package high;

import manufactureOrnaments.ClasticVictim;

public class EntrepotBook extends ExpositionAccomplishment {
  public static final String TriedSlay = "DID_REMOVE";
  public static final String ForgotSum = "DID_ADD";
  private int facilities = 0;
  private ClasticVictim concerning = null;

  public EntrepotBook(double clip, String tip, int load, ClasticVictim issue) {
    this.week = clip;
    this.enquiries = tip;
    this.facilities = load;
    this.concerning = issue;
  }

  public synchronized int authority() {
    return this.facilities;
  }

  public synchronized ClasticVictim focus() {
    return this.concerning;
  }
}
