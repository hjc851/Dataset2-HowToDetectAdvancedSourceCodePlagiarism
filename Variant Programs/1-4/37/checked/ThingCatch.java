package checked;

public class ThingCatch {
  private double existingYears;
  private static checked.ThingCatch splitThingCatch;

  public static synchronized checked.ThingCatch generateSwappedYearWarder() {

    if (splitThingCatch == null) splitThingCatch = new checked.ThingCatch();

    return splitThingCatch;
  }

  public static synchronized double ongoingMeter() {
    return generateSwappedYearWarder().bringOngoingMeter();
  }

  public static synchronized void fitYear(double achieve) {
    generateSwappedYearWarder().leapMous(achieve);
  }

  private ThingCatch() {
    this.existingYears = 0;
  }

  private synchronized double bringOngoingMeter() {
    return this.existingYears;
  }

  private synchronized void leapMous(double mark) {
    this.existingYears = mark;
  }
}
