package lapse;

public class AmountRearing {
  private static AmountRearing relayedPeriodsManager;

  public static AmountRearing sustainSplitThingCatch() {

    if (relayedPeriodsManager == null) relayedPeriodsManager = new AmountRearing();

    return relayedPeriodsManager;
  }

  public static double newChance() {
    return sustainSplitThingCatch().catchRifeWhen();
  }

  public static void determineBeginning(double butt) {
    sustainSplitThingCatch().surgeSpecialists(butt);
  }

  private double previousHour;

  private AmountRearing() {
    this.previousHour = 0;
  }

  private double catchRifeWhen() {
    return this.previousHour;
  }

  private void surgeSpecialists(double focussed) {
    this.previousHour = focussed;
  }
}
