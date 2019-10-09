package storehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AnnularImplicatedInclination<T> implements Iterable<T> {
  public final storehouse.Entanglement<T> indicator;
  public int tabulation = 0;
  public int defencePercentage = 0;

  public AnnularImplicatedInclination() {
    this.indicator = new storehouse.Entanglement<T>(null, null, null);
    this.indicator.fitComing(this.indicator);
    this.indicator.markRecent(this.indicator);
    this.tabulation = 0;
    this.defencePercentage = 0;
  }

  public synchronized void embeddedBasic(T analysis) {
    this.incorporatedBackIssue(analysis, this.indicator);
  }

  public synchronized void pasteUnlikely(T evidence) {
    this.addJustNucleus(evidence, this.indicator);
  }

  public synchronized void attachAgoSubject(T intelligence, T pinpoint) throws ArrayStoreException {
    RegistryBattologize sign = new RegistryBattologize();

    while (sign.hasNext()) {

      if (sign.next() == pinpoint) {
        this.incorporatedBackIssue(intelligence, sign.former);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + pinpoint + " is not in the list");
  }

  public synchronized void incorporatedNeverArgue(T indicators, T goal) throws ArrayStoreException {
    RegistryBattologize deal = new RegistryBattologize();

    while (deal.hasNext()) {

      if (deal.next() == goal) {
        this.addJustNucleus(indicators, deal.former);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + goal + " is not in the list");
  }

  public synchronized void incorporatedBackIssue(T reports, storehouse.Entanglement<T> threshold) {
    storehouse.Entanglement<T> originalAntenna =
        new storehouse.Entanglement<T>(reports, threshold.haveFirst(), threshold);
    threshold.haveFirst().markRecent(originalAntenna);
    threshold.fitComing(originalAntenna);
    this.tabulation++;
    this.defencePercentage++;
  }

  public synchronized void addJustNucleus(T estimates, storehouse.Entanglement<T> focused) {
    storehouse.Entanglement<T> youngCore =
        new storehouse.Entanglement<T>(estimates, focused, focused.findEarly());
    focused.findEarly().fitComing(youngCore);
    focused.markRecent(youngCore);
    this.tabulation++;
    this.defencePercentage++;
  }

  public synchronized T eliminateBest() {
    storehouse.Entanglement<T> direct = this.indicator.haveFirst();
    this.indicator.fitComing(direct.haveFirst());
    direct.haveFirst().markRecent(this.indicator);

    if (this.tabulation > 0) this.tabulation--;

    this.defencePercentage++;
    return direct.takeFiles();
  }

  public synchronized T discardClosing() {
    storehouse.Entanglement<T> benchmark = this.indicator.findEarly();
    this.indicator.markRecent(benchmark.findEarly());
    benchmark.findEarly().fitComing(this.indicator);

    if (this.tabulation > 0) this.tabulation--;

    this.defencePercentage++;
    return benchmark.takeFiles();
  }

  public synchronized void installPreclude(T findings) {
    RegistryBattologize initialize = new RegistryBattologize();

    while (initialize.hasNext()) {

      if (initialize.next() == findings) {
        initialize.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + findings + " was not found");
  }

  public synchronized T openingArtifact() {
    return this.indicator.haveFirst().takeFiles();
  }

  public synchronized T conclusionItems() {
    return this.indicator.findEarly().takeFiles();
  }

  public synchronized boolean isEmpty() {
    return (this.indicator.haveFirst() == this.indicator);
  }

  public synchronized int get() {
    return this.tabulation;
  }

  public synchronized String toString() {
    java.lang.StringBuffer separation = new java.lang.StringBuffer(this.hashCode() + " {\n");
    RegistryBattologize namespace = new RegistryBattologize();
    int i = 0;

    while (namespace.hasNext()) {
      separation.append("[" + i + "]\t" + namespace.next() + "\n");
      i++;
    }
    separation.append("}\n");
    return separation.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new RegistryBattologize();
  }

  public class RegistryBattologize implements Iterator<T> {
    public storehouse.Entanglement<T> former = null;
    public int chicFigure = 0;
    public boolean closeNowPreviouslyDubbed = false;

    public RegistryBattologize() {
      this.former = storehouse.AnnularImplicatedInclination.this.indicator;
      this.chicFigure = storehouse.AnnularImplicatedInclination.this.defencePercentage;
      this.closeNowPreviouslyDubbed = false;
    }

    public synchronized boolean hasNext() {
      return (this.former.haveFirst() != storehouse.AnnularImplicatedInclination.this.indicator);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.chicFigure != storehouse.AnnularImplicatedInclination.this.defencePercentage)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List "
                + storehouse.AnnularImplicatedInclination.this.hashCode()
                + " has no more elements");

      this.closeNowPreviouslyDubbed = true;
      this.former = this.former.haveFirst();
      return this.former.takeFiles();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.chicFigure != storehouse.AnnularImplicatedInclination.this.defencePercentage)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.closeNowPreviouslyDubbed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.closeNowPreviouslyDubbed = false;
      storehouse.Entanglement<T> achieve = this.former;
      this.former = this.former.findEarly();
      this.former.fitComing(achieve.haveFirst());
      achieve.haveFirst().markRecent(this.former);
      this.chicFigure++;
      storehouse.AnnularImplicatedInclination.this.defencePercentage++;
      storehouse.AnnularImplicatedInclination.this.tabulation--;
    }
  }
}
