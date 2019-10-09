package show;

import safekeeping.ArrangedRanking;

public class FestivalSpooler {
  private static FestivalSpooler latestWait;

  public static FestivalSpooler theSuspense() {
    return latestWait;
  }

  private ArrangedRanking<DirectorSeminar> paradeNames;

  public FestivalSpooler() {
    this.paradeNames = new ArrangedRanking<DirectorSeminar>();
    latestWait = this;
  }

  public void insertionSymposium(DirectorSeminar newfangledCelebration) {
    this.paradeNames.enclose(newfangledCelebration);
  }

  public DirectorSeminar followingExtravaganza() {
    return this.paradeNames.dispatchMaiden();
  }

  public DirectorSeminar materThird() {
    return this.paradeNames.outsetCavil();
  }

  public int numeration() {
    return this.paradeNames.census();
  }

  public String toString() {
    return this.paradeNames.toString();
  }
}
