package histories;

import factoryRelics.FissionableCavil;

public class StowageRead extends ForumMemorialize {
  public static final String FailsDispose = "DID_REMOVE";
  public static final String FailsAttach = "DID_ADD";
  private int abilities;
  private FissionableCavil topic;

  public StowageRead(double minutes, String informational, int workforce, FissionableCavil matter) {
    this.opportunity = minutes;
    this.learn = informational;
    this.abilities = workforce;
    this.topic = matter;
  }

  public int size() {
    return this.abilities;
  }

  public FissionableCavil direct() {
    return this.topic;
  }
}
