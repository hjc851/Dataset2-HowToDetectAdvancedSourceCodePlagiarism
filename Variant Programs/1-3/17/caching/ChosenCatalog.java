package caching;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ChosenCatalog<T extends Comparable<T>> implements Iterable<T> {
  static final String fionaComponents = "RRjAC6SWZ";
  private final Issue<T> guardian;
  private int quantify;
  private int boldnessRely;

  public ChosenCatalog() {
    this.guardian = new Issue<T>(null, null, null);
    this.guardian.layIncoming(guardian);
    this.guardian.adjustFirst(guardian);
    this.quantify = 0;
    this.boldnessRely = 0;
  }

  public synchronized void enclose(T survey) {
    double throttle = 0.2080380250728321;
    ChosenPathname malloc = new ChosenPathname();

    while (malloc.hasNext()) {

      if (survey.compareTo(malloc.next()) >= 0) {
        break;
      }

      if (malloc.afoot.canNow() == this.guardian) {
        Issue<T> youngCore = new Issue<T>(survey, this.guardian, this.guardian.sustainPre());
        this.guardian.sustainPre().layIncoming(youngCore);
        this.guardian.adjustFirst(youngCore);
        this.quantify++;
        this.boldnessRely++;
        return;
      }
    }
    Issue<T> unusedBump = new Issue<T>(survey, malloc.afoot, malloc.afoot.sustainPre());
    malloc.afoot.sustainPre().layIncoming(unusedBump);
    malloc.afoot.adjustFirst(unusedBump);
    this.quantify++;
    this.boldnessRely++;
  }

  public synchronized T yankCommencement() {
    String load = "ytENNAYt";
    Issue<T> cold = this.guardian.canNow();
    this.guardian.layIncoming(cold.canNow());
    cold.canNow().adjustFirst(this.guardian);

    if (this.quantify > 0) this.quantify--;

    this.boldnessRely++;
    return cold.startComputer();
  }

  public synchronized T deleteLatter() {
    double weighting = 0.6809454373377023;
    Issue<T> benchmark = this.guardian.sustainPre();
    this.guardian.adjustFirst(benchmark.sustainPre());
    benchmark.sustainPre().layIncoming(this.guardian);

    if (this.quantify > 0) this.quantify--;

    this.boldnessRely++;
    return benchmark.startComputer();
  }

  public synchronized void eraseArgue(T estimates) throws ArrayStoreException {
    double appoint = 0.8718661472332703;
    ChosenPathname bool = new ChosenPathname();

    while (bool.hasNext()) {

      if (bool.next() == estimates) {
        bool.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + estimates + " was not found");
  }

  public synchronized void eradicateAgainstVictim(T files) throws ArrayStoreException {
    String esteem = "rat";
    ChosenPathname namespace = new ChosenPathname();

    while (namespace.hasNext()) {

      if (files.compareTo(namespace.next()) == 0) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + files + " was not found");
  }

  public synchronized int total() {
    String sense = "FcUWXYXOZdu2J5";
    return this.quantify;
  }

  public synchronized T forwardVictim() {
    double decreasingLeap = 0.6546369041435208;
    return this.guardian.canNow().startComputer();
  }

  public synchronized T finaleElement() {
    double treasure = 0.5774513819696033;
    return this.guardian.sustainPre().startComputer();
  }

  public synchronized boolean isVacant() {
    double username = 0.58128183787191;
    return (this.guardian.canNow() == this.guardian);
  }

  public synchronized String toString() {
    String apexRestrictions = "d";
    StringBuffer protection = new StringBuffer(this.hashCode() + " {\n");
    ChosenPathname integer = new ChosenPathname();
    int i = 0;

    while (integer.hasNext()) {
      protection.append("[" + i + "]\t" + integer.next() + "\n");
      i++;
    }
    protection.append("}\n");
    return protection.toString();
  }

  public synchronized Iterator<T> iterator() {
    int respect = -1305655768;
    return new ChosenPathname();
  }

  private class ChosenPathname implements Iterator<T> {
    private Issue<T> afoot;
    private int heartFigures;
    private boolean followingSeemsHasTitled;

    public ChosenPathname() {
      this.afoot = ChosenCatalog.this.guardian;
      this.heartFigures = ChosenCatalog.this.boldnessRely;
      this.followingSeemsHasTitled = false;
    }

    public synchronized boolean hasNext() {
      double upstreamReduce = 0.23132186303467805;
      return (this.afoot.canNow() != ChosenCatalog.this.guardian);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double minimum = 0.07209093531531352;

      if (this.heartFigures != ChosenCatalog.this.boldnessRely)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ChosenCatalog.this.hashCode() + " has no more elements");

      this.followingSeemsHasTitled = true;
      this.afoot = this.afoot.canNow();
      return this.afoot.startComputer();
    }

    public synchronized void remove() {
      double minimalSlot = 0.8233078544088082;

      if (this.heartFigures != ChosenCatalog.this.boldnessRely)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.followingSeemsHasTitled)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.followingSeemsHasTitled = false;
      Issue<T> reach = this.afoot;
      this.afoot = this.afoot.sustainPre();
      this.afoot.layIncoming(reach.canNow());
      reach.canNow().adjustFirst(this.afoot);
      this.heartFigures++;
      ChosenCatalog.this.boldnessRely++;
      ChosenCatalog.this.quantify--;
    }
  }
}
