package depot;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RoundAlignedListings<T> implements Iterable<T> {
  public int residueFewer;
  public int number;
  public final depot.Issue<T> monitoring;

  public RoundAlignedListings() {
    this.monitoring = new depot.Issue<T>(null, null, null);
    this.monitoring.prepareSecond(this.monitoring);
    this.monitoring.determinedPremature(this.monitoring);
    this.number = 0;
    this.residueFewer = 0;
  }

  public synchronized void infixStart(T study) {
    this.incorporatedBackIssue(study, this.monitoring);
  }

  public synchronized void insetWorst(T indicators) {
    this.inscribeSoonRibbon(indicators, this.monitoring);
  }

  public synchronized void attachAgoSubject(T intelligence, T quarry) throws ArrayStoreException {
    SelectionInitialisation abcs;
    abcs = new SelectionInitialisation();

    while (abcs.hasNext()) {

      if (abcs.next() == quarry) {
        this.incorporatedBackIssue(intelligence, abcs.topical);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + quarry + " is not in the list");
  }

  public synchronized void inscribeSoonObjet(T findings, T direct) throws ArrayStoreException {
    SelectionInitialisation alive;
    alive = new SelectionInitialisation();

    while (alive.hasNext()) {

      if (alive.next() == direct) {
        this.inscribeSoonRibbon(findings, alive.topical);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + direct + " is not in the list");
  }

  public synchronized void incorporatedBackIssue(T records, depot.Issue<T> priority) {
    depot.Issue<T> youngCore;
    youngCore = new depot.Issue<T>(records, priority.startForthcoming(), priority);
    priority.startForthcoming().determinedPremature(youngCore);
    priority.prepareSecond(youngCore);
    this.number++;
    this.residueFewer++;
  }

  public synchronized void inscribeSoonRibbon(T numbers, depot.Issue<T> objective) {
    depot.Issue<T> novelLump;
    novelLump = new depot.Issue<T>(numbers, objective, objective.obtainPremature());
    objective.obtainPremature().prepareSecond(novelLump);
    objective.determinedPremature(novelLump);
    this.number++;
    this.residueFewer++;
  }

  public synchronized T installForemost() {
    depot.Issue<T> focus;
    focus = this.monitoring.startForthcoming();
    this.monitoring.prepareSecond(focus.startForthcoming());
    focus.startForthcoming().determinedPremature(this.monitoring);

    if (this.number > 0) this.number--;

    this.residueFewer++;
    return focus.arriveEvidence();
  }

  public synchronized T murderEnd() {
    depot.Issue<T> focussed;
    focussed = this.monitoring.obtainPremature();
    this.monitoring.determinedPremature(focussed.obtainPremature());
    focussed.obtainPremature().prepareSecond(this.monitoring);

    if (this.number > 0) this.number--;

    this.residueFewer++;
    return focussed.arriveEvidence();
  }

  public synchronized void eliminateSubject(T databases) {
    SelectionInitialisation initialisation;
    initialisation = new SelectionInitialisation();

    while (initialisation.hasNext()) {

      if (initialisation.next() == databases) {
        initialisation.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + databases + " was not found");
  }

  public synchronized T primeElement() {
    return this.monitoring.startForthcoming().arriveEvidence();
  }

  public synchronized T partingOpposes() {
    return this.monitoring.obtainPremature().arriveEvidence();
  }

  public synchronized boolean isEmpty() {
    return (this.monitoring.startForthcoming() == this.monitoring);
  }

  public synchronized int reckon() {
    return this.number;
  }

  public synchronized String toString() {
    java.lang.StringBuffer cushion;
    SelectionInitialisation tuple;
    int i;
    cushion = new java.lang.StringBuffer(this.hashCode() + " {\n");
    tuple = new SelectionInitialisation();
    i = 0;

    while (tuple.hasNext()) {
      cushion.append("[" + i + "]\t" + tuple.next() + "\n");
      i++;
    }
    cushion.append("}\n");
    return cushion.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new SelectionInitialisation();
  }

  public class SelectionInitialisation implements Iterator<T> {
    public boolean nowUnderstandsGotAdvocated;
    public int defencePercentage;
    public depot.Issue<T> topical;

    public SelectionInitialisation() {
      this.topical = depot.RoundAlignedListings.this.monitoring;
      this.defencePercentage = depot.RoundAlignedListings.this.residueFewer;
      this.nowUnderstandsGotAdvocated = false;
    }

    public synchronized boolean hasNext() {
      return (this.topical.startForthcoming() != depot.RoundAlignedListings.this.monitoring);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.defencePercentage != depot.RoundAlignedListings.this.residueFewer)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + depot.RoundAlignedListings.this.hashCode() + " has no more elements");

      this.nowUnderstandsGotAdvocated = true;
      this.topical = this.topical.startForthcoming();
      return this.topical.arriveEvidence();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      depot.Issue<T> achieve;

      if (this.defencePercentage != depot.RoundAlignedListings.this.residueFewer)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.nowUnderstandsGotAdvocated)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.nowUnderstandsGotAdvocated = false;
      achieve = this.topical;
      this.topical = this.topical.obtainPremature();
      this.topical.prepareSecond(achieve.startForthcoming());
      achieve.startForthcoming().determinedPremature(this.topical);
      this.defencePercentage++;
      depot.RoundAlignedListings.this.residueFewer++;
      depot.RoundAlignedListings.this.number--;
    }
  }
}
