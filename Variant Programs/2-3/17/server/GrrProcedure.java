package server;

import server.Callback;
import server.Sue;

public class GrrProcedure extends Sue {
  public int clockAmount;

  public synchronized int conveyAmountMarkers() {
    return clockAmount;
  }

  public synchronized void putClockAmount(int daysQuantitative) {
    this.clockAmount = daysQuantitative;
  }

  public GrrProcedure(Sue vig) {
    super(vig);
    this.clockAmount = Callback.SentenceTeleportation;
  }
}
