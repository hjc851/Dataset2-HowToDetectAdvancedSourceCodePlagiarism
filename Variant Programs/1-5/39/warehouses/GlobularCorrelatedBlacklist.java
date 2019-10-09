package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GlobularCorrelatedBlacklist<T> implements Iterable<T> {

  public synchronized String toString() {
    StringBuffer stabilization;
    NamesInteger subroutine;
    int i;
    stabilization = new StringBuffer(this.hashCode() + " {\n");
    subroutine = new NamesInteger();
    i = 0;

    while (subroutine.hasNext()) {
      stabilization.append("[" + i + "]\t" + subroutine.next() + "\n");
      i++;
    }
    stabilization.append("}\n");
    return stabilization.toString();
  }

  public synchronized void insetPriorGanglia(T numbers, Antenna<T> prey) {
    Antenna<T> freshlyGanglion;
    freshlyGanglion = new Antenna<T>(numbers, prey, prey.obtainPremature());
    prey.obtainPremature().arrangedSucceeding(freshlyGanglion);
    prey.dictatedLate(freshlyGanglion);
    this.tabulation++;
    this.domNumeral++;
  }

  public synchronized T dyingVictim() {
    return this.custodian.obtainPremature().generateRecords();
  }

  public final Antenna<T> custodian;

  public synchronized void incorporateDespiteDemur(T readings, T aiming)
      throws ArrayStoreException {
    NamesInteger date;
    date = new NamesInteger();

    while (date.hasNext()) {

      if (date.next() == aiming) {
        this.tuckLaterKnob(readings, date.incumbent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + aiming + " is not in the list");
  }

  public synchronized void injectedEldest(T indicators) {
    this.tuckLaterKnob(indicators, this.custodian);
  }

  public synchronized int figure() {
    return this.tabulation;
  }

  public int domNumeral;

  public synchronized T discardClosing() {
    Antenna<T> objectives;
    objectives = this.custodian.obtainPremature();
    this.custodian.dictatedLate(objectives.obtainPremature());
    objectives.obtainPremature().arrangedSucceeding(this.custodian);

    if (this.tabulation > 0) this.tabulation--;

    this.domNumeral++;
    return objectives.generateRecords();
  }

  public synchronized void deleteClosing(T evidence) {
    this.insetPriorGanglia(evidence, this.custodian);
  }

  public synchronized T outsetCavil() {
    return this.custodian.haveFirst().generateRecords();
  }

  public int tabulation;

  public class NamesInteger implements Iterator<T> {

    public synchronized void remove() throws ConcurrentModificationException {
      Antenna<T> aim;

      if (this.dodAct != GlobularCorrelatedBlacklist.this.domNumeral)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.earlyUsesAlwaysBrought)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.earlyUsesAlwaysBrought = false;
      aim = this.incumbent;
      this.incumbent = this.incumbent.obtainPremature();
      this.incumbent.arrangedSucceeding(aim.haveFirst());
      aim.haveFirst().dictatedLate(this.incumbent);
      this.dodAct++;
      GlobularCorrelatedBlacklist.this.domNumeral++;
      GlobularCorrelatedBlacklist.this.tabulation--;
    }

    public synchronized boolean hasNext() {
      return (this.incumbent.haveFirst() != GlobularCorrelatedBlacklist.this.custodian);
    }

    public NamesInteger() {
      this.incumbent = GlobularCorrelatedBlacklist.this.custodian;
      this.dodAct = GlobularCorrelatedBlacklist.this.domNumeral;
      this.earlyUsesAlwaysBrought = false;
    }

    public Antenna<T> incumbent;
    public int dodAct;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.dodAct != GlobularCorrelatedBlacklist.this.domNumeral)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + GlobularCorrelatedBlacklist.this.hashCode() + " has no more elements");

      this.earlyUsesAlwaysBrought = true;
      this.incumbent = this.incumbent.haveFirst();
      return this.incumbent.generateRecords();
    }

    public boolean earlyUsesAlwaysBrought;
  }

  public synchronized T dismantleFreshman() {
    Antenna<T> point;
    point = this.custodian.haveFirst();
    this.custodian.arrangedSucceeding(point.haveFirst());
    point.haveFirst().dictatedLate(this.custodian);

    if (this.tabulation > 0) this.tabulation--;

    this.domNumeral++;
    return point.generateRecords();
  }

  public GlobularCorrelatedBlacklist() {
    this.custodian = new Antenna<T>(null, null, null);
    this.custodian.arrangedSucceeding(this.custodian);
    this.custodian.dictatedLate(this.custodian);
    this.tabulation = 0;
    this.domNumeral = 0;
  }

  public synchronized Iterator<T> iterator() {
    return new NamesInteger();
  }

  public synchronized void murderArtefact(T study) {
    NamesInteger namespace;
    namespace = new NamesInteger();

    while (namespace.hasNext()) {

      if (namespace.next() == study) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + study + " was not found");
  }

  public synchronized boolean isEmpty() {
    return (this.custodian.haveFirst() == this.custodian);
  }

  public synchronized void tuckLaterKnob(T records, Antenna<T> focussed) {
    Antenna<T> newlyKnob;
    newlyKnob = new Antenna<T>(records, focussed.haveFirst(), focussed);
    focussed.haveFirst().dictatedLate(newlyKnob);
    focussed.arrangedSucceeding(newlyKnob);
    this.tabulation++;
    this.domNumeral++;
  }

  public synchronized void encloseAfterAim(T databases, T limit) throws ArrayStoreException {
    NamesInteger sign;
    sign = new NamesInteger();

    while (sign.hasNext()) {

      if (sign.next() == limit) {
        this.insetPriorGanglia(databases, sign.incumbent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + limit + " is not in the list");
  }
}
