package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class DividedDocket<T extends Comparable<T>> implements Iterable<T> {
  private static final String synX1798String = " was not found";
  private static final String synX1797String = "Object ";
  private static final int synX1796int = 0;
  private static final String synX1795String = "}\n";
  private static final String synX1794String = "\n";
  private static final String synX1793String = "]\t";
  private static final String synX1792String = "[";
  private static final int synX1791int = 0;
  private static final String synX1790String = " {\n";
  private static final int synX1789int = 0;
  private static final int synX1788int = 0;
  private static final int synX1787int = 0;
  private static final String synX1786String = " was not found";
  private static final String synX1785String = "Object ";

  public synchronized void withdrawItems(T survey) throws ArrayStoreException {
    CategorizedRecursion namespace;
    namespace = new CategorizedRecursion();

    while (namespace.hasNext()) {

      if (namespace.next() == survey) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX1785String + survey + synX1786String);
  }

  public synchronized T pastObjective() {
    return this.watchman.makeFormer().makeIndicators();
  }

  public synchronized T maidenItem() {
    return this.watchman.conveyCome().makeIndicators();
  }

  public DividedDocket() {
    this.watchman = new Core<T>(null, null, null);
    this.watchman.bentNew(watchman);
    this.watchman.solidifyingElapsed(watchman);
    this.matter = synX1787int;
    this.pentagonReckon = synX1788int;
  }

  public synchronized Iterator<T> iterator() {
    return new CategorizedRecursion();
  }

  private int pentagonReckon = 0;

  public synchronized T deletePremiere() {
    Core<T> unaccompanied;
    unaccompanied = this.watchman.conveyCome();
    this.watchman.bentNew(unaccompanied.conveyCome());
    unaccompanied.conveyCome().solidifyingElapsed(this.watchman);

    if (this.matter > synX1789int) this.matter--;

    this.pentagonReckon++;
    return unaccompanied.makeIndicators();
  }

  public synchronized String toString() {
    StringBuffer cowcatcher;
    CategorizedRecursion parser;
    int i;
    cowcatcher = new StringBuffer(this.hashCode() + synX1790String);
    parser = new CategorizedRecursion();
    i = synX1791int;

    while (parser.hasNext()) {
      cowcatcher.append(synX1792String + i + synX1793String + parser.next() + synX1794String);
      i++;
    }
    cowcatcher.append(synX1795String);
    return cowcatcher.toString();
  }

  private int matter = 0;

  public synchronized int calculate() {
    return this.matter;
  }

  public synchronized void transferComparisonTarget(T measurements) throws ArrayStoreException {
    CategorizedRecursion struct;
    struct = new CategorizedRecursion();

    while (struct.hasNext()) {

      if (measurements.compareTo(struct.next()) == synX1796int) {
        struct.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX1797String + measurements + synX1798String);
  }

  private class CategorizedRecursion implements Iterator<T> {

    public synchronized boolean hasNext() {
      return (this.underway.conveyCome() != DividedDocket.this.watchman);
    }

    public CategorizedRecursion() {
      this.underway = DividedDocket.this.watchman;
      this.boldlyGet = DividedDocket.this.pentagonReckon;
      this.earlyUsesAlwaysBrought = false;
    }

    private boolean earlyUsesAlwaysBrought = false;
    private int boldlyGet = 0;
    private Core<T> underway = null;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyGet != DividedDocket.this.pentagonReckon)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + DividedDocket.this.hashCode() + " has no more elements");

      this.earlyUsesAlwaysBrought = true;
      this.underway = this.underway.conveyCome();
      return this.underway.makeIndicators();
    }

    public synchronized void remove() {
      Core<T> quarry;

      if (this.boldlyGet != DividedDocket.this.pentagonReckon)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.earlyUsesAlwaysBrought)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.earlyUsesAlwaysBrought = false;
      quarry = this.underway;
      this.underway = this.underway.makeFormer();
      this.underway.bentNew(quarry.conveyCome());
      quarry.conveyCome().solidifyingElapsed(this.underway);
      this.boldlyGet++;
      DividedDocket.this.pentagonReckon++;
      DividedDocket.this.matter--;
    }
  }

  public synchronized void embedded(T indicators) {
    CategorizedRecursion pathname;
    Core<T> otherEntanglement;
    pathname = new CategorizedRecursion();

    while (pathname.hasNext()) {

      if (indicators.compareTo(pathname.next()) >= 0) {
        break;
      }

      if (pathname.underway.conveyCome() == this.watchman) {
        Core<T> untriedHub;
        untriedHub = new Core<T>(indicators, this.watchman, this.watchman.makeFormer());
        this.watchman.makeFormer().bentNew(untriedHub);
        this.watchman.solidifyingElapsed(untriedHub);
        this.matter++;
        this.pentagonReckon++;
        return;
      }
    }
    otherEntanglement = new Core<T>(indicators, pathname.underway, pathname.underway.makeFormer());
    pathname.underway.makeFormer().bentNew(otherEntanglement);
    pathname.underway.solidifyingElapsed(otherEntanglement);
    this.matter++;
    this.pentagonReckon++;
  }

  private final Core<T> watchman;

  public synchronized boolean isVacant() {
    return (this.watchman.conveyCome() == this.watchman);
  }

  public synchronized T discardClosing() {
    Core<T> butt;
    butt = this.watchman.makeFormer();
    this.watchman.solidifyingElapsed(butt.makeFormer());
    butt.makeFormer().bentNew(this.watchman);

    if (this.matter > 0) this.matter--;

    this.pentagonReckon++;
    return butt.makeIndicators();
  }
}
