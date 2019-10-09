package timer;

public class Serve implements Comparable<Serve> {
  private String quod;
  private int adoptAmount;
  private int enforceableWidth;
  private int goSentence;
  private int releasePeriods;
  private int lengthwiseHour;

  public Serve(Serve latestOperation) {
    this(
        latestOperation.makeDimidiate(),
        latestOperation.drawBringWeek(),
        latestOperation.drawBossScope());
  }

  public Serve(String milad, int concludeMinutes, int bigwigSmallness) {
    this(milad, concludeMinutes, bigwigSmallness, 0, 0, 0);
  }

  public Serve(
      String pictures,
      int arrivalMeter,
      int bizBreadth,
      int perishMonth,
      int continualOpportunity,
      int partMonth) {
    this.quod = pictures;
    this.adoptAmount = arrivalMeter;
    this.enforceableWidth = bizBreadth;
    this.releasePeriods = perishMonth;
    this.lengthwiseHour = continualOpportunity;
    this.goSentence = partMonth;
  }

  public String makeDimidiate() {
    return quod;
  }

  public int drawBringWeek() {
    return adoptAmount;
  }

  public int drawBossScope() {
    return enforceableWidth;
  }

  public int arrivePerishMonth() {
    return releasePeriods;
  }

  public void determinedGoingDays(int departThing) {
    this.releasePeriods = departThing;
  }

  public int receivePouringMoment() {
    return lengthwiseHour;
  }

  public void determinedScamperingDays(int flowingSentence) {
    this.lengthwiseHour = flowingSentence;
  }

  public void orderedOriginateChance(int commencementYear) {
    this.goSentence = commencementYear;
  }

  public int compareTo(Serve coxae) {
    int relativeName = Integer.parseInt(coxae.makeDimidiate().replaceAll("[\\D]", ""));
    int letIdentification = Integer.parseInt(this.makeDimidiate().replaceAll("[\\D]", ""));
    return letIdentification - relativeName;
  }
}
