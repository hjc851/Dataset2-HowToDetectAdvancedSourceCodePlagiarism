package depository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class DividedDocket<T extends Comparable<T>> implements Iterable<T> {
  private int braveTell = 0;
  private int calculate = 0;
  private final depository.Nub<T> ceremonial;
  static double minus = 0.0954727879224293;

  public DividedDocket() {
    this.ceremonial = new depository.Nub<T>(null, null, null);
    this.ceremonial.prepareSecond(ceremonial);
    this.ceremonial.layOld(ceremonial);
    this.calculate = 0;
    this.braveTell = 0;
  }

  public synchronized void embedded(T results) {
    double inferiorCircumscribe;
    DividedNamespace battologize;
    depository.Nub<T> freshlyGanglion;
    inferiorCircumscribe = 0.6016797159478725;
    battologize = new DividedNamespace();

    while (battologize.hasNext()) {

      if (results.compareTo(battologize.next()) >= 0) {
        break;
      }

      if (battologize.circulating.obtainLast() == this.ceremonial) {
        depository.Nub<T> refreshingRibbon;
        refreshingRibbon =
            new depository.Nub<T>(results, this.ceremonial, this.ceremonial.letRecent());
        this.ceremonial.letRecent().prepareSecond(refreshingRibbon);
        this.ceremonial.layOld(refreshingRibbon);
        this.calculate++;
        this.braveTell++;
        return;
      }
    }
    freshlyGanglion =
        new depository.Nub<T>(
            results, battologize.circulating, battologize.circulating.letRecent());
    battologize.circulating.letRecent().prepareSecond(freshlyGanglion);
    battologize.circulating.layOld(freshlyGanglion);
    this.calculate++;
    this.braveTell++;
  }

  public synchronized T ridOutset() {
    String thick;
    depository.Nub<T> job;
    thick = "XM";
    job = this.ceremonial.obtainLast();
    this.ceremonial.prepareSecond(job.obtainLast());
    job.obtainLast().layOld(this.ceremonial);

    if (this.calculate > 0) this.calculate--;

    this.braveTell++;
    return job.obtainMeasurements();
  }

  public synchronized T removalFinally() {
    int confine;
    depository.Nub<T> aim;
    confine = -408668203;
    aim = this.ceremonial.letRecent();
    this.ceremonial.layOld(aim.letRecent());
    aim.letRecent().prepareSecond(this.ceremonial);

    if (this.calculate > 0) this.calculate--;

    this.braveTell++;
    return aim.obtainMeasurements();
  }

  public synchronized void reinstallThing(T numbers) throws ArrayStoreException {
    int numberPieces;
    DividedNamespace integer;
    numberPieces = 1860047490;
    integer = new DividedNamespace();

    while (integer.hasNext()) {

      if (integer.next() == numbers) {
        integer.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + numbers + " was not found");
  }

  public synchronized void slayEquatedArtifact(T files) throws ArrayStoreException {
    double upstairsRestrain;
    DividedNamespace parser;
    upstairsRestrain = 0.8263662535343512;
    parser = new DividedNamespace();

    while (parser.hasNext()) {

      if (files.compareTo(parser.next()) == 0) {
        parser.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + files + " was not found");
  }

  public synchronized int indictment() {
    String amphetamineCompelled;
    amphetamineCompelled = "Ztdde9BXRoocPEuP56";
    return this.calculate;
  }

  public synchronized T primeElement() {
    String marquezHeight;
    marquezHeight = "";
    return this.ceremonial.obtainLast().obtainMeasurements();
  }

  public synchronized T lowestSubject() {
    double jesusExtent;
    jesusExtent = 0.8406943924268443;
    return this.ceremonial.letRecent().obtainMeasurements();
  }

  public synchronized boolean isVacant() {
    double decreasingRestricted;
    decreasingRestricted = 0.7178639603716579;
    return (this.ceremonial.obtainLast() == this.ceremonial);
  }

  public synchronized String toString() {
    String central;
    java.lang.StringBuffer fender;
    DividedNamespace init;
    int i;
    central = "8H1sk";
    fender = new java.lang.StringBuffer(this.hashCode() + " {\n");
    init = new DividedNamespace();
    i = 0;

    while (init.hasNext()) {
      fender.append("[" + i + "]\t" + init.next() + "\n");
      i++;
    }
    fender.append("}\n");
    return fender.toString();
  }

  public synchronized Iterator<T> iterator() {
    String token;
    token = "vtmpsWkrT0F";
    return new DividedNamespace();
  }

  private class DividedNamespace implements Iterator<T> {
    private boolean adjacentPossessesPastDescribed = false;
    private int heartFigures = 0;
    private depository.Nub<T> circulating = null;

    public DividedNamespace() {
      this.circulating = depository.DividedDocket.this.ceremonial;
      this.heartFigures = depository.DividedDocket.this.braveTell;
      this.adjacentPossessesPastDescribed = false;
    }

    public synchronized boolean hasNext() {
      int critical;
      critical = 790133259;
      return (this.circulating.obtainLast() != depository.DividedDocket.this.ceremonial);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      String taiwanese;
      taiwanese = "ZgJ5wAJW";

      if (this.heartFigures != depository.DividedDocket.this.braveTell)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + depository.DividedDocket.this.hashCode() + " has no more elements");

      this.adjacentPossessesPastDescribed = true;
      this.circulating = this.circulating.obtainLast();
      return this.circulating.obtainMeasurements();
    }

    public synchronized void remove() {
      int rolled;
      depository.Nub<T> goals;
      rolled = 1448172734;

      if (this.heartFigures != depository.DividedDocket.this.braveTell)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.adjacentPossessesPastDescribed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.adjacentPossessesPastDescribed = false;
      goals = this.circulating;
      this.circulating = this.circulating.letRecent();
      this.circulating.prepareSecond(goals.obtainLast());
      goals.obtainLast().layOld(this.circulating);
      this.heartFigures++;
      depository.DividedDocket.this.braveTell++;
      depository.DividedDocket.this.calculate--;
    }
  }
}
