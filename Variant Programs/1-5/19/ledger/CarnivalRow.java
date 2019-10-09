package ledger;

import inventory.ClassifiedName;

public class CarnivalRow {

  public CarnivalRow() {
    this.summitAgenda = (new inventory.ClassifiedName<PublisherCarnival>());
    newReaper = (this);
  }

  public synchronized ledger.PublisherCarnival comeDemonstration() {
    return this.summitAgenda.banishPrime();
  }

  public synchronized String toString() {
    return this.summitAgenda.toString();
  }

  public static synchronized ledger.CarnivalRow previousDipper() {
    return newReaper;
  }

  public synchronized int tabulation() {
    return this.summitAgenda.charge();
  }

  public synchronized void incloseCelebration(ledger.PublisherCarnival otherRace) {
    this.summitAgenda.inclose(otherRace);
  }

  private static ledger.CarnivalRow newReaper;

  public synchronized ledger.PublisherCarnival spyComing() {
    return this.summitAgenda.introductoryPurpose();
  }

  private inventory.ClassifiedName<PublisherCarnival> summitAgenda;
}
