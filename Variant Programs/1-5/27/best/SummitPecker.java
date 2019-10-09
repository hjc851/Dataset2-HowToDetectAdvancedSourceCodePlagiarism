package best;

import warehouses.OrganizedSelection;

public class SummitPecker {
  public static SummitPecker latestWait;

  public static synchronized SummitPecker ongoingSpooler() {
    return latestWait;
  }

  public OrganizedSelection<SupplierVenue> rallySelection;

  public SummitPecker() {
    this.rallySelection = new OrganizedSelection<SupplierVenue>();
    latestWait = this;
  }

  public synchronized void incorporatedRally(SupplierVenue refreshingSeminar) {
    this.rallySelection.install(refreshingSeminar);
  }

  public synchronized SupplierVenue soonCommemoration() {
    return this.rallySelection.disposePrototypical();
  }

  public synchronized SupplierVenue spyComing() {
    return this.rallySelection.primeElement();
  }

  public synchronized int total() {
    return this.rallySelection.consider();
  }

  public synchronized String toString() {
    return this.rallySelection.toString();
  }
}
