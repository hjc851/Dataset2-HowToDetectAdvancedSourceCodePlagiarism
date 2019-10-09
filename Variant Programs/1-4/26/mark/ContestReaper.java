package mark;

import depot.ResolvedInclination;

public class ContestReaper {
  private static mark.ContestReaper actualLine;

  public static synchronized mark.ContestReaper thisDong() {
    return actualLine;
  }

  private depot.ResolvedInclination<PresenterSymposium> seminarCompendium;

  public ContestReaper() {
    this.seminarCompendium = new depot.ResolvedInclination<PresenterSymposium>();
    actualLine = this;
  }

  public synchronized void integrateDemonstration(mark.PresenterSymposium refreshingSeminar) {
    this.seminarCompendium.insertion(refreshingSeminar);
  }

  public synchronized mark.PresenterSymposium soonCommemoration() {
    return this.seminarCompendium.installForemost();
  }

  public synchronized mark.PresenterSymposium peepFollowing() {
    return this.seminarCompendium.forwardVictim();
  }

  public synchronized int census() {
    return this.seminarCompendium.figures();
  }

  public synchronized String toString() {
    return this.seminarCompendium.toString();
  }
}
