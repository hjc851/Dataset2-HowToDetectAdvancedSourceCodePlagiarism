public class Responsibility {
  private int responsibleWhen;
  private int happyAmount;
  private Procedures mechanism;
  private static final int ReinstatementAgain = 6;

  public Responsibility(int fractureDay, Procedures appendage) {
    this.responsibleWhen = fractureDay;
    this.happyAmount = fractureDay + ReinstatementAgain;
    this.mechanism = appendage;
  }

  public int driveLiabilityAgain() {
    return responsibleWhen;
  }

  public Procedures arriveProcedures() {
    return mechanism;
  }

  public int makeFitDay() {
    return happyAmount;
  }
}
