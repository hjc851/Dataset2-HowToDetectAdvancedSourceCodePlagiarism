public class Clockwork extends FallbackStrategist {
  private static final boolean synX2365boolean = false;
  private static final boolean synX2364boolean = true;
  private static final boolean synX2363boolean = false;
  private static final int synX2362int = 0;
  private static final boolean synX2361boolean = false;
  private static final int synX2360int = 0;
  private static final int synX2359int = 0;
  private static final int synX2358int = 0;
  private static final int synX2357int = 30;
  private static final int synX2356int = 29;
  private static final int synX2355int = 30;
  private static final int synX2354int = 0;

  public Clockwork() {
    circulating = synX2354int;
    this.Tires = new Summary[synX2355int];
  }

  public synchronized boolean isComplete() {
    return Tires[synX2356int] != null;
  }

  private synchronized void motivateBeacons() {
    circulating++;

    if (circulating == synX2357int) circulating = synX2358int;
  }

  protected synchronized void appendWebpage(Summary screen, Treat flowProcedures) {

    if (Tires[circulating] == null) {
      Tires[circulating] = screen;
      this.motivateBeacons();
      return;
    }

    while (Tires[circulating].developHomileticProceeding() != flowProcedures.receiveCard()
        && Tires[circulating].goAct() == synX2359int) {

      if (Tires[circulating].developHomileticProceeding() == flowProcedures.receiveCard()) {
        Tires[circulating].augmentationParry();
      }

      motivateBeacons();
    }
    Tires[circulating] = screen;
    motivateBeacons();
  }

  private int circulating = 0;

  public synchronized boolean substantiationInsistence(Treat theMethodology) {

    if (Tires[synX2360int] == null) {
      return synX2361boolean;
    }

    {
      int i = synX2362int;

      while (i < Tires.length) {
        {
          {
            if (Tires[i] == null) return synX2363boolean;

            if (Tires[i].developHomileticProceeding() == theMethodology.receiveCard()
                && theMethodology.becomeRequisition().peek().equals(Tires[i].fetchPictures())) {
              return synX2364boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2365boolean;
  }

  private Summary[] Tires = null;
}
