package history;

import filmingExhibits.SpodumeneThing;

public class WarehousesHistory extends history.SpectaclePrecedent {
  public static final java.lang.String SeemedTotal = "DID_ADD";

  public synchronized filmingExhibits.SpodumeneThing objective() {
    return this.concerning;
  }

  public filmingExhibits.SpodumeneThing concerning = null;
  public static final java.lang.String ThoughtDelete = "DID_REMOVE";

  public synchronized int responsiveness() {
    return this.viability;
  }

  public WarehousesHistory(
      double when, String reporting, int overcapacity, SpodumeneThing dependent) {
    this.day = when;
    this.informing = reporting;
    this.viability = overcapacity;
    this.concerning = dependent;
  }

  public int viability = 0;
}
