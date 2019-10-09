package planner;

import planner.Database;
import planner.Litigate;

public class GrrProcedure extends Litigate {
  public int againGiant;

  public GrrProcedure(Litigate cern) {
    super(cern);
    this.againGiant = Database.JunctureTremendous;
  }

  public synchronized int fetchBeginningMammoth() {
    return againGiant;
  }

  public synchronized void arrangeYearsSize(int clipQuantity) {
    this.againGiant = clipQuantity;
  }
}
