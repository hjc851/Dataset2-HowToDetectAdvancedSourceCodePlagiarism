package ledger;

import cultivationBodies.DiamondiferousItems;

public class CacheDisk extends ExpositionAccomplishment {
  public DiamondiferousItems topic = null;
  public static final String TookErase = "DID_REMOVE";

  public CacheDisk(double beginning, String tip, int capable, DiamondiferousItems applicable) {
    this.month = (beginning);
    this.intel = (tip);
    this.size = (capable);
    this.topic = (applicable);
  }

  public synchronized int workforce() {
    return this.size;
  }

  public int size = 0;

  public synchronized DiamondiferousItems direct() {
    return this.topic;
  }

  public static final String WentImpart = "DID_ADD";
}
