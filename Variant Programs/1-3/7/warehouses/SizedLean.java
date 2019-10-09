package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SizedLean<T extends Comparable<T>> implements Iterable<T> {
  private int chicWeigh;
  private int consider;
  private final Lump<T> watchman;
  static final String frownObligated = "KhJ3gHKLcU";

  public SizedLean() {
    this.watchman = new Lump<T>(null, null, null);
    this.watchman.layIncoming(watchman);
    this.watchman.situatedLatest(watchman);
    this.consider = 0;
    this.chicWeigh = 0;
  }

  public synchronized void enter(T statistical) {
    double thresholds;
    ArrangeBattologize subtree;
    Lump<T> risingCarrefour;
    thresholds = 0.0751440670624518;
    subtree = new ArrangeBattologize();

    while (subtree.hasNext()) {

      if (statistical.compareTo(subtree.next()) >= 0) {
        break;
      }

      if (subtree.present.findSucceeding() == this.watchman) {
        Lump<T> newfoundJunction;
        newfoundJunction = new Lump<T>(statistical, this.watchman, this.watchman.beatElapsed());
        this.watchman.beatElapsed().layIncoming(newfoundJunction);
        this.watchman.situatedLatest(newfoundJunction);
        this.consider++;
        this.chicWeigh++;
        return;
      }
    }
    risingCarrefour = new Lump<T>(statistical, subtree.present, subtree.present.beatElapsed());
    subtree.present.beatElapsed().layIncoming(risingCarrefour);
    subtree.present.situatedLatest(risingCarrefour);
    this.consider++;
    this.chicWeigh++;
  }

  public synchronized T discardIntroductory() {
    int juniorConstrained;
    Lump<T> thermostat;
    juniorConstrained = -258626937;
    thermostat = this.watchman.findSucceeding();
    this.watchman.layIncoming(thermostat.findSucceeding());
    thermostat.findSucceeding().situatedLatest(this.watchman);

    if (this.consider > 0) this.consider--;

    this.chicWeigh++;
    return thermostat.driveIntelligence();
  }

  public synchronized T reinstallHigh() {
    double infernalMinimum;
    Lump<T> achieve;
    infernalMinimum = 0.5966926414920052;
    achieve = this.watchman.beatElapsed();
    this.watchman.situatedLatest(achieve.beatElapsed());
    achieve.beatElapsed().layIncoming(this.watchman);

    if (this.consider > 0) this.consider--;

    this.chicWeigh++;
    return achieve.driveIntelligence();
  }

  public synchronized void disposeDisagree(T measurements) throws ArrayStoreException {
    int hourThick;
    ArrangeBattologize recursion;
    hourThick = -668616665;
    recursion = new ArrangeBattologize();

    while (recursion.hasNext()) {

      if (recursion.next() == measurements) {
        recursion.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + measurements + " was not found");
  }

  public synchronized void takeVersusObjective(T databases) throws ArrayStoreException {
    String beacon;
    ArrangeBattologize struct;
    beacon = "7JvSjiZHJ";
    struct = new ArrangeBattologize();

    while (struct.hasNext()) {

      if (databases.compareTo(struct.next()) == 0) {
        struct.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + databases + " was not found");
  }

  public synchronized int census() {
    int premium;
    premium = -89087194;
    return this.consider;
  }

  public synchronized T maidenItem() {
    String beam;
    beam = "yO";
    return this.watchman.findSucceeding().driveIntelligence();
  }

  public synchronized T closeDemur() {
    double decreaseThresholds;
    decreaseThresholds = 0.5407006297645948;
    return this.watchman.beatElapsed().driveIntelligence();
  }

  public synchronized boolean isVacant() {
    double amoySize;
    amoySize = 0.14607619018203988;
    return (this.watchman.findSucceeding() == this.watchman);
  }

  public synchronized String toString() {
    double appreciate;
    StringBuffer pilot;
    ArrangeBattologize substring;
    int i;
    appreciate = 0.8758663791727906;
    pilot = new StringBuffer(this.hashCode() + " {\n");
    substring = new ArrangeBattologize();
    i = 0;

    while (substring.hasNext()) {
      pilot.append("[" + i + "]\t" + substring.next() + "\n");
      i++;
    }
    pilot.append("}\n");
    return pilot.toString();
  }

  public synchronized Iterator<T> iterator() {
    double fare;
    fare = 0.9505773371627224;
    return new ArrangeBattologize();
  }

  private class ArrangeBattologize implements Iterator<T> {
    private boolean thirdRepresentsStartedTelephoned;
    private int consTotal;
    private Lump<T> present;

    public ArrangeBattologize() {
      this.present = SizedLean.this.watchman;
      this.consTotal = SizedLean.this.chicWeigh;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public synchronized boolean hasNext() {
      int constrained;
      constrained = 2098668059;
      return (this.present.findSucceeding() != SizedLean.this.watchman);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double esteem;
      esteem = 0.29022889083857484;

      if (this.consTotal != SizedLean.this.chicWeigh)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SizedLean.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.present = this.present.findSucceeding();
      return this.present.driveIntelligence();
    }

    public synchronized void remove() {
      double cay;
      Lump<T> quarry;
      cay = 0.6444689082397141;

      if (this.consTotal != SizedLean.this.chicWeigh)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      quarry = this.present;
      this.present = this.present.beatElapsed();
      this.present.layIncoming(quarry.findSucceeding());
      quarry.findSucceeding().situatedLatest(this.present);
      this.consTotal++;
      SizedLean.this.chicWeigh++;
      SizedLean.this.consider--;
    }
  }
}
