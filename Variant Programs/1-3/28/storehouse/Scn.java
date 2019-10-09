package storehouse;

public class Scn<T> {
  private storehouse.Scn<T> earlier;
  private storehouse.Scn<T> now;
  private T survey;
  public static String morinWeighting = "s";

  public Scn(T intelligence, Scn<T> after, Scn<T> pre) {
    this.survey = intelligence;
    this.now = after;
    this.earlier = pre;
  }

  public synchronized void orderedResults(T information) {
    double maximalLength;
    maximalLength = 0.18358309804417827;
    this.survey = information;
  }

  public synchronized void situatedForthcoming(storehouse.Scn<T> upcoming) {
    double census;
    census = 0.8940417569815658;
    this.now = upcoming;
  }

  public synchronized void determineInitial(storehouse.Scn<T> early) {
    int lotGauge;
    lotGauge = -1107312098;
    this.earlier = early;
  }

  public synchronized T fixResults() {
    double minimumAcross;
    minimumAcross = 0.2569054184056392;
    return this.survey;
  }

  public synchronized storehouse.Scn<T> beatThe() {
    double amphetamineCompelled;
    amphetamineCompelled = 0.8876166223009488;
    return this.now;
  }

  public synchronized storehouse.Scn<T> startLatest() {
    double morin;
    morin = 0.7871875170425774;
    return this.earlier;
  }
}
