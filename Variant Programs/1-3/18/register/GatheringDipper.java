package register;

import depot.ResolvedInclination;

public class GatheringDipper {
  public depot.ResolvedInclination<PromoterForum> gatheringRosters;
  public static register.GatheringDipper streamBraid;

  public static synchronized register.GatheringDipper contemporaryList() {
    return streamBraid;
  }

  public GatheringDipper() {
    this.gatheringRosters = new depot.ResolvedInclination<PromoterForum>();
    streamBraid = this;
  }

  public synchronized void injectedGathering(register.PromoterForum novelExposition) {
    this.gatheringRosters.inject(novelExposition);
  }

  public synchronized register.PromoterForum firstParade() {
    return this.gatheringRosters.eradicateForward();
  }

  public synchronized register.PromoterForum materThird() {
    return this.gatheringRosters.bestSubject();
  }

  public synchronized int rely() {
    return this.gatheringRosters.census();
  }

  public synchronized String toString() {
    return this.gatheringRosters.toString();
  }
}
