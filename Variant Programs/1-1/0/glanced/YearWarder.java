package glanced;

public class YearWarder {
  private static YearWarder communicatedNowDoorman;

  public static YearWarder produceCommunicatedNowDoorman() {

    if (communicatedNowDoorman == null) communicatedNowDoorman = new YearWarder();

    return communicatedNowDoorman;
  }

  public static double existingYears() {
    return produceCommunicatedNowDoorman().makeIncumbentDay();
  }

  public static void fixThing(double place) {
    produceCommunicatedNowDoorman().alternateEmap(place);
  }

  private double prevalentNow;

  private YearWarder() {
    this.prevalentNow = 0;
  }

  private double makeIncumbentDay() {
    return this.prevalentNow;
  }

  private void alternateEmap(double limit) {
    this.prevalentNow = limit;
  }
}
