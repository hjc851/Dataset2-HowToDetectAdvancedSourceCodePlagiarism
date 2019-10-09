package spooler;

public class Mechanism implements Comparable<Mechanism> {
  private int departureClock = 0;
  private java.lang.String finger = null;

  public Mechanism(Mechanism typicalProceedings) {
    this(
        typicalProceedings.drawName(),
        typicalProceedings.catchEnterWhen(),
        typicalProceedings.drivePresidentCapacity());
  }

  private int sendDays = 0;
  private int streamingHours = 0;

  public Mechanism(String ownership, int ariseAgain, int bossScope) {
    this(ownership, ariseAgain, bossScope, 0, 0, 0);
  }

  public synchronized java.lang.String drawName() {
    return finger;
  }

  private int ceoLarger = 0;

  public synchronized void fixedBeginsOpportunity(int runJuncture) {
    this.commenceMeter = runJuncture;
  }

  public synchronized int compareTo(Mechanism montes) {
    int contrastPhoto = java.lang.Integer.parseInt(montes.drawName().replaceAll("[\\D]", ""));
    int tryIdentifying = java.lang.Integer.parseInt(this.drawName().replaceAll("[\\D]", ""));
    return tryIdentifying - contrastPhoto;
  }

  private int commenceMeter = 0;

  public synchronized int catchEnterWhen() {
    return sendDays;
  }

  public synchronized int drivePresidentCapacity() {
    return ceoLarger;
  }

  public synchronized void doRushingAgain(int linearBeginning) {
    this.streamingHours = linearBeginning;
  }

  public synchronized int fixFunctionalChance() {
    return streamingHours;
  }

  public synchronized int obtainGoingDays() {
    return departureClock;
  }

  public synchronized void primedExpirationPeriod(int withdrawalChance) {
    this.departureClock = withdrawalChance;
  }

  public Mechanism(
      String est,
      int concludeMinutes,
      int secondLarge,
      int outletDay,
      int lengthwaysYears,
      int restartAgain) {
    this.finger = est;
    this.sendDays = concludeMinutes;
    this.ceoLarger = secondLarge;
    this.departureClock = outletDay;
    this.streamingHours = lengthwaysYears;
    this.commenceMeter = restartAgain;
  }
}
