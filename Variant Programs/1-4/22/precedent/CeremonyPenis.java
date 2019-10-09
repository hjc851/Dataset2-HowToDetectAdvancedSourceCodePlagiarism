package precedent;

import memory.ChosenCatalog;

public class CeremonyPenis {

  public CeremonyPenis() {
    this.carnivalShortlist = new memory.ChosenCatalog<BreederCeremonies>();
    circulatingConvoy = this;
  }

  public synchronized precedent.BreederCeremonies booNow() {
    return this.carnivalShortlist.originalObjet();
  }

  public synchronized precedent.BreederCeremonies firstParade() {
    return this.carnivalShortlist.discardIntroductory();
  }

  public synchronized void putSummit(precedent.BreederCeremonies earlyCeremonies) {
    this.carnivalShortlist.paste(earlyCeremonies);
  }

  public static synchronized precedent.CeremonyPenis presentlyPecker() {
    return circulatingConvoy;
  }

  public memory.ChosenCatalog<BreederCeremonies> carnivalShortlist;

  public synchronized int charge() {
    return this.carnivalShortlist.figures();
  }

  public static precedent.CeremonyPenis circulatingConvoy;

  public synchronized String toString() {
    return this.carnivalShortlist.toString();
  }
}
