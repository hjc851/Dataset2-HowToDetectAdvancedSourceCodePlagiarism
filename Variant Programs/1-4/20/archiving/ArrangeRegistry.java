package archiving;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangeRegistry<T extends Comparable<T>> implements Iterable<T> {
  private final archiving.Nodal<T> watchman;
  private int consider = 0;
  private int residueFigure = 0;

  public ArrangeRegistry() {
    this.watchman = new archiving.Nodal<T>(null, null, null);
    this.watchman.primedLater(watchman);
    this.watchman.adjustFirst(watchman);
    this.consider = 0;
    this.residueFigure = 0;
  }

  public synchronized void infix(T analysis) {
    CategorizedRecursion inode = new CategorizedRecursion();

    while (inode.hasNext()) {

      if (analysis.compareTo(inode.next()) >= 0) {
        break;
      }

      if (inode.circulating.haveFirst() == this.watchman) {
        archiving.Nodal<T> freshClient =
            new archiving.Nodal<T>(analysis, this.watchman, this.watchman.generatePrior());
        this.watchman.generatePrior().primedLater(freshClient);
        this.watchman.adjustFirst(freshClient);
        this.consider++;
        this.residueFigure++;
        return;
      }
    }
    archiving.Nodal<T> revolutionaryGanglia =
        new archiving.Nodal<T>(analysis, inode.circulating, inode.circulating.generatePrior());
    inode.circulating.generatePrior().primedLater(revolutionaryGanglia);
    inode.circulating.adjustFirst(revolutionaryGanglia);
    this.consider++;
    this.residueFigure++;
  }

  public synchronized T undoBasic() {
    archiving.Nodal<T> coolant = this.watchman.haveFirst();
    this.watchman.primedLater(coolant.haveFirst());
    coolant.haveFirst().adjustFirst(this.watchman);

    if (this.consider > 0) this.consider--;

    this.residueFigure++;
    return coolant.catchFigures();
  }

  public synchronized T withdrawConclusion() {
    archiving.Nodal<T> direct = this.watchman.generatePrior();
    this.watchman.adjustFirst(direct.generatePrior());
    direct.generatePrior().primedLater(this.watchman);

    if (this.consider > 0) this.consider--;

    this.residueFigure++;
    return direct.catchFigures();
  }

  public synchronized void eraseArgue(T indicators) throws ArrayStoreException {
    CategorizedRecursion uniterable = new CategorizedRecursion();

    while (uniterable.hasNext()) {

      if (uniterable.next() == indicators) {
        uniterable.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + indicators + " was not found");
  }

  public synchronized void hitMatchedObjection(T computer) throws ArrayStoreException {
    CategorizedRecursion iterate = new CategorizedRecursion();

    while (iterate.hasNext()) {

      if (computer.compareTo(iterate.next()) == 0) {
        iterate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + computer + " was not found");
  }

  public synchronized int enumeration() {
    return this.consider;
  }

  public synchronized T foremostPreclude() {
    return this.watchman.haveFirst().catchFigures();
  }

  public synchronized T lateAim() {
    return this.watchman.generatePrior().catchFigures();
  }

  public synchronized boolean isVacant() {
    return (this.watchman.haveFirst() == this.watchman);
  }

  public synchronized String toString() {
    java.lang.StringBuffer stabilization = new java.lang.StringBuffer(this.hashCode() + " {\n");
    CategorizedRecursion integer = new CategorizedRecursion();
    int i = 0;

    while (integer.hasNext()) {
      stabilization.append("[" + i + "]\t" + integer.next() + "\n");
      i++;
    }
    stabilization.append("}\n");
    return stabilization.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new CategorizedRecursion();
  }

  private class CategorizedRecursion implements Iterator<T> {
    private archiving.Nodal<T> circulating = null;
    private int dodCharge = 0;
    private boolean earlyUsesAlwaysBrought = false;

    public CategorizedRecursion() {
      this.circulating = archiving.ArrangeRegistry.this.watchman;
      this.dodCharge = archiving.ArrangeRegistry.this.residueFigure;
      this.earlyUsesAlwaysBrought = false;
    }

    public synchronized boolean hasNext() {
      return (this.circulating.haveFirst() != archiving.ArrangeRegistry.this.watchman);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.dodCharge != archiving.ArrangeRegistry.this.residueFigure)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + archiving.ArrangeRegistry.this.hashCode() + " has no more elements");

      this.earlyUsesAlwaysBrought = true;
      this.circulating = this.circulating.haveFirst();
      return this.circulating.catchFigures();
    }

    public synchronized void remove() {

      if (this.dodCharge != archiving.ArrangeRegistry.this.residueFigure)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.earlyUsesAlwaysBrought)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.earlyUsesAlwaysBrought = false;
      archiving.Nodal<T> threshold = this.circulating;
      this.circulating = this.circulating.generatePrior();
      this.circulating.primedLater(threshold.haveFirst());
      threshold.haveFirst().adjustFirst(this.circulating);
      this.dodCharge++;
      archiving.ArrangeRegistry.this.residueFigure++;
      archiving.ArrangeRegistry.this.consider--;
    }
  }
}
