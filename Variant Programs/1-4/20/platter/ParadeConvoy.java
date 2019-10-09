package platter;

import archiving.ArrangeRegistry;

public class ParadeConvoy {
  private static platter.ParadeConvoy newReaper = null;

  public static synchronized platter.ParadeConvoy formerStopper() {
    return newReaper;
  }

  private archiving.ArrangeRegistry<BreederCeremonies> symposiumChecklist = null;

  public ParadeConvoy() {
    this.symposiumChecklist = new archiving.ArrangeRegistry<BreederCeremonies>();
    newReaper = this;
  }

  public synchronized void infixTournament(platter.BreederCeremonies youngTriathlon) {
    this.symposiumChecklist.infix(youngTriathlon);
  }

  public synchronized platter.BreederCeremonies afterSpectacle() {
    return this.symposiumChecklist.undoBasic();
  }

  public synchronized platter.BreederCeremonies peruseThe() {
    return this.symposiumChecklist.foremostPreclude();
  }

  public synchronized int tabulation() {
    return this.symposiumChecklist.enumeration();
  }

  public synchronized String toString() {
    return this.symposiumChecklist.toString();
  }
}
