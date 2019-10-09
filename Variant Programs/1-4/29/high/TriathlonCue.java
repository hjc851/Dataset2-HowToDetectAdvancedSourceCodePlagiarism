package high;

import storeroom.PlacedPlaylist;

public class TriathlonCue {
  private storeroom.PlacedPlaylist<PromoterForum> celebrationTilt;
  private static high.TriathlonCue typicalCola;

  public static synchronized high.TriathlonCue latestWait() {
    return typicalCola;
  }

  public TriathlonCue() {
    this.celebrationTilt = new storeroom.PlacedPlaylist<PromoterForum>();
    typicalCola = this;
  }

  public synchronized void installCeremonies(high.PromoterForum recentlyTournament) {
    this.celebrationTilt.inscribe(recentlyTournament);
  }

  public synchronized high.PromoterForum aheadForum() {
    return this.celebrationTilt.eradicateForward();
  }

  public synchronized high.PromoterForum knockoutForthcoming() {
    return this.celebrationTilt.premiereBody();
  }

  public synchronized int numeration() {
    return this.celebrationTilt.number();
  }

  public synchronized String toString() {
    return this.celebrationTilt.toString();
  }
}
