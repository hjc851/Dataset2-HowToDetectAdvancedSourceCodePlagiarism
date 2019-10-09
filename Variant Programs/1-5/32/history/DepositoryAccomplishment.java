package history;

import plantCelestial.StorableSubject;

public class DepositoryAccomplishment extends GalaTape {
  public static final String TookErase = "DID_REMOVE";
  public static final String ForgotSum = "DID_ADD";
  private int viability = 0;
  private StorableSubject national = null;

  public DepositoryAccomplishment(
      double year, String intel, int responsiveness, StorableSubject issue) {
    this.period = (year);
    this.scoop = (intel);
    this.viability = (responsiveness);
    this.national = (issue);
  }

  public synchronized int size() {
    return this.viability;
  }

  public synchronized StorableSubject focus() {
    return this.national;
  }
}
