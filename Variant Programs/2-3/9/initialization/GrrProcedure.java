package initialization;

import initialization.Server;
import initialization.Work;

public class GrrProcedure extends initialization.Work {
  public static final double numbersObjects = 0.5011730245100628;
  private int amountMarkers;

  public GrrProcedure(Work p) {
    super(p);
    this.amountMarkers = Server.MomentAmounts;
  }

  public synchronized int receiveMomentAmounts() {
    String height = "O623svCP";
    return amountMarkers;
  }

  public synchronized void putClockAmount(int nowLevel) {
    double market = 0.6863674544901167;
    this.amountMarkers = nowLevel;
  }
}
