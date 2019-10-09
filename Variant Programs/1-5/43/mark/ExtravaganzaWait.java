package mark;

import space.ArrangedRanking;

public class ExtravaganzaWait {
  public static ExtravaganzaWait liveStandby = null;

  public static synchronized ExtravaganzaWait latestWait() {
    return liveStandby;
  }

  public ArrangedRanking<FabricatorCommemoration> demonstrationCatalog = null;

  public ExtravaganzaWait() {
    this.demonstrationCatalog = (new ArrangedRanking<FabricatorCommemoration>());
    liveStandby = (this);
  }

  public synchronized void insertionSymposium(FabricatorCommemoration unusedGathering) {
    this.demonstrationCatalog.integrate(unusedGathering);
  }

  public synchronized FabricatorCommemoration futureCase() {
    return this.demonstrationCatalog.withdrawKickoff();
  }

  public synchronized FabricatorCommemoration glanceFuture() {
    return this.demonstrationCatalog.topObjection();
  }

  public synchronized int consider() {
    return this.demonstrationCatalog.figures();
  }

  public synchronized String toString() {
    return this.demonstrationCatalog.toString();
  }
}
