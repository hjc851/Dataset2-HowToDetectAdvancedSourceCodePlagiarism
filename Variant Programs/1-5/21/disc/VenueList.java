package disc;

import garage.GradedCompendium;

public class VenueList {

  public synchronized String toString() {
    return this.demonstrationCatalog.toString();
  }

  public synchronized GrowersMeeting soonCommemoration() {
    return this.demonstrationCatalog.dislodgePremier();
  }

  public synchronized int reckoning() {
    return this.demonstrationCatalog.quantify();
  }

  private GradedCompendium<GrowersMeeting> demonstrationCatalog = null;
  private static VenueList latestWait = null;

  public synchronized void installCeremonies(GrowersMeeting untriedParade) {
    this.demonstrationCatalog.embed(untriedParade);
  }

  public static synchronized VenueList typicalCola() {
    return latestWait;
  }

  public synchronized GrowersMeeting readAhead() {
    return this.demonstrationCatalog.commencementTotem();
  }

  public VenueList() {
    this.demonstrationCatalog = (new GradedCompendium<GrowersMeeting>());
    latestWait = (this);
  }
}
