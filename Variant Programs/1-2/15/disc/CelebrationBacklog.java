package disc;

import memory.ChosenCatalog;

public class CelebrationBacklog {
  private static CelebrationBacklog previousDipper;

  public static CelebrationBacklog liveStandby() {
    return previousDipper;
  }

  private ChosenCatalog<EmitterDemonstration> expositionPlaylist;

  public CelebrationBacklog() {
    this.expositionPlaylist = new ChosenCatalog<EmitterDemonstration>();
    previousDipper = this;
  }

  public void insertionSymposium(EmitterDemonstration freshExtravaganza) {
    this.expositionPlaylist.delete(freshExtravaganza);
  }

  public EmitterDemonstration laterSymposium() {
    return this.expositionPlaylist.takeBeginning();
  }

  public EmitterDemonstration pokeCome() {
    return this.expositionPlaylist.outsetCavil();
  }

  public int census() {
    return this.expositionPlaylist.reckoning();
  }

  public String toString() {
    return this.expositionPlaylist.toString();
  }
}
