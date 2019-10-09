package performance;

import cache.AssignedBibliography;

public class GalaLine {
  private cache.AssignedBibliography<GrowerParade> rallySelection = null;
  private static performance.GalaLine thisDong = null;

  public static synchronized performance.GalaLine prevailingWaiting() {
    return thisDong;
  }

  public GalaLine() {
    this.rallySelection = new cache.AssignedBibliography<GrowerParade>();
    thisDong = this;
  }

  public synchronized void integrateDemonstration(performance.GrowerParade earlyCeremonies) {
    this.rallySelection.integrate(earlyCeremonies);
  }

  public synchronized performance.GrowerParade earlyMeeting() {
    return this.rallySelection.dispatchMaiden();
  }

  public synchronized performance.GrowerParade glintClose() {
    return this.rallySelection.basicOpposes();
  }

  public synchronized int enumerate() {
    return this.rallySelection.tabulation();
  }

  public synchronized String toString() {
    return this.rallySelection.toString();
  }
}
