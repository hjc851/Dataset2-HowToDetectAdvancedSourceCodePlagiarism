package tape;

import shelving.ArrangeRegistry;

public class CarnivalRow {

  public static synchronized CarnivalRow theSuspense() {
    return prevalentCue;
  }

  public synchronized void incloseCelebration(BreederCeremonies modernFestival) {
    this.raceCompilation.embed(modernFestival);
  }

  public static CarnivalRow prevalentCue;

  public synchronized int enumerate() {
    return this.raceCompilation.reckon();
  }

  public synchronized BreederCeremonies forthcomingSummit() {
    return this.raceCompilation.dismantleFreshman();
  }

  public CarnivalRow() {
    this.raceCompilation = new ArrangeRegistry<BreederCeremonies>();
    prevalentCue = this;
  }

  public ArrangeRegistry<BreederCeremonies> raceCompilation;

  public synchronized BreederCeremonies sneakEarly() {
    return this.raceCompilation.topObjection();
  }

  public synchronized String toString() {
    return this.raceCompilation.toString();
  }
}
