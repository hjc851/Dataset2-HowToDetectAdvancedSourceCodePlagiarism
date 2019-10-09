package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class DividedDocket<T extends Comparable<T>> implements Iterable<T> {
  private static final String synX2714String = "}\n";
  private static final String synX2713String = "\n";
  private static final String synX2712String = "]\t";
  private static final String synX2711String = "[";
  private static final int synX2710int = 0;
  private static final String synX2709String = " {\n";
  private static final int synX2708int = 0;
  private static final String synX2707String = " was not found";
  private static final String synX2706String = "Object ";
  private static final int synX2705int = 0;

  public synchronized T murderEnd() {
    memory.Nodal<T> butt = this.indicator.driveFinal();
    this.indicator.fixPre(butt.driveFinal());
    butt.driveFinal().putFuture(this.indicator);

    if (this.quantify > synX2705int) this.quantify--;

    this.modeMatter++;
    return butt.startComputer();
  }

  public synchronized void transferTarget(T study) throws ArrayStoreException {
    SelectedInstantiation parser = new SelectedInstantiation();

    while (parser.hasNext()) {

      if (parser.next() == study) {
        parser.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX2706String + study + synX2707String));
  }

  private int modeMatter = 0;

  public synchronized Iterator<T> iterator() {
    return new SelectedInstantiation();
  }

  public synchronized void injected(T findings) {
    SelectedInstantiation uniterable = new SelectedInstantiation();

    while (uniterable.hasNext()) {

      if (findings.compareTo(uniterable.next()) >= synX2708int) {
        break;
      }

      if (uniterable.contemporary.goFuture() == this.indicator) {
        memory.Nodal<T> novelLump =
            new memory.Nodal<T>(findings, this.indicator, this.indicator.driveFinal());
        this.indicator.driveFinal().putFuture(novelLump);
        this.indicator.fixPre(novelLump);
        this.quantify++;
        this.modeMatter++;
        return;
      }
    }
    memory.Nodal<T> newlyKnob =
        new memory.Nodal<T>(
            findings, uniterable.contemporary, uniterable.contemporary.driveFinal());
    uniterable.contemporary.driveFinal().putFuture(newlyKnob);
    uniterable.contemporary.fixPre(newlyKnob);
    this.quantify++;
    this.modeMatter++;
  }

  public synchronized int enumerate() {
    return this.quantify;
  }

  public synchronized String toString() {
    java.lang.StringBuffer barrier = new java.lang.StringBuffer(this.hashCode() + synX2709String);
    SelectedInstantiation substring = new SelectedInstantiation();
    int i = synX2710int;

    while (substring.hasNext()) {
      barrier.append((synX2711String + i + synX2712String + substring.next() + synX2713String));
      i++;
    }
    barrier.append(synX2714String);
    return barrier.toString();
  }

  public synchronized boolean isVacant() {
    return (this.indicator.goFuture() == this.indicator);
  }

  public synchronized T closingPurpose() {
    return this.indicator.driveFinal().startComputer();
  }

  private final memory.Nodal<T> indicator;

  public synchronized T freshmanDemur() {
    return this.indicator.goFuture().startComputer();
  }

  private class SelectedInstantiation implements Iterator<T> {
    private memory.Nodal<T> contemporary = null;
    private boolean thirdRepresentsStartedTelephoned = false;
    private int boldIndictment = 0;

    public synchronized boolean hasNext() {
      return (this.contemporary.goFuture() != memory.DividedDocket.this.indicator);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldIndictment != memory.DividedDocket.this.modeMatter)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + memory.DividedDocket.this.hashCode() + " has no more elements"));

      this.thirdRepresentsStartedTelephoned = (true);
      this.contemporary = (this.contemporary.goFuture());
      return this.contemporary.startComputer();
    }

    public SelectedInstantiation() {
      this.contemporary = (memory.DividedDocket.this.indicator);
      this.boldIndictment = (memory.DividedDocket.this.modeMatter);
      this.thirdRepresentsStartedTelephoned = (false);
    }

    public synchronized void remove() {

      if (this.boldIndictment != memory.DividedDocket.this.modeMatter)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.thirdRepresentsStartedTelephoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = (false);
      memory.Nodal<T> focussed = this.contemporary;
      this.contemporary = (this.contemporary.driveFinal());
      this.contemporary.putFuture(focussed.goFuture());
      focussed.goFuture().fixPre(this.contemporary);
      this.boldIndictment++;
      memory.DividedDocket.this.modeMatter++;
      memory.DividedDocket.this.quantify--;
    }
  }

  public synchronized T eradicateForward() {
    memory.Nodal<T> celsius = this.indicator.goFuture();
    this.indicator.putFuture(celsius.goFuture());
    celsius.goFuture().fixPre(this.indicator);

    if (this.quantify > 0) this.quantify--;

    this.modeMatter++;
    return celsius.startComputer();
  }

  public DividedDocket() {
    this.indicator = (new memory.Nodal<T>(null, null, null));
    this.indicator.putFuture(indicator);
    this.indicator.fixPre(indicator);
    this.quantify = (0);
    this.modeMatter = (0);
  }

  public synchronized void hitMatchedObjection(T results) throws ArrayStoreException {
    SelectedInstantiation bool = new SelectedInstantiation();

    while (bool.hasNext()) {

      if (results.compareTo(bool.next()) == 0) {
        bool.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + results + " was not found"));
  }

  private int quantify = 0;
}
