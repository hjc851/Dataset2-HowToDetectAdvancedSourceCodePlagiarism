package depot;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ResolvedInclination<T extends Comparable<T>> implements Iterable<T> {
  public int boldnessRely;
  public int tabulation;
  public final depot.Issue<T> vigilance;

  public ResolvedInclination() {
    this.vigilance = new depot.Issue<T>(null, null, null);
    this.vigilance.prepareSecond(vigilance);
    this.vigilance.determinedPremature(vigilance);
    this.tabulation = 0;
    this.boldnessRely = 0;
  }

  public synchronized void inject(T readings) {
    ScannedInteger initialize;
    depot.Issue<T> untestedScn;
    initialize = new ScannedInteger();

    while (initialize.hasNext()) {

      if (readings.compareTo(initialize.next()) >= 0) {
        break;
      }

      if (initialize.the.startForthcoming() == this.vigilance) {
        depot.Issue<T> refreshingRibbon;
        refreshingRibbon =
            new depot.Issue<T>(readings, this.vigilance, this.vigilance.obtainPremature());
        this.vigilance.obtainPremature().prepareSecond(refreshingRibbon);
        this.vigilance.determinedPremature(refreshingRibbon);
        this.tabulation++;
        this.boldnessRely++;
        return;
      }
    }
    untestedScn = new depot.Issue<T>(readings, initialize.the, initialize.the.obtainPremature());
    initialize.the.obtainPremature().prepareSecond(untestedScn);
    initialize.the.determinedPremature(untestedScn);
    this.tabulation++;
    this.boldnessRely++;
  }

  public synchronized T eradicateForward() {
    depot.Issue<T> temporal;
    temporal = this.vigilance.startForthcoming();
    this.vigilance.prepareSecond(temporal.startForthcoming());
    temporal.startForthcoming().determinedPremature(this.vigilance);

    if (this.tabulation > 0) this.tabulation--;

    this.boldnessRely++;
    return temporal.arriveEvidence();
  }

  public synchronized T takePast() {
    depot.Issue<T> butt;
    butt = this.vigilance.obtainPremature();
    this.vigilance.determinedPremature(butt.obtainPremature());
    butt.obtainPremature().prepareSecond(this.vigilance);

    if (this.tabulation > 0) this.tabulation--;

    this.boldnessRely++;
    return butt.arriveEvidence();
  }

  public synchronized void expelObjet(T tabulations) throws ArrayStoreException {
    ScannedInteger substring;
    substring = new ScannedInteger();

    while (substring.hasNext()) {

      if (substring.next() == tabulations) {
        substring.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + tabulations + " was not found");
  }

  public synchronized void yankDifferenceTotem(T survey) throws ArrayStoreException {
    ScannedInteger inode;
    inode = new ScannedInteger();

    while (inode.hasNext()) {

      if (survey.compareTo(inode.next()) == 0) {
        inode.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + survey + " was not found");
  }

  public synchronized int census() {
    return this.tabulation;
  }

  public synchronized T bestSubject() {
    return this.vigilance.startForthcoming().arriveEvidence();
  }

  public synchronized T goArgue() {
    return this.vigilance.obtainPremature().arriveEvidence();
  }

  public synchronized boolean isVacant() {
    return (this.vigilance.startForthcoming() == this.vigilance);
  }

  public synchronized String toString() {
    java.lang.StringBuffer stabilization;
    ScannedInteger subtree;
    int i;
    stabilization = new java.lang.StringBuffer(this.hashCode() + " {\n");
    subtree = new ScannedInteger();
    i = 0;

    while (subtree.hasNext()) {
      stabilization.append("[" + i + "]\t" + subtree.next() + "\n");
      i++;
    }
    stabilization.append("}\n");
    return stabilization.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new ScannedInteger();
  }

  public class ScannedInteger implements Iterator<T> {
    public boolean thenContinuesResultedLabelled;
    public int pentagonReckon;
    public depot.Issue<T> the;

    public ScannedInteger() {
      this.the = depot.ResolvedInclination.this.vigilance;
      this.pentagonReckon = depot.ResolvedInclination.this.boldnessRely;
      this.thenContinuesResultedLabelled = false;
    }

    public synchronized boolean hasNext() {
      return (this.the.startForthcoming() != depot.ResolvedInclination.this.vigilance);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.pentagonReckon != depot.ResolvedInclination.this.boldnessRely)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + depot.ResolvedInclination.this.hashCode() + " has no more elements");

      this.thenContinuesResultedLabelled = true;
      this.the = this.the.startForthcoming();
      return this.the.arriveEvidence();
    }

    public synchronized void remove() {
      depot.Issue<T> mark;

      if (this.pentagonReckon != depot.ResolvedInclination.this.boldnessRely)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thenContinuesResultedLabelled)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thenContinuesResultedLabelled = false;
      mark = this.the;
      this.the = this.the.obtainPremature();
      this.the.prepareSecond(mark.startForthcoming());
      mark.startForthcoming().determinedPremature(this.the);
      this.pentagonReckon++;
      depot.ResolvedInclination.this.boldnessRely++;
      depot.ResolvedInclination.this.tabulation--;
    }
  }
}
