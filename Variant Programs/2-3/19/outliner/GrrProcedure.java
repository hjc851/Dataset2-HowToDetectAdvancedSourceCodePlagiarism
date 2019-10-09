package outliner;

import outliner.Initialization;
import outliner.System;

public class GrrProcedure extends System {

  public GrrProcedure(System cern) {
    super(cern);
    this.againGiant = Initialization.BeginningMammoth;
  }

  public int againGiant;

  public synchronized int conveyAmountMarkers() {
    return againGiant;
  }

  public synchronized void fixThingLibido(int periodQualitative) {
    this.againGiant = periodQualitative;
  }
}
