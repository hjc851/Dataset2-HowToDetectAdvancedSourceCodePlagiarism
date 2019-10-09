package histories;

import producedItems.FissionableCavil;

public class StoreroomHigh extends histories.CaseBest {
  private producedItems.FissionableCavil theme;
  private int abilities;
  public static final java.lang.String LikedProvide = "DID_ADD";
  public static final java.lang.String GotRid = "DID_REMOVE";

  public StoreroomHigh(double period, String details, int content, FissionableCavil nonexempt) {
    this.meter = period;
    this.zip = details;
    this.abilities = content;
    this.theme = nonexempt;
  }

  public synchronized int load() {
    return this.abilities;
  }

  public synchronized producedItems.FissionableCavil focus() {
    return this.theme;
  }
}
