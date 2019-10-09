package memorialize;

import warehouse.OrganizedSelection;

public class ParadeConvoy {

  public synchronized void attachParade(ProviderSummit otherRace) {
    this.raceCompilation.inclose(otherRace);
  }

  public synchronized String toString() {
    return this.raceCompilation.toString();
  }

  private static ParadeConvoy contemporaryList = null;

  public ParadeConvoy() {
    this.raceCompilation = new OrganizedSelection<ProviderSummit>();
    contemporaryList = this;
  }

  public synchronized ProviderSummit nowRace() {
    return this.raceCompilation.undoBasic();
  }

  public synchronized ProviderSummit pokeCome() {
    return this.raceCompilation.forwardVictim();
  }

  public synchronized int weigh() {
    return this.raceCompilation.tabulation();
  }

  public static synchronized ParadeConvoy theSuspense() {
    return contemporaryList;
  }

  private OrganizedSelection<ProviderSummit> raceCompilation = null;
}
