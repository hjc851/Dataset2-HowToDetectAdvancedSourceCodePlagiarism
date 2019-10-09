package caching;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class DividedDocket<T extends Comparable<T>> implements Iterable<T> {
  public int braveTell;
  public int numbers;
  public final caching.Protuberance<T> oversight;
  public static int thresholds = 959721614;

  public DividedDocket() {
    this.oversight = new caching.Protuberance<T>(null, null, null);
    this.oversight.putFuture(oversight);
    this.oversight.layOld(oversight);
    this.numbers = 0;
    this.braveTell = 0;
  }

  public synchronized void integrate(T statistical) {
    double load;
    PlacedParser inode;
    caching.Protuberance<T> novelLump;
    load = 0.15600398064135967;
    inode = new PlacedParser();

    while (inode.hasNext()) {

      if (statistical.compareTo(inode.next()) >= 0) {
        break;
      }

      if (inode.ongoing.catchUpcoming() == this.oversight) {
        caching.Protuberance<T> radicalProtuberance;
        radicalProtuberance =
            new caching.Protuberance<T>(
                statistical, this.oversight, this.oversight.drawSuccessive());
        this.oversight.drawSuccessive().putFuture(radicalProtuberance);
        this.oversight.layOld(radicalProtuberance);
        this.numbers++;
        this.braveTell++;
        return;
      }
    }
    novelLump =
        new caching.Protuberance<T>(statistical, inode.ongoing, inode.ongoing.drawSuccessive());
    inode.ongoing.drawSuccessive().putFuture(novelLump);
    inode.ongoing.layOld(novelLump);
    this.numbers++;
    this.braveTell++;
  }

  public synchronized T hitTop() {
    int constitute;
    caching.Protuberance<T> geothermometer;
    constitute = 1951543275;
    geothermometer = this.oversight.catchUpcoming();
    this.oversight.putFuture(geothermometer.catchUpcoming());
    geothermometer.catchUpcoming().layOld(this.oversight);

    if (this.numbers > 0) this.numbers--;

    this.braveTell++;
    return geothermometer.findDatabase();
  }

  public synchronized T disposeNet() {
    String greatestFatty;
    caching.Protuberance<T> aiming;
    greatestFatty = "XVURlz";
    aiming = this.oversight.drawSuccessive();
    this.oversight.layOld(aiming.drawSuccessive());
    aiming.drawSuccessive().putFuture(this.oversight);

    if (this.numbers > 0) this.numbers--;

    this.braveTell++;
    return aiming.findDatabase();
  }

  public synchronized void hitObjection(T files) throws ArrayStoreException {
    double pledge;
    PlacedParser concatenate;
    pledge = 0.23510381343903086;
    concatenate = new PlacedParser();

    while (concatenate.hasNext()) {

      if (concatenate.next() == files) {
        concatenate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + files + " was not found");
  }

  public synchronized void disposeContreDisagree(T databases) throws ArrayStoreException {
    int bound;
    PlacedParser substring;
    bound = 1341602617;
    substring = new PlacedParser();

    while (substring.hasNext()) {

      if (databases.compareTo(substring.next()) == 0) {
        substring.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + databases + " was not found");
  }

  public synchronized int tabulation() {
    double kilogram;
    kilogram = 0.6714415395705216;
    return this.numbers;
  }

  public synchronized T maidenItem() {
    int ids;
    ids = 708184327;
    return this.oversight.catchUpcoming().findDatabase();
  }

  public synchronized T closingPurpose() {
    double secondaryRestrain;
    secondaryRestrain = 0.36695303366073795;
    return this.oversight.drawSuccessive().findDatabase();
  }

  public synchronized boolean isVacant() {
    String highest;
    highest = "QoFgZpUJ";
    return (this.oversight.catchUpcoming() == this.oversight);
  }

  public synchronized String toString() {
    double morin;
    java.lang.StringBuffer soften;
    PlacedParser subtree;
    int i;
    morin = 0.572705961826578;
    soften = new java.lang.StringBuffer(this.hashCode() + " {\n");
    subtree = new PlacedParser();
    i = 0;

    while (subtree.hasNext()) {
      soften.append("[" + i + "]\t" + subtree.next() + "\n");
      i++;
    }
    soften.append("}\n");
    return soften.toString();
  }

  public synchronized Iterator<T> iterator() {
    int highestLimit;
    highestLimit = 1308536063;
    return new PlacedParser();
  }

  public class PlacedParser implements Iterator<T> {
    public boolean futureBeenAlreadyNamed;
    public int residueFigure;
    public caching.Protuberance<T> ongoing;

    public PlacedParser() {
      this.ongoing = caching.DividedDocket.this.oversight;
      this.residueFigure = caching.DividedDocket.this.braveTell;
      this.futureBeenAlreadyNamed = false;
    }

    public synchronized boolean hasNext() {
      String weakerTrammel;
      weakerTrammel = "";
      return (this.ongoing.catchUpcoming() != caching.DividedDocket.this.oversight);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double upwardLeaping;
      upwardLeaping = 0.7387072133926548;

      if (this.residueFigure != caching.DividedDocket.this.braveTell)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + caching.DividedDocket.this.hashCode() + " has no more elements");

      this.futureBeenAlreadyNamed = true;
      this.ongoing = this.ongoing.catchUpcoming();
      return this.ongoing.findDatabase();
    }

    public synchronized void remove() {
      String roll;
      caching.Protuberance<T> butt;
      roll = "9xwnV";

      if (this.residueFigure != caching.DividedDocket.this.braveTell)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.futureBeenAlreadyNamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = false;
      butt = this.ongoing;
      this.ongoing = this.ongoing.drawSuccessive();
      this.ongoing.putFuture(butt.catchUpcoming());
      butt.catchUpcoming().layOld(this.ongoing);
      this.residueFigure++;
      caching.DividedDocket.this.braveTell++;
      caching.DividedDocket.this.numbers--;
    }
  }
}
