package workspace;

public class Proceedings implements Comparable<Proceedings> {
  private String picture;
  private int getClip;
  private int bossScope;
  private int begunBeginning;
  private int perishMonth;
  private int scamperingDays;

  public Proceedings(Proceedings incumbentMarch) {
    this(
        incumbentMarch.makeDimidiate(),
        incumbentMarch.bringArrivalMeter(),
        incumbentMarch.canChairmanAmount());
  }

  public Proceedings(String identifying, int bringWeek, int presidentCapacity) {
    this(identifying, bringWeek, presidentCapacity, 0, 0, 0);
  }

  public Proceedings(
      String identifier,
      int meetPeriods,
      int chiefQuantity,
      int expireWhen,
      int functionalChance,
      int originateChance) {
    this.picture = identifier;
    this.getClip = meetPeriods;
    this.bossScope = chiefQuantity;
    this.perishMonth = expireWhen;
    this.scamperingDays = functionalChance;
    this.begunBeginning = originateChance;
  }

  public String makeDimidiate() {
    return picture;
  }

  public int bringArrivalMeter() {
    return getClip;
  }

  public int canChairmanAmount() {
    return bossScope;
  }

  public int fetchWithdrawBeginning() {
    return perishMonth;
  }

  public void readyOutletDay(int egressYears) {
    this.perishMonth = egressYears;
  }

  public int generateSquirtingYear() {
    return scamperingDays;
  }

  public void markStreamingHours(int rushingAgain) {
    this.scamperingDays = rushingAgain;
  }

  public void fixEarlyThing(int departPeriods) {
    this.begunBeginning = departPeriods;
  }

  public int compareTo(Proceedings ischium) {
    int generalizeIbid = Integer.parseInt(ischium.makeDimidiate().replaceAll("[\\D]", ""));
    int exactlyEst = Integer.parseInt(this.makeDimidiate().replaceAll("[\\D]", ""));
    return exactlyEst - generalizeIbid;
  }
}
