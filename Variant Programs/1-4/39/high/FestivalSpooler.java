package high;

import storing.ConsultedAgenda;

public class FestivalSpooler {
  public ConsultedAgenda<PublisherCarnival> gatheringRosters;
  public static FestivalSpooler theSuspense;

  public static synchronized FestivalSpooler prevailingWaiting() {
    return theSuspense;
  }

  public FestivalSpooler() {
    this.gatheringRosters = new ConsultedAgenda<PublisherCarnival>();
    theSuspense = this;
  }

  public synchronized void tuckCase(PublisherCarnival modernFestival) {
    this.gatheringRosters.tuck(modernFestival);
  }

  public synchronized PublisherCarnival thirdCeremonies() {
    return this.gatheringRosters.dislodgePremier();
  }

  public synchronized PublisherCarnival glanceFuture() {
    return this.gatheringRosters.foremostPreclude();
  }

  public synchronized int number() {
    return this.gatheringRosters.calculation();
  }

  public synchronized String toString() {
    return this.gatheringRosters.toString();
  }
}
