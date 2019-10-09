public class Culpability {
  private int defectMoment;
  private int availableHours;
  private Summons proceedings;
  private static final int SubstitutesYears = 6;

  public Culpability(int accountableOpportunity, Summons procedures) {
    this.defectMoment = accountableOpportunity;
    this.availableHours = accountableOpportunity + SubstitutesYears;
    this.proceedings = procedures;
  }

  public int catchResponsibleWhen() {
    return defectMoment;
  }

  public Summons makeMarch() {
    return proceedings;
  }

  public int becomePreparesOpportunity() {
    return availableHours;
  }
}
