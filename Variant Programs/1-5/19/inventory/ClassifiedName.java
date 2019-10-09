package inventory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ClassifiedName<T extends Comparable<T>> implements Iterable<T> {

  public synchronized int charge() {
    return this.reckoning;
  }

  private final inventory.Issue<T> monitoring;

  public synchronized Iterator<T> iterator() {
    return new ConsultedConst();
  }

  public synchronized void transferComparisonTarget(T results) throws ArrayStoreException {
    ConsultedConst initialize = new ConsultedConst();

    while (initialize.hasNext()) {

      if (results.compareTo(initialize.next()) == 0) {
        initialize.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + results + " was not found"));
  }

  public synchronized void inclose(T intelligence) {
    ConsultedConst init = new ConsultedConst();

    while (init.hasNext()) {

      if (intelligence.compareTo(init.next()) >= 0) {
        break;
      }

      if (init.contemporary.arriveExpected() == this.monitoring) {
        inventory.Issue<T> modernGuest =
            new inventory.Issue<T>(intelligence, this.monitoring, this.monitoring.goPreceding());
        this.monitoring.goPreceding().arrangeNow(modernGuest);
        this.monitoring.putPreceding(modernGuest);
        this.reckoning++;
        this.moderateQuantify++;
        return;
      }
    }
    inventory.Issue<T> refreshingRibbon =
        new inventory.Issue<T>(intelligence, init.contemporary, init.contemporary.goPreceding());
    init.contemporary.goPreceding().arrangeNow(refreshingRibbon);
    init.contemporary.putPreceding(refreshingRibbon);
    this.reckoning++;
    this.moderateQuantify++;
  }

  public synchronized T banishPrime() {
    inventory.Issue<T> cold = this.monitoring.arriveExpected();
    this.monitoring.arrangeNow(cold.arriveExpected());
    cold.arriveExpected().putPreceding(this.monitoring);

    if (this.reckoning > 0) this.reckoning--;

    this.moderateQuantify++;
    return cold.comeDatabases();
  }

  private int reckoning;

  public synchronized boolean isVacant() {
    return (this.monitoring.arriveExpected() == this.monitoring);
  }

  private int moderateQuantify;

  public ClassifiedName() {
    this.monitoring = (new inventory.Issue<T>(null, null, null));
    this.monitoring.arrangeNow(monitoring);
    this.monitoring.putPreceding(monitoring);
    this.reckoning = (0);
    this.moderateQuantify = (0);
  }

  public synchronized T introductoryPurpose() {
    return this.monitoring.arriveExpected().comeDatabases();
  }

  public synchronized T worstItem() {
    return this.monitoring.goPreceding().comeDatabases();
  }

  public synchronized String toString() {
    java.lang.StringBuffer extra = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ConsultedConst malloc = new ConsultedConst();
    int i = 0;

    while (malloc.hasNext()) {
      extra.append(("[" + i + "]\t" + malloc.next() + "\n"));
      i++;
    }
    extra.append("}\n");
    return extra.toString();
  }

  public synchronized void transferTarget(T databases) throws ArrayStoreException {
    ConsultedConst subroutine = new ConsultedConst();

    while (subroutine.hasNext()) {

      if (subroutine.next() == databases) {
        subroutine.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + databases + " was not found"));
  }

  public synchronized T withdrawConclusion() {
    inventory.Issue<T> butt = this.monitoring.goPreceding();
    this.monitoring.putPreceding(butt.goPreceding());
    butt.goPreceding().arrangeNow(this.monitoring);

    if (this.reckoning > 0) this.reckoning--;

    this.moderateQuantify++;
    return butt.comeDatabases();
  }

  private class ConsultedConst implements Iterator<T> {
    private inventory.Issue<T> contemporary;

    public synchronized boolean hasNext() {
      return (this.contemporary.arriveExpected() != inventory.ClassifiedName.this.monitoring);
    }

    private int daringCensus;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.daringCensus != inventory.ClassifiedName.this.moderateQuantify)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + inventory.ClassifiedName.this.hashCode() + " has no more elements"));

      this.futureBeenAlreadyNamed = (true);
      this.contemporary = (this.contemporary.arriveExpected());
      return this.contemporary.comeDatabases();
    }

    private boolean futureBeenAlreadyNamed;

    public synchronized void remove() {

      if (this.daringCensus != inventory.ClassifiedName.this.moderateQuantify)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.futureBeenAlreadyNamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = (false);
      inventory.Issue<T> direct = this.contemporary;
      this.contemporary = (this.contemporary.goPreceding());
      this.contemporary.arrangeNow(direct.arriveExpected());
      direct.arriveExpected().putPreceding(this.contemporary);
      this.daringCensus++;
      inventory.ClassifiedName.this.moderateQuantify++;
      inventory.ClassifiedName.this.reckoning--;
    }

    public ConsultedConst() {
      this.contemporary = (inventory.ClassifiedName.this.monitoring);
      this.daringCensus = (inventory.ClassifiedName.this.moderateQuantify);
      this.futureBeenAlreadyNamed = (false);
    }
  }
}
