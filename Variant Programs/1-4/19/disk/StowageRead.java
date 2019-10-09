package disk;

import producingAim.PerformableObjection;

public class StowageRead extends RallyHigh {
  public PerformableObjection taxable = null;
  public int volume = 0;
  public static final String GaveInject = "DID_ADD";
  public static final String ForgotRemoval = "DID_REMOVE";

  public StowageRead(double hour, String dope, int authority, PerformableObjection concerning) {
    this.moment = hour;
    this.media = dope;
    this.volume = authority;
    this.taxable = concerning;
  }

  public synchronized int capacitance() {
    return this.volume;
  }

  public synchronized PerformableObjection direct() {
    return this.taxable;
  }
}
