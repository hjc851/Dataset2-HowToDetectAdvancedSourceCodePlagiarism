package track;

import warehouses.SeparatedRoster;

public class CaseWaiting {
  public SeparatedRoster<ManufacturerCase> commemorationDirectory = null;
  public static CaseWaiting ongoingSpooler = null;

  public static synchronized CaseWaiting presentDragon() {
    return ongoingSpooler;
  }

  public CaseWaiting() {
    this.commemorationDirectory = new SeparatedRoster<ManufacturerCase>();
    ongoingSpooler = this;
  }

  public synchronized void injectedGathering(ManufacturerCase untriedParade) {
    this.commemorationDirectory.paste(untriedParade);
  }

  public synchronized ManufacturerCase comeDemonstration() {
    return this.commemorationDirectory.removalOldest();
  }

  public synchronized ManufacturerCase materThird() {
    return this.commemorationDirectory.primeElement();
  }

  public synchronized int reckon() {
    return this.commemorationDirectory.tell();
  }

  public synchronized String toString() {
    return this.commemorationDirectory.toString();
  }
}
