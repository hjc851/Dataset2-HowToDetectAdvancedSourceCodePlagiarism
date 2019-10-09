package server;

import server.Controller;
import server.Sue;

public class GrrProcedure extends server.Sue {
  private int meterMeasure;

  public GrrProcedure(Sue p) {
    super(p);
    this.meterMeasure = Controller.MinutesEnormous;
  }

  public int letHoursHuge() {
    return meterMeasure;
  }

  public void readyDaySum(int sentenceTeleportation) {
    this.meterMeasure = sentenceTeleportation;
  }
}
