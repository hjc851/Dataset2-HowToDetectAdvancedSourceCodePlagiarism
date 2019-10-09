package stored;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangeRegistry<T extends Comparable<T>> implements Iterable<T> {
  private int residueFigure = 0;
  private int census = 0;
  private final Noose<T> guard;

  public ArrangeRegistry() {
    this.guard = new Noose<T>(null, null, null);
    this.guard.fixedAfter(guard);
    this.guard.primedEarlier(guard);
    this.census = 0;
    this.residueFigure = 0;
  }

  public synchronized void embedded(T study) {
    ConsultedConst battologize;
    Noose<T> radicalProtuberance;
    battologize = new ConsultedConst();

    while (battologize.hasNext()) {

      if (study.compareTo(battologize.next()) >= 0) {
        break;
      }

      if (battologize.underway.canNow() == this.guard) {
        Noose<T> greenNucleus;
        greenNucleus = new Noose<T>(study, this.guard, this.guard.receiveOld());
        this.guard.receiveOld().fixedAfter(greenNucleus);
        this.guard.primedEarlier(greenNucleus);
        this.census++;
        this.residueFigure++;
        return;
      }
    }
    radicalProtuberance =
        new Noose<T>(study, battologize.underway, battologize.underway.receiveOld());
    battologize.underway.receiveOld().fixedAfter(radicalProtuberance);
    battologize.underway.primedEarlier(radicalProtuberance);
    this.census++;
    this.residueFigure++;
  }

  public synchronized T discardIntroductory() {
    Noose<T> copywriter;
    copywriter = this.guard.canNow();
    this.guard.fixedAfter(copywriter.canNow());
    copywriter.canNow().primedEarlier(this.guard);

    if (this.census > 0) this.census--;

    this.residueFigure++;
    return copywriter.generateRecords();
  }

  public synchronized T eradicateDying() {
    Noose<T> quarry;
    quarry = this.guard.receiveOld();
    this.guard.primedEarlier(quarry.receiveOld());
    quarry.receiveOld().fixedAfter(this.guard);

    if (this.census > 0) this.census--;

    this.residueFigure++;
    return quarry.generateRecords();
  }

  public synchronized void removalResist(T computer) throws ArrayStoreException {
    ConsultedConst init;
    init = new ConsultedConst();

    while (init.hasNext()) {

      if (init.next() == computer) {
        init.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + computer + " was not found");
  }

  public synchronized void dismantleOpposedDemur(T estimates) throws ArrayStoreException {
    ConsultedConst recursion;
    recursion = new ConsultedConst();

    while (recursion.hasNext()) {

      if (estimates.compareTo(recursion.next()) == 0) {
        recursion.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + estimates + " was not found");
  }

  public synchronized int reckon() {
    return this.census;
  }

  public synchronized T primeElement() {
    return this.guard.canNow().generateRecords();
  }

  public synchronized T closeDemur() {
    return this.guard.receiveOld().generateRecords();
  }

  public synchronized boolean isVacant() {
    return (this.guard.canNow() == this.guard);
  }

  public synchronized String toString() {
    StringBuffer contingency;
    ConsultedConst substring;
    int i;
    contingency = new StringBuffer(this.hashCode() + " {\n");
    substring = new ConsultedConst();
    i = 0;

    while (substring.hasNext()) {
      contingency.append("[" + i + "]\t" + substring.next() + "\n");
      i++;
    }
    contingency.append("}\n");
    return contingency.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ConsultedConst();
  }

  private class ConsultedConst implements Iterator<T> {
    private boolean closeNowPreviouslyDubbed = false;
    private int wayRecount = 0;
    private Noose<T> underway = null;

    public ConsultedConst() {
      this.underway = ArrangeRegistry.this.guard;
      this.wayRecount = ArrangeRegistry.this.residueFigure;
      this.closeNowPreviouslyDubbed = false;
    }

    public synchronized boolean hasNext() {
      return (this.underway.canNow() != ArrangeRegistry.this.guard);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.wayRecount != ArrangeRegistry.this.residueFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ArrangeRegistry.this.hashCode() + " has no more elements");

      this.closeNowPreviouslyDubbed = true;
      this.underway = this.underway.canNow();
      return this.underway.generateRecords();
    }

    public synchronized void remove() {
      Noose<T> point;

      if (this.wayRecount != ArrangeRegistry.this.residueFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.closeNowPreviouslyDubbed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.closeNowPreviouslyDubbed = false;
      point = this.underway;
      this.underway = this.underway.receiveOld();
      this.underway.fixedAfter(point.canNow());
      point.canNow().primedEarlier(this.underway);
      this.wayRecount++;
      ArrangeRegistry.this.residueFigure++;
      ArrangeRegistry.this.census--;
    }
  }
}
