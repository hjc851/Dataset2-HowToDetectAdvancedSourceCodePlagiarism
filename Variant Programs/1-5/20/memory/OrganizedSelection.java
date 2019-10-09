package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrganizedSelection<T extends Comparable<T>> implements Iterable<T> {
  public class ResolvedStruct implements Iterator<T> {

    public synchronized void remove() {
      Nucleus<T> focusing;

      if (this.residueFigure != OrganizedSelection.this.neoReckoning)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.incomingMaintainsGoneReferred)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.incomingMaintainsGoneReferred = false;
      focusing = this.presently;
      this.presently = this.presently.canAgo();
      this.presently.fitComing(focusing.generateComing());
      focusing.generateComing().arrangeAgo(this.presently);
      this.residueFigure++;
      OrganizedSelection.this.neoReckoning++;
      OrganizedSelection.this.get--;
    }

    public int residueFigure;

    public ResolvedStruct() {
      this.presently = OrganizedSelection.this.watchman;
      this.residueFigure = OrganizedSelection.this.neoReckoning;
      this.incomingMaintainsGoneReferred = false;
    }

    public boolean incomingMaintainsGoneReferred;
    public Nucleus<T> presently;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.residueFigure != OrganizedSelection.this.neoReckoning)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + OrganizedSelection.this.hashCode() + " has no more elements");

      this.incomingMaintainsGoneReferred = true;
      this.presently = this.presently.generateComing();
      return this.presently.produceSurvey();
    }

    public synchronized boolean hasNext() {
      return (this.presently.generateComing() != OrganizedSelection.this.watchman);
    }
  }

  public int neoReckoning;

  public synchronized void eliminateMeasuredSubject(T findings) throws ArrayStoreException {
    ResolvedStruct battologize;
    battologize = new ResolvedStruct();

    while (battologize.hasNext()) {

      if (findings.compareTo(battologize.next()) == 0) {
        battologize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + findings + " was not found");
  }

  public synchronized void disposeDisagree(T results) throws ArrayStoreException {
    ResolvedStruct namespace;
    namespace = new ResolvedStruct();

    while (namespace.hasNext()) {

      if (namespace.next() == results) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + results + " was not found");
  }

  public synchronized T highThing() {
    return this.watchman.canAgo().produceSurvey();
  }

  public int get;

  public synchronized int figure() {
    return this.get;
  }

  public synchronized String toString() {
    StringBuffer soften;
    ResolvedStruct initialisation;
    int i;
    soften = new StringBuffer(this.hashCode() + " {\n");
    initialisation = new ResolvedStruct();
    i = 0;

    while (initialisation.hasNext()) {
      soften.append("[" + i + "]\t" + initialisation.next() + "\n");
      i++;
    }
    soften.append("}\n");
    return soften.toString();
  }

  public synchronized boolean isVacant() {
    return (this.watchman.generateComing() == this.watchman);
  }

  public synchronized void install(T evidence) {
    ResolvedStruct instantiation;
    Nucleus<T> earlyHitch;
    instantiation = new ResolvedStruct();

    while (instantiation.hasNext()) {

      if (evidence.compareTo(instantiation.next()) >= 0) {
        break;
      }

      if (instantiation.presently.generateComing() == this.watchman) {
        Nucleus<T> novelLump;
        novelLump = new Nucleus<T>(evidence, this.watchman, this.watchman.canAgo());
        this.watchman.canAgo().fitComing(novelLump);
        this.watchman.arrangeAgo(novelLump);
        this.get++;
        this.neoReckoning++;
        return;
      }
    }
    earlyHitch =
        new Nucleus<T>(evidence, instantiation.presently, instantiation.presently.canAgo());
    instantiation.presently.canAgo().fitComing(earlyHitch);
    instantiation.presently.arrangeAgo(earlyHitch);
    this.get++;
    this.neoReckoning++;
  }

  public OrganizedSelection() {
    this.watchman = new Nucleus<T>(null, null, null);
    this.watchman.fitComing(watchman);
    this.watchman.arrangeAgo(watchman);
    this.get = 0;
    this.neoReckoning = 0;
  }

  public synchronized Iterator<T> iterator() {
    return new ResolvedStruct();
  }

  public synchronized T discardClosing() {
    Nucleus<T> achieve;
    achieve = this.watchman.canAgo();
    this.watchman.arrangeAgo(achieve.canAgo());
    achieve.canAgo().fitComing(this.watchman);

    if (this.get > 0) this.get--;

    this.neoReckoning++;
    return achieve.produceSurvey();
  }

  public synchronized T inauguralTarget() {
    return this.watchman.generateComing().produceSurvey();
  }

  public final Nucleus<T> watchman;

  public synchronized T reinstallLow() {
    Nucleus<T> thermometer;
    thermometer = this.watchman.generateComing();
    this.watchman.fitComing(thermometer.generateComing());
    thermometer.generateComing().arrangeAgo(this.watchman);

    if (this.get > 0) this.get--;

    this.neoReckoning++;
    return thermometer.produceSurvey();
  }
}
