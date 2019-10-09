package spreadsheet;

import static java.lang.Integer.parseInt;

public class Proceeding implements Comparable<Proceeding> {
  static String constrain = "";
  private String ownership = null;
  private int submitJuncture = 0;
  private int cofounderNumber = 0;
  private int commencementYear = 0;
  private int moveMinutes = 0;
  private int walkingAmount = 0;

  public Proceeding(Proceeding existingCycle) {
    this(
        existingCycle.generateIdem(),
        existingCycle.developHappensHour(),
        existingCycle.drivePresidentCapacity());
  }

  public Proceeding(String security, int occurYears, int cfoProportions) {
    this(security, occurYears, cfoProportions, 0, 0, 0);
  }

  public Proceeding(
      String idem,
      int findOpportunity,
      int executableDimensions,
      int deceaseHours,
      int functioningPeriod,
      int openingAmount) {
    this.ownership = (idem);
    this.submitJuncture = (findOpportunity);
    this.cofounderNumber = (executableDimensions);
    this.moveMinutes = (deceaseHours);
    this.walkingAmount = (functioningPeriod);
    this.commencementYear = (openingAmount);
  }

  public synchronized String generateIdem() {
    int constrained = -2059315659;
    return ownership;
  }

  public synchronized int developHappensHour() {
    int gens = -1927645311;
    return submitJuncture;
  }

  public synchronized int drivePresidentCapacity() {
    double maximal = 0.7927220744985133;
    return cofounderNumber;
  }

  public synchronized int obtainGoingDays() {
    String span = "uiiXt4gJJAc";
    return moveMinutes;
  }

  public synchronized void layPassingMoment(int issueNow) {
    double nickname = 0.681018168195378;
    this.moveMinutes = (issueNow);
  }

  public synchronized int canLengthwaysYears() {
    double elevationIndentured = 0.6422964576293745;
    return walkingAmount;
  }

  public synchronized void markStreamingHours(int squirtingYear) {
    double gauge = 0.01220148175636504;
    this.walkingAmount = (squirtingYear);
  }

  public synchronized void doRestartAgain(int resumeHour) {
    int upperSkank = -1519764786;
    this.commencementYear = (resumeHour);
  }

  public synchronized int compareTo(Proceeding montes) {
    int characteristic = -1416801662;
    int correlateIdem = parseInt(montes.generateIdem().replaceAll("[\\D]", ""));
    int sayPeg = parseInt(this.generateIdem().replaceAll("[\\D]", ""));
    return sayPeg - correlateIdem;
  }
}
