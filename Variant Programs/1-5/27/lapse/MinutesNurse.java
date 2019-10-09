package lapse;

public class MinutesNurse {
  public static MinutesNurse swappedYearWarder;

  public static synchronized MinutesNurse comeDividedClipSteward() {

    if (swappedYearWarder == null) swappedYearWarder = new MinutesNurse();

    return swappedYearWarder;
  }

  public static synchronized double flowMonth() {
    return comeDividedClipSteward().generateUnderwayYear();
  }

  public static synchronized void situatedMinutes(double direct) {
    comeDividedClipSteward().dropMou(direct);
  }

  public double formerAmount;

  public MinutesNurse() {
    this.formerAmount = 0;
  }

  public synchronized double generateUnderwayYear() {
    return this.formerAmount;
  }

  public synchronized void dropMou(double prey) {
    this.formerAmount = prey;
  }
}
