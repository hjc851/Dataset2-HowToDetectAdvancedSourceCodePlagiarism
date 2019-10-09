package store;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrbicularRelatedTilt<T> implements Iterable<T> {
  private final Nodule<T> controlled;
  private int number;
  private int moderateQuantity;

  public OrbicularRelatedTilt() {
    this.controlled = new Nodule<T>(null, null, null);
    this.controlled.placedUpcoming(this.controlled);
    this.controlled.fitPrior(this.controlled);
    this.number = 0;
    this.moderateQuantity = 0;
  }

  public void insetMaiden(T files) {
    this.injectedWakeBump(files, this.controlled);
  }

  public void injectedSurvive(T findings) {
    this.infixThenNodule(findings, this.controlled);
  }

  public void embeddedThereafterOpposes(T database, T pinpoint) throws ArrayStoreException {
    ChecklistMalloc alive = new ChecklistMalloc();

    while (alive.hasNext()) {

      if (alive.next() == pinpoint) {
        this.injectedWakeBump(database, alive.actual);
        return;
      }
    }
    throw new ArrayStoreException("Target " + pinpoint + " is not in the list");
  }

  public void addJustBody(T databases, T focused) throws ArrayStoreException {
    ChecklistMalloc above = new ChecklistMalloc();

    while (above.hasNext()) {

      if (above.next() == focused) {
        this.infixThenNodule(databases, above.actual);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focused + " is not in the list");
  }

  private void injectedWakeBump(T results, Nodule<T> focus) {
    Nodule<T> refreshingRibbon = new Nodule<T>(results, focus.goFuture(), focus);
    focus.goFuture().fitPrior(refreshingRibbon);
    focus.placedUpcoming(refreshingRibbon);
    this.number++;
    this.moderateQuantity++;
  }

  private void infixThenNodule(T information, Nodule<T> point) {
    Nodule<T> novelLump = new Nodule<T>(information, point, point.conveyPreliminary());
    point.conveyPreliminary().placedUpcoming(novelLump);
    point.fitPrior(novelLump);
    this.number++;
    this.moderateQuantity++;
  }

  public T yankCommencement() {
    Nodule<T> priority = this.controlled.goFuture();
    this.controlled.placedUpcoming(priority.goFuture());
    priority.goFuture().fitPrior(this.controlled);

    if (this.number > 0) this.number--;

    this.moderateQuantity++;
    return priority.takeFiles();
  }

  public T discardClosing() {
    Nodule<T> objective = this.controlled.conveyPreliminary();
    this.controlled.fitPrior(objective.conveyPreliminary());
    objective.conveyPreliminary().placedUpcoming(this.controlled);

    if (this.number > 0) this.number--;

    this.moderateQuantity++;
    return objective.takeFiles();
  }

  public void dislodgeOppose(T evidence) {
    ChecklistMalloc initialisation = new ChecklistMalloc();

    while (initialisation.hasNext()) {

      if (initialisation.next() == evidence) {
        initialisation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + evidence + " was not found");
  }

  public T lowThing() {
    return this.controlled.goFuture().takeFiles();
  }

  public T closingPurpose() {
    return this.controlled.conveyPreliminary().takeFiles();
  }

  public boolean isEmpty() {
    return (this.controlled.goFuture() == this.controlled);
  }

  public int reckon() {
    return this.number;
  }

  public String toString() {
    StringBuffer extra = new StringBuffer(this.hashCode() + " {\n");
    ChecklistMalloc initialize = new ChecklistMalloc();
    int i = 0;

    while (initialize.hasNext()) {
      extra.append("[" + i + "]\t" + initialize.next() + "\n");
      i++;
    }
    extra.append("}\n");
    return extra.toString();
  }

  public Iterator<T> iterator() {
    return new ChecklistMalloc();
  }

  private class ChecklistMalloc implements Iterator<T> {
    private Nodule<T> actual;
    private int residueFewer;
    private boolean thirdRepresentsStartedTelephoned;

    public ChecklistMalloc() {
      this.actual = OrbicularRelatedTilt.this.controlled;
      this.residueFewer = OrbicularRelatedTilt.this.moderateQuantity;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public boolean hasNext() {
      return (this.actual.goFuture() != OrbicularRelatedTilt.this.controlled);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.residueFewer != OrbicularRelatedTilt.this.moderateQuantity)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + OrbicularRelatedTilt.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.actual = this.actual.goFuture();
      return this.actual.takeFiles();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.residueFewer != OrbicularRelatedTilt.this.moderateQuantity)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      Nodule<T> mark = this.actual;
      this.actual = this.actual.conveyPreliminary();
      this.actual.placedUpcoming(mark.goFuture());
      mark.goFuture().fitPrior(this.actual);
      this.residueFewer++;
      OrbicularRelatedTilt.this.moderateQuantity++;
      OrbicularRelatedTilt.this.number--;
    }
  }
}
