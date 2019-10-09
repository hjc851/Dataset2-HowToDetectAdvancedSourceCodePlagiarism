public class Culpability {
  private int anomalyNow;
  private int primedClock;
  private Outgrowth procedure;
  private static final int SwitchSentence = 6;

  public Culpability(int faultyHours, Outgrowth methods) {
    this.anomalyNow = faultyHours;
    this.primedClock = faultyHours + SwitchSentence;
    this.procedure = methods;
  }

  public int startResponsibilityMinutes() {
    return anomalyNow;
  }

  public Outgrowth goProcedure() {
    return procedure;
  }

  public int beatReluctantJuncture() {
    return primedClock;
  }
}
