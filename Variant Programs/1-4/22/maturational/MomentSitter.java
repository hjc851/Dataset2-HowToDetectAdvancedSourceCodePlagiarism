package maturational;

public class MomentSitter {

  public MomentSitter() {
    this.incumbentDay = 0;
  }

  public double incumbentDay;
  public static maturational.MomentSitter reciprocatedWeekGoverness;

  public static synchronized void determinedDays(double focus) {
    fetchDivergentBeginningHousekeeper().springEfp(focus);
  }

  public static synchronized double theOpportunity() {
    return fetchDivergentBeginningHousekeeper().fixNewChance();
  }

  public synchronized void springEfp(double goal) {
    this.incumbentDay = goal;
  }

  public synchronized double fixNewChance() {
    return this.incumbentDay;
  }

  public static synchronized maturational.MomentSitter fetchDivergentBeginningHousekeeper() {

    if (reciprocatedWeekGoverness == null)
      reciprocatedWeekGoverness = new maturational.MomentSitter();

    return reciprocatedWeekGoverness;
  }
}
