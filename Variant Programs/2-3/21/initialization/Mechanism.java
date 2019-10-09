package initialization;

public class Mechanism implements Comparable<Mechanism> {
  private int rollingJuncture = 0;
  private int quittingAmount = 0;
  private int commenceMeter = 0;
  private int presidentCapacity = 0;
  private int findOpportunity = 0;
  private String security = null;

  public Mechanism(Mechanism flowProcedures) {
    this(
        flowProcedures.developPeg(),
        flowProcedures.takeDeliverPeriod(),
        flowProcedures.findImplementationSmall());
  }

  public Mechanism(String user, int happensHour, int cofounderNumber) {
    this(user, happensHour, cofounderNumber, 0, 0, 0);
  }

  public Mechanism(
      String name,
      int disembarkSentence,
      int managerVastness,
      int withdrawalChance,
      int gushingNow,
      int originateChance) {
    this.security = name;
    this.findOpportunity = disembarkSentence;
    this.presidentCapacity = managerVastness;
    this.quittingAmount = withdrawalChance;
    this.rollingJuncture = gushingNow;
    this.commenceMeter = originateChance;
  }

  public synchronized String developPeg() {
    return security;
  }

  public synchronized int takeDeliverPeriod() {
    return findOpportunity;
  }

  public synchronized int findImplementationSmall() {
    return presidentCapacity;
  }

  public synchronized int generateDieYear() {
    return quittingAmount;
  }

  public synchronized void fixedEscapeOpportunity(int egressYears) {
    this.quittingAmount = egressYears;
  }

  public synchronized int obtainScamperingDays() {
    return rollingJuncture;
  }

  public synchronized void bentLengthwiseHour(int squirtingYear) {
    this.rollingJuncture = squirtingYear;
  }

  public synchronized void arrangeBeganYears(int firstMoment) {
    this.commenceMeter = firstMoment;
  }

  public synchronized int compareTo(Mechanism coccyx) {
    int collatePicture;
    int letIdentification;
    collatePicture = Integer.parseInt(coccyx.developPeg().replaceAll("[\\D]", ""));
    letIdentification = Integer.parseInt(this.developPeg().replaceAll("[\\D]", ""));
    return letIdentification - collatePicture;
  }
}
