package server;

import server.Database;
import server.Procedure;

public class GrrProcedure extends Procedure {
  private int clockAmount;

  public GrrProcedure(Procedure p) {
    super(p);
    this.clockAmount = (Database.PeriodsGigantic);
  }

  public synchronized int fetchBeginningMammoth() {
    return clockAmount;
  }

  public synchronized void arrangedSentenceTeleportation(int daysQuantitative) {
    this.clockAmount = (daysQuantitative);
  }
}
