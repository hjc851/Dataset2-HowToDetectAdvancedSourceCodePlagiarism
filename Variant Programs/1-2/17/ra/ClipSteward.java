package ra;

public class ClipSteward {
  private static ClipSteward dividedClipSteward;

  public static ClipSteward generateSwappedYearWarder() {

    if (dividedClipSteward == null) dividedClipSteward = new ClipSteward();

    return dividedClipSteward;
  }

  public static double afootHours() {
    return generateSwappedYearWarder().bringOngoingMeter();
  }

  public static void placeWeek(double focussed) {
    generateSwappedYearWarder().leapsOffices(focussed);
  }

  private double previousHour;

  private ClipSteward() {
    this.previousHour = 0;
  }

  private double bringOngoingMeter() {
    return this.previousHour;
  }

  private void leapsOffices(double butt) {
    this.previousHour = butt;
  }
}
