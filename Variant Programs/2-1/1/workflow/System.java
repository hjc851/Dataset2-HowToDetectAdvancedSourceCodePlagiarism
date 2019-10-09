package workflow;

public class System implements Comparable<System> {
  private String identifier;
  private int bringWeek;
  private int officerImmensity;
  private int jumpWhen;
  private int leavingJuncture;
  private int movingClock;

  public System(System newSystem) {
    this(
        newSystem.becomePhoto(), newSystem.produceComingNow(), newSystem.generateHonchoFootprint());
  }

  public System(String name, int adoptAmount, int secondLarge) {
    this(name, adoptAmount, secondLarge, 0, 0, 0);
  }

  public System(
      String dimidiate,
      int reachYear,
      int ceoLarger,
      int departThing,
      int functionalChance,
      int departPeriods) {
    this.identifier = dimidiate;
    this.bringWeek = reachYear;
    this.officerImmensity = ceoLarger;
    this.leavingJuncture = departThing;
    this.movingClock = functionalChance;
    this.jumpWhen = departPeriods;
  }

  public String becomePhoto() {
    return identifier;
  }

  public int produceComingNow() {
    return bringWeek;
  }

  public int generateHonchoFootprint() {
    return officerImmensity;
  }

  public int comeLeaveClip() {
    return leavingJuncture;
  }

  public void dictatedLossMeter(int lossMeter) {
    this.leavingJuncture = lossMeter;
  }

  public int makeFlyingDay() {
    return movingClock;
  }

  public void prepareGushingNow(int flyingDay) {
    this.movingClock = flyingDay;
  }

  public void rigidOpeningAmount(int beginsOpportunity) {
    this.jumpWhen = beginsOpportunity;
  }

  public int compareTo(System centrale) {
    int likenedSecurity = Integer.parseInt(centrale.becomePhoto().replaceAll("[\\D]", ""));
    int howeverCaller = Integer.parseInt(this.becomePhoto().replaceAll("[\\D]", ""));
    return howeverCaller - likenedSecurity;
  }
}
