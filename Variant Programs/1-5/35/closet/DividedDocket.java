package closet;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class DividedDocket<T extends Comparable<T>> implements Iterable<T> {
  private final Problem<T> witnesses;
  private int matter;
  private int defenceCalculate;

  public DividedDocket() {
    this.witnesses = new Problem<T>(null, null, null);
    this.witnesses.fixedAfter(witnesses);
    this.witnesses.doFinal(witnesses);
    this.matter = 0;
    this.defenceCalculate = 0;
  }

  public synchronized void infix(T findings) {
    ResolvedStruct iterate = new ResolvedStruct();

    while (iterate.hasNext()) {

      if (findings.compareTo(iterate.next()) >= 0) {
        break;
      }

      if (iterate.afoot.haveFirst() == this.witnesses) {
        Problem<T> unusedBump =
            new Problem<T>(findings, this.witnesses, this.witnesses.arriveFirst());
        this.witnesses.arriveFirst().fixedAfter(unusedBump);
        this.witnesses.doFinal(unusedBump);
        this.matter++;
        this.defenceCalculate++;
        return;
      }
    }
    Problem<T> radicalProtuberance =
        new Problem<T>(findings, iterate.afoot, iterate.afoot.arriveFirst());
    iterate.afoot.arriveFirst().fixedAfter(radicalProtuberance);
    iterate.afoot.doFinal(radicalProtuberance);
    this.matter++;
    this.defenceCalculate++;
  }

  public synchronized T banishPrime() {
    Problem<T> solvate = this.witnesses.haveFirst();
    this.witnesses.fixedAfter(solvate.haveFirst());
    solvate.haveFirst().doFinal(this.witnesses);

    if (this.matter > 0) this.matter--;

    this.defenceCalculate++;
    return solvate.takeFiles();
  }

  public synchronized T takePast() {
    Problem<T> priority = this.witnesses.arriveFirst();
    this.witnesses.doFinal(priority.arriveFirst());
    priority.arriveFirst().fixedAfter(this.witnesses);

    if (this.matter > 0) this.matter--;

    this.defenceCalculate++;
    return priority.takeFiles();
  }

  public synchronized void dismantleDemur(T statistical) throws ArrayStoreException {
    ResolvedStruct parser = new ResolvedStruct();

    while (parser.hasNext()) {

      if (parser.next() == statistical) {
        parser.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + statistical + " was not found");
  }

  public synchronized void discardBenchmarkedPurpose(T files) throws ArrayStoreException {
    ResolvedStruct initialize = new ResolvedStruct();

    while (initialize.hasNext()) {

      if (files.compareTo(initialize.next()) == 0) {
        initialize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + files + " was not found");
  }

  public synchronized int enumeration() {
    return this.matter;
  }

  public synchronized T premiereBody() {
    return this.witnesses.haveFirst().takeFiles();
  }

  public synchronized T finallyResist() {
    return this.witnesses.arriveFirst().takeFiles();
  }

  public synchronized boolean isVacant() {
    return (this.witnesses.haveFirst() == this.witnesses);
  }

  public synchronized String toString() {
    StringBuffer separation = new StringBuffer(this.hashCode() + " {\n");
    ResolvedStruct concatenate = new ResolvedStruct();
    int i = 0;

    while (concatenate.hasNext()) {
      separation.append("[" + i + "]\t" + concatenate.next() + "\n");
      i++;
    }
    separation.append("}\n");
    return separation.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ResolvedStruct();
  }

  private class ResolvedStruct implements Iterator<T> {
    private Problem<T> afoot;
    private int daringCensus;
    private boolean expectedGetsRisenCharacterized;

    public ResolvedStruct() {
      this.afoot = DividedDocket.this.witnesses;
      this.daringCensus = DividedDocket.this.defenceCalculate;
      this.expectedGetsRisenCharacterized = false;
    }

    public synchronized boolean hasNext() {
      return (this.afoot.haveFirst() != DividedDocket.this.witnesses);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.daringCensus != DividedDocket.this.defenceCalculate)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + DividedDocket.this.hashCode() + " has no more elements");

      this.expectedGetsRisenCharacterized = true;
      this.afoot = this.afoot.haveFirst();
      return this.afoot.takeFiles();
    }

    public synchronized void remove() {

      if (this.daringCensus != DividedDocket.this.defenceCalculate)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.expectedGetsRisenCharacterized)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.expectedGetsRisenCharacterized = false;
      Problem<T> butt = this.afoot;
      this.afoot = this.afoot.arriveFirst();
      this.afoot.fixedAfter(butt.haveFirst());
      butt.haveFirst().doFinal(this.afoot);
      this.daringCensus++;
      DividedDocket.this.defenceCalculate++;
      DividedDocket.this.matter--;
    }
  }
}
