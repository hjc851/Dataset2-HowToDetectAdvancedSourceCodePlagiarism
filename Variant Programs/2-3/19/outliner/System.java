package outliner;

public class System implements Comparable<System> {

  public synchronized void rigidQuittingAmount(int passingMoment) {
    this.releasePeriods = passingMoment;
  }

  public synchronized void fitSquirtingYear(int spoutingPeriods) {
    this.functionalChance = spoutingPeriods;
  }

  public String caller;

  public synchronized void arrangeBeganYears(int openingAmount) {
    this.commencesMinutes = openingAmount;
  }

  public synchronized int compareTo(System naviculare) {
    int comparatorPeg;
    int whateverName;
    comparatorPeg = Integer.parseInt(naviculare.generateIdem().replaceAll("[\\D]", ""));
    whateverName = Integer.parseInt(this.generateIdem().replaceAll("[\\D]", ""));
    return whateverName - comparatorPeg;
  }

  public System(
      String card,
      int enterWhen,
      int secondLarge,
      int expirationPeriod,
      int walkingAmount,
      int partMonth) {
    this.caller = card;
    this.bringWeek = enterWhen;
    this.presidentCapacity = secondLarge;
    this.releasePeriods = expirationPeriod;
    this.functionalChance = walkingAmount;
    this.commencesMinutes = partMonth;
  }

  public synchronized String generateIdem() {
    return caller;
  }

  public synchronized int canEgressYears() {
    return releasePeriods;
  }

  public System(System topicalAppendage) {
    this(
        topicalAppendage.generateIdem(),
        topicalAppendage.becomeFindOpportunity(),
        topicalAppendage.produceVeepDensity());
  }

  public int functionalChance;

  public synchronized int produceVeepDensity() {
    return presidentCapacity;
  }

  public int bringWeek;

  public System(String nerfling, int happenChance, int directorStature) {
    this(nerfling, happenChance, directorStature, 0, 0, 0);
  }

  public synchronized int produceGushingNow() {
    return functionalChance;
  }

  public int presidentCapacity;
  public int commencesMinutes;
  public int releasePeriods;

  public synchronized int becomeFindOpportunity() {
    return bringWeek;
  }
}
