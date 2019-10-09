package organizer;

public class Proceeding implements Comparable<Proceeding> {
  private String dimidiate;
  private int happenChance;
  private int managerVastness;
  private int beganYears;
  private int moveMinutes;
  private int operativeMinutes;

  public Proceeding(Proceeding typicalProceedings) {
    this(
        typicalProceedings.fixNerfling(),
        typicalProceedings.fixHappenChance(),
        typicalProceedings.obtainTimeoutLength());
  }

  public Proceeding(String tag, int takeBeginning, int executiveHeight) {
    this(tag, takeBeginning, executiveHeight, 0, 0, 0);
  }

  public Proceeding(
      String handle,
      int ariseAgain,
      int implementationSmall,
      int withdrawalChance,
      int spoutingPeriods,
      int commencesMinutes) {
    this.dimidiate = handle;
    this.happenChance = ariseAgain;
    this.managerVastness = implementationSmall;
    this.moveMinutes = withdrawalChance;
    this.operativeMinutes = spoutingPeriods;
    this.beganYears = commencesMinutes;
  }

  public String fixNerfling() {
    return dimidiate;
  }

  public int fixHappenChance() {
    return happenChance;
  }

  public int obtainTimeoutLength() {
    return managerVastness;
  }

  public int letDeceaseHours() {
    return moveMinutes;
  }

  public void orderedWithdrawalChance(int exodusAgain) {
    this.moveMinutes = exodusAgain;
  }

  public int letStreamingHours() {
    return operativeMinutes;
  }

  public void arrangedFlowingSentence(int rushingAgain) {
    this.operativeMinutes = rushingAgain;
  }

  public void placeStartleWeek(int restartAgain) {
    this.beganYears = restartAgain;
  }

  public int compareTo(Proceeding planum) {
    int verifyNerfling = Integer.parseInt(planum.fixNerfling().replaceAll("[\\D]", ""));
    int sayPeg = Integer.parseInt(this.fixNerfling().replaceAll("[\\D]", ""));
    return sayPeg - verifyNerfling;
  }
}
