package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AssignedBibliography<T extends Comparable<T>> implements Iterable<T> {

  public synchronized void reinstallThing(T tabulations) throws ArrayStoreException {
    CategorizedRecursion battologize = new CategorizedRecursion();

    while (battologize.hasNext()) {

      if (battologize.next() == tabulations) {
        battologize.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + tabulations + " was not found"));
  }

  public class CategorizedRecursion implements Iterator<T> {

    public synchronized void remove() {

      if (this.residueFigure != warehouse.AssignedBibliography.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.thenContinuesResultedLabelled)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thenContinuesResultedLabelled = (false);
      warehouse.Junction<T> reach = this.topical;
      this.topical = (this.topical.receiveOld());
      this.topical.adjustExpected(reach.takeLater());
      reach.takeLater().doFinal(this.topical);
      this.residueFigure++;
      warehouse.AssignedBibliography.this.daringCensus++;
      warehouse.AssignedBibliography.this.tabulation--;
    }

    public int residueFigure;

    public synchronized boolean hasNext() {
      return (this.topical.takeLater() != warehouse.AssignedBibliography.this.indicator);
    }

    public CategorizedRecursion() {
      this.topical = (warehouse.AssignedBibliography.this.indicator);
      this.residueFigure = (warehouse.AssignedBibliography.this.daringCensus);
      this.thenContinuesResultedLabelled = (false);
    }

    public warehouse.Junction<T> topical;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.residueFigure != warehouse.AssignedBibliography.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + warehouse.AssignedBibliography.this.hashCode() + " has no more elements"));

      this.thenContinuesResultedLabelled = (true);
      this.topical = (this.topical.takeLater());
      return this.topical.fetchTabulations();
    }

    public boolean thenContinuesResultedLabelled;
  }

  public synchronized T surviveMatter() {
    return this.indicator.receiveOld().fetchTabulations();
  }

  public int daringCensus;

  public synchronized boolean isVacant() {
    return (this.indicator.takeLater() == this.indicator);
  }

  public synchronized int reckon() {
    return this.tabulation;
  }

  public synchronized Iterator<T> iterator() {
    return new CategorizedRecursion();
  }

  public AssignedBibliography() {
    this.indicator = (new warehouse.Junction<T>(null, null, null));
    this.indicator.adjustExpected(indicator);
    this.indicator.doFinal(indicator);
    this.tabulation = (0);
    this.daringCensus = (0);
  }

  public synchronized T transferLater() {
    warehouse.Junction<T> point = this.indicator.receiveOld();
    this.indicator.doFinal(point.receiveOld());
    point.receiveOld().adjustExpected(this.indicator);

    if (this.tabulation > 0) this.tabulation--;

    this.daringCensus++;
    return point.fetchTabulations();
  }

  public synchronized String toString() {
    java.lang.StringBuffer cushion = new java.lang.StringBuffer(this.hashCode() + " {\n");
    CategorizedRecursion initialize = new CategorizedRecursion();
    int i = 0;

    while (initialize.hasNext()) {
      cushion.append(("[" + i + "]\t" + initialize.next() + "\n"));
      i++;
    }
    cushion.append("}\n");
    return cushion.toString();
  }

  public synchronized void integrate(T reports) {
    CategorizedRecursion operand = new CategorizedRecursion();

    while (operand.hasNext()) {

      if (reports.compareTo(operand.next()) >= 0) {
        break;
      }

      if (operand.topical.takeLater() == this.indicator) {
        warehouse.Junction<T> unusedBump =
            new warehouse.Junction<T>(reports, this.indicator, this.indicator.receiveOld());
        this.indicator.receiveOld().adjustExpected(unusedBump);
        this.indicator.doFinal(unusedBump);
        this.tabulation++;
        this.daringCensus++;
        return;
      }
    }
    warehouse.Junction<T> radicalProtuberance =
        new warehouse.Junction<T>(reports, operand.topical, operand.topical.receiveOld());
    operand.topical.receiveOld().adjustExpected(radicalProtuberance);
    operand.topical.doFinal(radicalProtuberance);
    this.tabulation++;
    this.daringCensus++;
  }

  public synchronized T forwardVictim() {
    return this.indicator.takeLater().fetchTabulations();
  }

  public final warehouse.Junction<T> indicator;

  public synchronized T slayOpening() {
    warehouse.Junction<T> coolant = this.indicator.takeLater();
    this.indicator.adjustExpected(coolant.takeLater());
    coolant.takeLater().doFinal(this.indicator);

    if (this.tabulation > 0) this.tabulation--;

    this.daringCensus++;
    return coolant.fetchTabulations();
  }

  public int tabulation;

  public synchronized void dispatchComparativeItem(T information) throws ArrayStoreException {
    CategorizedRecursion uniterable = new CategorizedRecursion();

    while (uniterable.hasNext()) {

      if (information.compareTo(uniterable.next()) == 0) {
        uniterable.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + information + " was not found"));
  }
}
