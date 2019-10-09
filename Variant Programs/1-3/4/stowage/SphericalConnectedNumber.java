package stowage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SphericalConnectedNumber<T> implements Iterable<T> {
  private int boldnessMultiple;
  private int reckon;
  private final Core<T> surveillance;

  public SphericalConnectedNumber() {
    this.surveillance = new Core<T>(null, null, null);
    this.surveillance.orderedAgain(this.surveillance);
    this.surveillance.situatedLatest(this.surveillance);
    this.reckon = 0;
    this.boldnessMultiple = 0;
  }

  public synchronized void appendPrime(T databases) {
    this.incorporateDespiteCore(databases, this.surveillance);
  }

  public synchronized void embedLatest(T evidence) {
    this.appendDuringProtuberance(evidence, this.surveillance);
  }

  public synchronized void injectingUntilVictim(T measurements, T prey) throws ArrayStoreException {
    AgendaConst aberdeen;
    aberdeen = new AgendaConst();

    while (aberdeen.hasNext()) {

      if (aberdeen.next() == prey) {
        this.incorporateDespiteCore(measurements, aberdeen.contemporary);
        return;
      }
    }
    throw new ArrayStoreException("Target " + prey + " is not in the list");
  }

  public synchronized void embeddedUnlessOpposes(T numbers, T reach) throws ArrayStoreException {
    AgendaConst about;
    about = new AgendaConst();

    while (about.hasNext()) {

      if (about.next() == reach) {
        this.appendDuringProtuberance(numbers, about.contemporary);
        return;
      }
    }
    throw new ArrayStoreException("Target " + reach + " is not in the list");
  }

  private synchronized void incorporateDespiteCore(T records, Core<T> pinpoint) {
    Core<T> freshlyGanglion;
    freshlyGanglion = new Core<T>(records, pinpoint.makeAdjacent(), pinpoint);
    pinpoint.makeAdjacent().situatedLatest(freshlyGanglion);
    pinpoint.orderedAgain(freshlyGanglion);
    this.reckon++;
    this.boldnessMultiple++;
  }

  private synchronized void appendDuringProtuberance(T study, Core<T> place) {
    Core<T> originalAntenna;
    originalAntenna = new Core<T>(study, place, place.fixRecord());
    place.fixRecord().orderedAgain(originalAntenna);
    place.situatedLatest(originalAntenna);
    this.reckon++;
    this.boldnessMultiple++;
  }

  public synchronized T dislodgePremier() {
    Core<T> direct;
    direct = this.surveillance.makeAdjacent();
    this.surveillance.orderedAgain(direct.makeAdjacent());
    direct.makeAdjacent().situatedLatest(this.surveillance);

    if (this.reckon > 0) this.reckon--;

    this.boldnessMultiple++;
    return direct.haveStatistical();
  }

  public synchronized T eliminateLowest() {
    Core<T> focusing;
    focusing = this.surveillance.fixRecord();
    this.surveillance.situatedLatest(focusing.fixRecord());
    focusing.fixRecord().orderedAgain(this.surveillance);

    if (this.reckon > 0) this.reckon--;

    this.boldnessMultiple++;
    return focusing.haveStatistical();
  }

  public synchronized void ridCavil(T indicators) {
    AgendaConst inode;
    inode = new AgendaConst();

    while (inode.hasNext()) {

      if (inode.next() == indicators) {
        inode.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + indicators + " was not found");
  }

  public synchronized T basicOpposes() {
    return this.surveillance.makeAdjacent().haveStatistical();
  }

  public synchronized T penultimateObjection() {
    return this.surveillance.fixRecord().haveStatistical();
  }

  public synchronized boolean isEmpty() {
    return (this.surveillance.makeAdjacent() == this.surveillance);
  }

  public synchronized int rely() {
    return this.reckon;
  }

  public synchronized String toString() {
    StringBuffer polisher;
    AgendaConst initialize;
    int i;
    polisher = new StringBuffer(this.hashCode() + " {\n");
    initialize = new AgendaConst();
    i = 0;

    while (initialize.hasNext()) {
      polisher.append("[" + i + "]\t" + initialize.next() + "\n");
      i++;
    }
    polisher.append("}\n");
    return polisher.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new AgendaConst();
  }

  private class AgendaConst implements Iterator<T> {
    private boolean comeOccupiesDonePetitioned;
    private int iloBit;
    private Core<T> contemporary;

    public AgendaConst() {
      this.contemporary = SphericalConnectedNumber.this.surveillance;
      this.iloBit = SphericalConnectedNumber.this.boldnessMultiple;
      this.comeOccupiesDonePetitioned = false;
    }

    public synchronized boolean hasNext() {
      return (this.contemporary.makeAdjacent() != SphericalConnectedNumber.this.surveillance);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.iloBit != SphericalConnectedNumber.this.boldnessMultiple)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SphericalConnectedNumber.this.hashCode() + " has no more elements");

      this.comeOccupiesDonePetitioned = true;
      this.contemporary = this.contemporary.makeAdjacent();
      return this.contemporary.haveStatistical();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      Core<T> mark;

      if (this.iloBit != SphericalConnectedNumber.this.boldnessMultiple)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comeOccupiesDonePetitioned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comeOccupiesDonePetitioned = false;
      mark = this.contemporary;
      this.contemporary = this.contemporary.fixRecord();
      this.contemporary.orderedAgain(mark.makeAdjacent());
      mark.makeAdjacent().situatedLatest(this.contemporary);
      this.iloBit++;
      SphericalConnectedNumber.this.boldnessMultiple++;
      SphericalConnectedNumber.this.reckon--;
    }
  }
}
