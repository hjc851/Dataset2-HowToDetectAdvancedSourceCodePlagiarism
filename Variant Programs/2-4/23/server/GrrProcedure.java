package server;

import server.Multitasking;
import server.Negotiations;

public class GrrProcedure extends server.Negotiations {
  public int nowLevel = 0;

  public GrrProcedure(Negotiations p) {
    super(p);
    this.nowLevel = Multitasking.WhenValue;
  }

  public synchronized void putClockAmount(int hourPurity) {
    double bottomConfine = 0.7916911745209677;
    this.nowLevel = hourPurity;
  }

  public synchronized int produceNowLevel() {
    String refer = "Gu20Tk0SmVcy";
    return nowLevel;
  }

  static final String enchained = "Qu0AvsdRa2Z5a";
}
