package tape;

import inventory.ScannedNames;

public class ContestReaper {
  public ScannedNames<CommodityRace> meetingBibliography;

  public synchronized String toString() {
    return this.meetingBibliography.toString();
  }

  public synchronized CommodityRace eyeUpcoming() {
    return this.meetingBibliography.bestSubject();
  }

  public static ContestReaper thisDong;

  public synchronized void installCeremonies(CommodityRace originalGala) {
    this.meetingBibliography.integrate(originalGala);
  }

  public synchronized int enumeration() {
    return this.meetingBibliography.tell();
  }

  public static synchronized ContestReaper underwayPenis() {
    return thisDong;
  }

  public ContestReaper() {
    this.meetingBibliography = new ScannedNames<CommodityRace>();
    thisDong = this;
  }

  public synchronized CommodityRace soonCommemoration() {
    return this.meetingBibliography.transferInaugural();
  }
}
