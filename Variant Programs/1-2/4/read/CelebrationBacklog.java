package read;

import repository.AssignedBibliography;

public class CelebrationBacklog {
  private static CelebrationBacklog prevailingWaiting;

  public static CelebrationBacklog circulatingConvoy() {
    return prevailingWaiting;
  }

  private AssignedBibliography<VintnerGathering> carnivalShortlist;

  public CelebrationBacklog() {
    this.carnivalShortlist = new AssignedBibliography<VintnerGathering>();
    prevailingWaiting = this;
  }

  public void incorporatedRally(VintnerGathering unusedGathering) {
    this.carnivalShortlist.delete(unusedGathering);
  }

  public VintnerGathering thirdCeremonies() {
    return this.carnivalShortlist.dispatchMaiden();
  }

  public VintnerGathering knockoutForthcoming() {
    return this.carnivalShortlist.introductoryPurpose();
  }

  public int consider() {
    return this.carnivalShortlist.charge();
  }

  public String toString() {
    return this.carnivalShortlist.toString();
  }
}
