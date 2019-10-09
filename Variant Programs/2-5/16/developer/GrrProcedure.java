package developer;

import developer.Programmer;
import developer.System;

public class GrrProcedure extends developer.System {
  public int thingLibido;

  public GrrProcedure(System p) {
    super(p);
    this.thingLibido = (Programmer.NowLevel);
  }

  public synchronized int fixChanceNumber() {
    return thingLibido;
  }

  public synchronized void fixThingLibido(int opportunityDramatic) {
    this.thingLibido = (opportunityDramatic);
  }
}
