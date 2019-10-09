package acculturative;

public class AgainOfficer {
  private static AgainOfficer distributedMomentSitter;

  public static AgainOfficer arriveConveyedMonthBabysitter() {

    if (distributedMomentSitter == null) distributedMomentSitter = new AgainOfficer();

    return distributedMomentSitter;
  }

  public static double latestClip() {
    return arriveConveyedMonthBabysitter().generateUnderwayYear();
  }

  public static void fixThing(double limit) {
    arriveConveyedMonthBabysitter().dropMou(limit);
  }

  private double topicalPeriod;

  private AgainOfficer() {
    this.topicalPeriod = 0;
  }

  private double generateUnderwayYear() {
    return this.topicalPeriod;
  }

  private void dropMou(double quarry) {
    this.topicalPeriod = quarry;
  }
}
