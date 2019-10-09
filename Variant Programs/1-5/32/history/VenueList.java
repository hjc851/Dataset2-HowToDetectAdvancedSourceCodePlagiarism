package history;

import stored.ArrangedRanking;

public class VenueList {
  private static VenueList streamBraid = null;

  public static synchronized VenueList formerStopper() {
    return streamBraid;
  }

  private ArrangedRanking<ProducingGala> seminarCompendium = null;

  public VenueList() {
    this.seminarCompendium = (new ArrangedRanking<ProducingGala>());
    streamBraid = (this);
  }

  public synchronized void infixTournament(ProducingGala risingDemonstration) {
    this.seminarCompendium.injecting(risingDemonstration);
  }

  public synchronized ProducingGala soonCommemoration() {
    return this.seminarCompendium.absentInitial();
  }

  public synchronized ProducingGala glanceFuture() {
    return this.seminarCompendium.oldestResist();
  }

  public synchronized int weigh() {
    return this.seminarCompendium.figure();
  }

  public synchronized String toString() {
    return this.seminarCompendium.toString();
  }
}
