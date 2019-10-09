package planner;

import planner.Programmer;
import planner.March;

public class GrrProcedure extends planner.March {

  public GrrProcedure(March p) {
    super(p);
    this.daySum = Programmer.AgainGiant;
  }

  private int daySum = 0;

  public synchronized void prepareNowLevel(int beginningMammoth) {
    this.daySum = beginningMammoth;
  }

  public synchronized int findSentenceTeleportation() {
    return daySum;
  }
}
