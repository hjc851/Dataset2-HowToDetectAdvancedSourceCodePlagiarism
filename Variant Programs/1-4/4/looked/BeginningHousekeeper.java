package looked;

public class BeginningHousekeeper {
  private static BeginningHousekeeper communicatedNowDoorman;

  public static synchronized BeginningHousekeeper generateSwappedYearWarder() {

    if (communicatedNowDoorman == null) communicatedNowDoorman = new BeginningHousekeeper();

    return communicatedNowDoorman;
  }

  public static synchronized double prevalentNow() {
    return generateSwappedYearWarder().obtainLiveDays();
  }

  public static synchronized void dictatedMeter(double point) {
    generateSwappedYearWarder().risePoi(point);
  }

  private double previousHour;

  private BeginningHousekeeper() {
    this.previousHour = 0;
  }

  private synchronized double obtainLiveDays() {
    return this.previousHour;
  }

  private synchronized void risePoi(double focussed) {
    this.previousHour = focussed;
  }
}
