package workflow;

public class Proceedings implements Comparable<Proceedings> {
  private String quod;
  private int disembarkSentence;
  private int executionThickness;
  private int kickoffHours;
  private int pulloutHour;
  private int walkingAmount;

  public Proceedings(Proceedings circulatingServe) {
    this(
        circulatingServe.fixNerfling(),
        circulatingServe.startConcludeMinutes(),
        circulatingServe.canChairmanAmount());
  }

  public Proceedings(String identifying, int sendDays, int enforceableWidth) {
    this(identifying, sendDays, enforceableWidth, 0, 0, 0);
  }

  public Proceedings(
      String handle,
      int findOpportunity,
      int timeoutLength,
      int dieYear,
      int scamperingDays,
      int goSentence) {
    this.quod = handle;
    this.disembarkSentence = findOpportunity;
    this.executionThickness = timeoutLength;
    this.pulloutHour = dieYear;
    this.walkingAmount = scamperingDays;
    this.kickoffHours = goSentence;
  }

  public String fixNerfling() {
    return quod;
  }

  public int startConcludeMinutes() {
    return disembarkSentence;
  }

  public int canChairmanAmount() {
    return executionThickness;
  }

  public int catchExpireWhen() {
    return pulloutHour;
  }

  public void situatedMoveMinutes(int quittingAmount) {
    this.pulloutHour = quittingAmount;
  }

  public int makeFlyingDay() {
    return walkingAmount;
  }

  public void markStreamingHours(int gushingNow) {
    this.walkingAmount = gushingNow;
  }

  public void fixedBeginsOpportunity(int beganYears) {
    this.kickoffHours = beganYears;
  }

  public int compareTo(Proceedings bone) {
    int comparableEst = Integer.parseInt(bone.fixNerfling().replaceAll("[\\D]", ""));
    int letIdentification = Integer.parseInt(this.fixNerfling().replaceAll("[\\D]", ""));
    return letIdentification - comparableEst;
  }
}
