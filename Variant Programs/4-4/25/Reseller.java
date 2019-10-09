import java.util.*;

public class Reseller {
  private LinkedList<Negotiations> BackProces = null;
  private LinkedList<Negotiations> BestsellerMechanisms = null;
  private int carolineMethod = 0;
  private ArrayDeque<Programmer> multiple = null;

  public Reseller() {
    Programmer stas;
    this.multiple = new ArrayDeque<>();
    stas = new DiddleProgramming();
    this.multiple.addLast(stas);
  }

  public synchronized void situatedCapitalistMethodology(LinkedList<Negotiations> methodology) {
    this.carolineMethod = methodology.size();
    this.BestsellerMechanisms = methodology;
  }

  public synchronized void primedSyncAppendage(LinkedList<Negotiations> mechanisms) {
    this.carolineMethod = mechanisms.size();
    this.BackProces = mechanisms;
  }

  public synchronized void courseResponsible() {
    this.driveProgrammer(new DiddleProgramming(), this.BestsellerMechanisms, "LRU");
    this.driveProgrammer(new DiddleProgramming(), this.BackProces, "CLOCK");
  }

  private synchronized void driveProgrammer(
      Programmer callback, LinkedList<Negotiations> thisMechanism, String alternatives) {
    callback.commencementSynchronization(alternatives);
    Collections.sort(thisMechanism);

    while (!thisMechanism.isEmpty()) synx165(callback, thisMechanism);

    while (callback.goIsMoving()) synx166(callback, alternatives);
  }

  private synchronized void synx165(
      Programmer callback, java.util.LinkedList<Negotiations> thisMechanism) {
    callback.inboundOperation(thisMechanism.removeFirst());
  }

  private synchronized void synx166(Programmer callback, String alternatives) {

    if (callback.drawFinalizingSystemsScope() == carolineMethod) {
      callback.layoverConfiguration(alternatives);
    } else {
      callback.solidifyingTypicalGenetic(callback.letAfootDials() + 1);
      callback.nbsClick();
    }
  }
}
