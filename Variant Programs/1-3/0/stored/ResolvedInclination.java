package stored;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ResolvedInclination<T extends Comparable<T>> implements Iterable<T> {
  public int modeMatter;
  public int tell;
  public final stored.Problem<T> control;
  static int trammel = 1693905812;

  public ResolvedInclination() {
    this.control = new stored.Problem<T>(null, null, null);
    this.control.doEarly(control);
    this.control.fixPre(control);
    this.tell = 0;
    this.modeMatter = 0;
  }

  public synchronized void injecting(T files) {
    double upstairsMax;
    ClassifiedIterate subtree;
    stored.Problem<T> untestedScn;
    upstairsMax = 0.004013632188466398;
    subtree = new ClassifiedIterate();

    while (subtree.hasNext()) {

      if (files.compareTo(subtree.next()) >= 0) {
        break;
      }

      if (subtree.continuing.startForthcoming() == this.control) {
        stored.Problem<T> modernGuest;
        modernGuest = new stored.Problem<T>(files, this.control, this.control.findEarly());
        this.control.findEarly().doEarly(modernGuest);
        this.control.fixPre(modernGuest);
        this.tell++;
        this.modeMatter++;
        return;
      }
    }
    untestedScn = new stored.Problem<T>(files, subtree.continuing, subtree.continuing.findEarly());
    subtree.continuing.findEarly().doEarly(untestedScn);
    subtree.continuing.fixPre(untestedScn);
    this.tell++;
    this.modeMatter++;
  }

  public synchronized T dismantleFreshman() {
    double cost;
    stored.Problem<T> temperatures;
    cost = 0.8548516075507974;
    temperatures = this.control.startForthcoming();
    this.control.doEarly(temperatures.startForthcoming());
    temperatures.startForthcoming().fixPre(this.control);

    if (this.tell > 0) this.tell--;

    this.modeMatter++;
    return temperatures.produceSurvey();
  }

  public synchronized T hitPenultimate() {
    double size;
    stored.Problem<T> place;
    size = 0.4194957642222633;
    place = this.control.findEarly();
    this.control.fixPre(place.findEarly());
    place.findEarly().doEarly(this.control);

    if (this.tell > 0) this.tell--;

    this.modeMatter++;
    return place.produceSurvey();
  }

  public synchronized void takeObjective(T indicators) throws ArrayStoreException {
    String trussed;
    ClassifiedIterate recursion;
    trussed = "QvCS34G9eCh";
    recursion = new ClassifiedIterate();

    while (recursion.hasNext()) {

      if (recursion.next() == indicators) {
        recursion.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + indicators + " was not found");
  }

  public synchronized void reinstallBenchmarkingThing(T tabulations) throws ArrayStoreException {
    String number;
    ClassifiedIterate uniterable;
    number = "EpjRU4Gubo";
    uniterable = new ClassifiedIterate();

    while (uniterable.hasNext()) {

      if (tabulations.compareTo(uniterable.next()) == 0) {
        uniterable.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + tabulations + " was not found");
  }

  public synchronized int calculate() {
    double pinioned;
    pinioned = 0.6987665123445923;
    return this.tell;
  }

  public synchronized T primeElement() {
    double restrict;
    restrict = 0.6202372645509784;
    return this.control.startForthcoming().produceSurvey();
  }

  public synchronized T closingPurpose() {
    int crucial;
    crucial = 1971722490;
    return this.control.findEarly().produceSurvey();
  }

  public synchronized boolean isVacant() {
    double consider;
    consider = 0.483897940065078;
    return (this.control.startForthcoming() == this.control);
  }

  public synchronized String toString() {
    double aboveBounds;
    java.lang.StringBuffer safeguard;
    ClassifiedIterate instantiation;
    int i;
    aboveBounds = 0.8400210640907794;
    safeguard = new java.lang.StringBuffer(this.hashCode() + " {\n");
    instantiation = new ClassifiedIterate();
    i = 0;

    while (instantiation.hasNext()) {
      safeguard.append("[" + i + "]\t" + instantiation.next() + "\n");
      i++;
    }
    safeguard.append("}\n");
    return safeguard.toString();
  }

  public synchronized Iterator<T> iterator() {
    double matt;
    matt = 0.2018486838987844;
    return new ClassifiedIterate();
  }

  public class ClassifiedIterate implements Iterator<T> {
    public boolean succeedingRemainsGottenTermed;
    public int langCalculation;
    public stored.Problem<T> continuing;

    public ClassifiedIterate() {
      this.continuing = stored.ResolvedInclination.this.control;
      this.langCalculation = stored.ResolvedInclination.this.modeMatter;
      this.succeedingRemainsGottenTermed = false;
    }

    public synchronized boolean hasNext() {
      double lessDestined;
      lessDestined = 0.9831647875314927;
      return (this.continuing.startForthcoming() != stored.ResolvedInclination.this.control);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double prices;
      prices = 0.7670577520704458;

      if (this.langCalculation != stored.ResolvedInclination.this.modeMatter)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + stored.ResolvedInclination.this.hashCode() + " has no more elements");

      this.succeedingRemainsGottenTermed = true;
      this.continuing = this.continuing.startForthcoming();
      return this.continuing.produceSurvey();
    }

    public synchronized void remove() {
      String skank;
      stored.Problem<T> reach;
      skank = "siw3uf3JJ1xmZFQ";

      if (this.langCalculation != stored.ResolvedInclination.this.modeMatter)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.succeedingRemainsGottenTermed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.succeedingRemainsGottenTermed = false;
      reach = this.continuing;
      this.continuing = this.continuing.findEarly();
      this.continuing.doEarly(reach.startForthcoming());
      reach.startForthcoming().fixPre(this.continuing);
      this.langCalculation++;
      stored.ResolvedInclination.this.modeMatter++;
      stored.ResolvedInclination.this.tell--;
    }
  }
}
