public class Mistake {
  private int flawMeter;
  private int fitDay;
  private Mechanism cycle;
  private static final int RenewalDay = 6;

  public Mistake(int glitchAmount, Mechanism system) {
    this.flawMeter = glitchAmount;
    this.fitDay = glitchAmount + RenewalDay;
    this.cycle = system;
  }

  public int driveLiabilityAgain() {
    return flawMeter;
  }

  public Mechanism conveyFormalities() {
    return cycle;
  }

  public int receiveWaitingMoment() {
    return fitDay;
  }
}
