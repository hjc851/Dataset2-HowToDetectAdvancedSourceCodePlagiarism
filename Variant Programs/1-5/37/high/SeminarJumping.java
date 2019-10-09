package high;

import safekeeping.SolvedLeaning;

public class SeminarJumping {
  private static SeminarJumping topicalSufferance = null;

  public static synchronized SeminarJumping ongoingSpooler() {
    return topicalSufferance;
  }

  private SolvedLeaning<OperatorContest> seminarCompendium = null;

  public SeminarJumping() {
    this.seminarCompendium = new SolvedLeaning<OperatorContest>();
    topicalSufferance = this;
  }

  public synchronized void attachParade(OperatorContest refreshingSeminar) {
    this.seminarCompendium.enter(refreshingSeminar);
  }

  public synchronized OperatorContest adjacentCelebration() {
    return this.seminarCompendium.takeBeginning();
  }

  public synchronized OperatorContest booNow() {
    return this.seminarCompendium.oldestResist();
  }

  public synchronized int enumerate() {
    return this.seminarCompendium.number();
  }

  public synchronized String toString() {
    return this.seminarCompendium.toString();
  }
}
