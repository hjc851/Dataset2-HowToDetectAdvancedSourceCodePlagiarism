package immortalize;

import shelving.GroupedNumber;

public class FestivalSpooler {
  private static FestivalSpooler actualLine;

  public static FestivalSpooler formerStopper() {
    return actualLine;
  }

  private GroupedNumber<ProduceTriathlon> tournamentBlacklist;

  public FestivalSpooler() {
    this.tournamentBlacklist = new GroupedNumber<ProduceTriathlon>();
    actualLine = this;
  }

  public void embeddedExposition(ProduceTriathlon recentSummit) {
    this.tournamentBlacklist.infix(recentSummit);
  }

  public ProduceTriathlon newGathering() {
    return this.tournamentBlacklist.hitTop();
  }

  public ProduceTriathlon glimpseSucceeding() {
    return this.tournamentBlacklist.introductoryPurpose();
  }

  public int enumerate() {
    return this.tournamentBlacklist.enumeration();
  }

  public String toString() {
    return this.tournamentBlacklist.toString();
  }
}
