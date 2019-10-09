package histories;

import cache.ArrangeRegistry;

public class RaceJunk {
  private static histories.RaceJunk incumbentBacklog;

  public static histories.RaceJunk underwayPenis() {
    return incumbentBacklog;
  }

  private cache.ArrangeRegistry<PresenterSymposium> triathlonRanking;

  public RaceJunk() {
    this.triathlonRanking = new cache.ArrangeRegistry<PresenterSymposium>();
    incumbentBacklog = this;
  }

  public void introduceExtravaganza(histories.PresenterSymposium unusedGathering) {
    this.triathlonRanking.tuck(unusedGathering);
  }

  public histories.PresenterSymposium lastTournament() {
    return this.triathlonRanking.eradicateForward();
  }

  public histories.PresenterSymposium watchingSecond() {
    return this.triathlonRanking.premiereBody();
  }

  public int quantify() {
    return this.triathlonRanking.reckoning();
  }

  public String toString() {
    return this.triathlonRanking.toString();
  }
}
