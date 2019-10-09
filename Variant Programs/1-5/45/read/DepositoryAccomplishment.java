package read;

import throughputMaterials.FissionableCavil;

public class DepositoryAccomplishment extends read.SeminarRead {
  public static final java.lang.String NeverAdditions = "DID_ADD";
  private throughputMaterials.FissionableCavil issue = null;
  private int size = 0;

  public synchronized int wherewithal() {
    return this.size;
  }

  public static final java.lang.String CameDiscard = "DID_REMOVE";

  public synchronized throughputMaterials.FissionableCavil place() {
    return this.issue;
  }

  public DepositoryAccomplishment(
      double month, String stuff, int volume, FissionableCavil taxable) {
    this.moment = (month);
    this.zip = (stuff);
    this.size = (volume);
    this.issue = (taxable);
  }
}
