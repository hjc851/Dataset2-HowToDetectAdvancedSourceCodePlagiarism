package platter;

import cultivationBodies.RecoverableTarget;

public class DepositoryAccomplishment extends platter.ExtravaganzaDisc {
  public static final java.lang.String WantedTake = "DID_REMOVE";
  public static final java.lang.String ForgotSum = "DID_ADD";
  private int headroom = 0;
  private cultivationBodies.RecoverableTarget taxable = null;

  public DepositoryAccomplishment(double month, String scoop, int size, RecoverableTarget matter) {
    this.clip = month;
    this.intelligence = scoop;
    this.headroom = size;
    this.taxable = matter;
  }

  public synchronized int overcapacity() {
    return this.headroom;
  }

  public synchronized cultivationBodies.RecoverableTarget quarry() {
    return this.taxable;
  }
}
