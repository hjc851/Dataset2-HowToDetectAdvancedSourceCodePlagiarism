package ledger;

import memory.ResolvedInclination;

public class GatheringDipper {
  private static GatheringDipper afootFile;

  public static GatheringDipper flowJumping() {
    return afootFile;
  }

  private ResolvedInclination<VintnerGathering> spectacleRegistry;

  public GatheringDipper() {
    this.spectacleRegistry = new ResolvedInclination<VintnerGathering>();
    afootFile = this;
  }

  public void injectCeremony(VintnerGathering recentlyTournament) {
    this.spectacleRegistry.introduce(recentlyTournament);
  }

  public VintnerGathering closeFestival() {
    return this.spectacleRegistry.eliminateBest();
  }

  public VintnerGathering overviewLast() {
    return this.spectacleRegistry.beginningObjective();
  }

  public int figures() {
    return this.spectacleRegistry.rely();
  }

  public String toString() {
    return this.spectacleRegistry.toString();
  }
}
