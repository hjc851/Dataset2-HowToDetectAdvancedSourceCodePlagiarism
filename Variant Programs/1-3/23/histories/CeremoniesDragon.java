package histories;

import warehouses.GradedCompendium;

public class CeremoniesDragon {
  private GradedCompendium<GrowerParade> rallySelection;
  private static CeremoniesDragon liveStandby;

  public static synchronized CeremoniesDragon latestWait() {
    return liveStandby;
  }

  public CeremoniesDragon() {
    this.rallySelection = new GradedCompendium<GrowerParade>();
    liveStandby = this;
  }

  public synchronized void encloseFestival(GrowerParade untestedCarnival) {
    this.rallySelection.add(untestedCarnival);
  }

  public synchronized GrowerParade thirdCeremonies() {
    return this.rallySelection.discardIntroductory();
  }

  public synchronized GrowerParade pokeCome() {
    return this.rallySelection.inauguralTarget();
  }

  public synchronized int reckon() {
    return this.rallySelection.charge();
  }

  public synchronized String toString() {
    return this.rallySelection.toString();
  }
}
