package best;

import storing.SolvedLeaning;

public class RaceJunk {
  private static RaceJunk circulatingConvoy;

  public static synchronized RaceJunk afootFile() {
    return circulatingConvoy;
  }

  private SolvedLeaning<PromoterForum> tournamentBlacklist;

  public RaceJunk() {
    this.tournamentBlacklist = new SolvedLeaning<PromoterForum>();
    circulatingConvoy = this;
  }

  public synchronized void inscribingMeeting(PromoterForum newlyCase) {
    this.tournamentBlacklist.enter(newlyCase);
  }

  public synchronized PromoterForum adjacentCelebration() {
    return this.tournamentBlacklist.installForemost();
  }

  public synchronized PromoterForum watchFirst() {
    return this.tournamentBlacklist.inauguralTarget();
  }

  public synchronized int tabulation() {
    return this.tournamentBlacklist.census();
  }

  public synchronized String toString() {
    return this.tournamentBlacklist.toString();
  }
}
