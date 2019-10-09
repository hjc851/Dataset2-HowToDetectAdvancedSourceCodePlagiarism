package storeroom;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GlobalMatchedBibliography<T> implements Iterable<T> {
  private static final int synX1723int = 0;
  private static final String synX1722String = " is not in the list";
  private static final String synX1721String = "Target ";
  private static final String synX1720String = " was not found";
  private static final String synX1719String = "Object ";
  private static final String synX1718String = "}\n";
  private static final String synX1717String = "\n";
  private static final String synX1716String = "]\t";
  private static final String synX1715String = "[";
  private static final int synX1714int = 0;
  private static final String synX1713String = " {\n";
  private static final int synX1712int = 0;

  public synchronized T deleteLatter() {
    storeroom.Ribbon<T> achieve = this.outsentry.receiveOld();
    this.outsentry.determinedPremature(achieve.receiveOld());
    achieve.receiveOld().placeSoon(this.outsentry);

    if (this.consider > synX1712int) this.consider--;

    this.defencePercentage++;
    return achieve.catchFigures();
  }

  public synchronized void incloseTop(T study) {
    this.inscribingOverProblem(study, this.outsentry);
  }

  public synchronized String toString() {
    java.lang.StringBuffer separating =
        new java.lang.StringBuffer(this.hashCode() + synX1713String);
    NumberTuple initialize = new NumberTuple();
    int i = synX1714int;

    while (initialize.hasNext()) {
      separating.append((synX1715String + i + synX1716String + initialize.next() + synX1717String));
      i++;
    }
    separating.append(synX1718String);
    return separating.toString();
  }

  public synchronized T initialAim() {
    return this.outsentry.conveyCome().catchFigures();
  }

  private int defencePercentage = 0;

  private synchronized void inscribingOverProblem(T statistical, storeroom.Ribbon<T> focussed) {
    storeroom.Ribbon<T> youngCore =
        new storeroom.Ribbon<T>(statistical, focussed.conveyCome(), focussed);
    focussed.conveyCome().determinedPremature(youngCore);
    focussed.placeSoon(youngCore);
    this.consider++;
    this.defencePercentage++;
  }

  private synchronized void addJustNucleus(T measurements, storeroom.Ribbon<T> aiming) {
    storeroom.Ribbon<T> newfoundJunction =
        new storeroom.Ribbon<T>(measurements, aiming, aiming.receiveOld());
    aiming.receiveOld().placeSoon(newfoundJunction);
    aiming.determinedPremature(newfoundJunction);
    this.consider++;
    this.defencePercentage++;
  }

  public synchronized int calculate() {
    return this.consider;
  }

  public synchronized Iterator<T> iterator() {
    return new NumberTuple();
  }

  public synchronized void yankTotem(T files) {
    NumberTuple namespace = new NumberTuple();

    while (namespace.hasNext()) {

      if (namespace.next() == files) {
        namespace.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX1719String + files + synX1720String));
  }

  public synchronized void attachLowest(T findings) {
    this.addJustNucleus(findings, this.outsentry);
  }

  public synchronized void attachBeforehandSubject(T records, T threshold)
      throws ArrayStoreException {
    NumberTuple abysm = new NumberTuple();

    while (abysm.hasNext()) {

      if (abysm.next() == threshold) {
        this.addJustNucleus(records, abysm.existing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX1721String + threshold + synX1722String));
  }

  public synchronized T conclusionItems() {
    return this.outsentry.receiveOld().catchFigures();
  }

  public synchronized T discardIntroductory() {
    storeroom.Ribbon<T> benchmark = this.outsentry.conveyCome();
    this.outsentry.placeSoon(benchmark.conveyCome());
    benchmark.conveyCome().determinedPremature(this.outsentry);

    if (this.consider > synX1723int) this.consider--;

    this.defencePercentage++;
    return benchmark.catchFigures();
  }

  private class NumberTuple implements Iterator<T> {

    public NumberTuple() {
      this.existing = (storeroom.GlobalMatchedBibliography.this.outsentry);
      this.langProportion = (storeroom.GlobalMatchedBibliography.this.defencePercentage);
      this.succeedingRemainsGottenTermed = (false);
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.langProportion != storeroom.GlobalMatchedBibliography.this.defencePercentage)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.succeedingRemainsGottenTermed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.succeedingRemainsGottenTermed = (false);
      storeroom.Ribbon<T> direct = this.existing;
      this.existing = (this.existing.receiveOld());
      this.existing.placeSoon(direct.conveyCome());
      direct.conveyCome().determinedPremature(this.existing);
      this.langProportion++;
      storeroom.GlobalMatchedBibliography.this.defencePercentage++;
      storeroom.GlobalMatchedBibliography.this.consider--;
    }

    public synchronized boolean hasNext() {
      return (this.existing.conveyCome() != storeroom.GlobalMatchedBibliography.this.outsentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.langProportion != storeroom.GlobalMatchedBibliography.this.defencePercentage)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List "
                + storeroom.GlobalMatchedBibliography.this.hashCode()
                + " has no more elements"));

      this.succeedingRemainsGottenTermed = (true);
      this.existing = (this.existing.conveyCome());
      return this.existing.catchFigures();
    }

    private boolean succeedingRemainsGottenTermed = false;
    private int langProportion = 0;
    private storeroom.Ribbon<T> existing = null;
  }

  private final storeroom.Ribbon<T> outsentry;

  public synchronized void tuckLaterObjective(T evidence, T focused) throws ArrayStoreException {
    NumberTuple ace = new NumberTuple();

    while (ace.hasNext()) {

      if (ace.next() == focused) {
        this.inscribingOverProblem(evidence, ace.existing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Target " + focused + " is not in the list"));
  }

  public GlobalMatchedBibliography() {
    this.outsentry = (new storeroom.Ribbon<T>(null, null, null));
    this.outsentry.placeSoon(this.outsentry);
    this.outsentry.determinedPremature(this.outsentry);
    this.consider = (0);
    this.defencePercentage = (0);
  }

  private int consider = 0;

  public synchronized boolean isEmpty() {
    return (this.outsentry.conveyCome() == this.outsentry);
  }
}
