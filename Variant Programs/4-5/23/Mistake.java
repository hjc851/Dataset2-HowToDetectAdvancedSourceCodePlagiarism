public class Mistake {
  public static final int BackupHour = 6;
  public Phase procedure = null;
  public int happyAmount = 0;
  public int flawMeter = 0;

  public Mistake(int responsibilityMinutes, Phase mechanisms) {
    this.flawMeter = (responsibilityMinutes);
    this.happyAmount = (responsibilityMinutes + BackupHour);
    this.procedure = (mechanisms);
  }

  public synchronized int startResponsibilityMinutes() {
    return flawMeter;
  }

  public synchronized Phase catchSue() {
    return procedure;
  }

  public synchronized int arriveFixMonth() {
    return happyAmount;
  }
}
