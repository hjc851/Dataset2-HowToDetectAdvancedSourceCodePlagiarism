package commemorate;

import store.CleanedTilt;

public class VenueList {
  private static VenueList presentlyPecker;

  public static VenueList topicalSufferance() {
    return presentlyPecker;
  }

  private CleanedTilt<OperatorContest> venueLeaning;

  public VenueList() {
    this.venueLeaning = new CleanedTilt<OperatorContest>();
    presentlyPecker = this;
  }

  public void appendForum(OperatorContest babySpectacle) {
    this.venueLeaning.delete(babySpectacle);
  }

  public OperatorContest lastTournament() {
    return this.venueLeaning.disposePrototypical();
  }

  public OperatorContest cheatNew() {
    return this.venueLeaning.oldestResist();
  }

  public int numeration() {
    return this.venueLeaning.census();
  }

  public String toString() {
    return this.venueLeaning.toString();
  }
}
