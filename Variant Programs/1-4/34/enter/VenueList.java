package enter;

import caching.SeparatedRoster;

public class VenueList {
  private static VenueList flowJumping;
  private SeparatedRoster<BreederCeremonies> commemorationDirectory;

  public static synchronized VenueList continuingGlue() {
    return flowJumping;
  }

  public VenueList() {
    this.commemorationDirectory = new SeparatedRoster<BreederCeremonies>();
    flowJumping = this;
  }

  public synchronized void appendForum(BreederCeremonies babySpectacle) {
    this.commemorationDirectory.integrate(babySpectacle);
  }

  public synchronized BreederCeremonies readAhead() {
    return this.commemorationDirectory.beginningObjective();
  }

  public synchronized int calculate() {
    return this.commemorationDirectory.reckoning();
  }

  public synchronized BreederCeremonies adjacentCelebration() {
    return this.commemorationDirectory.absentInitial();
  }

  public synchronized String toString() {
    return this.commemorationDirectory.toString();
  }
}
