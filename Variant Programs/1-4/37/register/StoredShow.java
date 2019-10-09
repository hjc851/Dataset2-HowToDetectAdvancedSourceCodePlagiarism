package register;

import outputTarget.ExhaustibleBody;

public class StoredShow extends register.RacePrevious {
  private outputTarget.ExhaustibleBody relate;
  private int capability;
  public static final java.lang.String KnewAppend = "DID_ADD";
  public static final java.lang.String FailsDispose = "DID_REMOVE";

  public StoredShow(double chance, String intelligence, int size, ExhaustibleBody dependent) {
    this.week = chance;
    this.enquiries = intelligence;
    this.capability = size;
    this.relate = dependent;
  }

  public synchronized int capabilities() {
    return this.capability;
  }

  public synchronized outputTarget.ExhaustibleBody point() {
    return this.relate;
  }
}
