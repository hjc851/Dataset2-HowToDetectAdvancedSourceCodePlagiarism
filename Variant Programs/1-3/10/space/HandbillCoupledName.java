package space;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class HandbillCoupledName<T> implements Iterable<T> {
  public int modeEnumerate = 0;
  public int get = 0;
  public final space.Junction<T> sentry;

  public HandbillCoupledName() {
    this.sentry = new space.Junction<T>(null, null, null);
    this.sentry.markAhead(this.sentry);
    this.sentry.layOld(this.sentry);
    this.get = 0;
    this.modeEnumerate = 0;
  }

  public synchronized void embedOutset(T statistical) {
    this.embeddedThereafterLump(statistical, this.sentry);
  }

  public synchronized void infixEnd(T tabulations) {
    this.insertionLastGanglion(tabulations, this.sentry);
  }

  public synchronized void tuckLaterObjective(T files, T place) throws ArrayStoreException {
    BibliographyInode above;
    above = new BibliographyInode();

    while (above.hasNext()) {

      if (above.next() == place) {
        this.embeddedThereafterLump(files, above.present);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + place + " is not in the list");
  }

  public synchronized void insetPriorItem(T results, T goals) throws ArrayStoreException {
    BibliographyInode fad;
    fad = new BibliographyInode();

    while (fad.hasNext()) {

      if (fad.next() == goals) {
        this.insertionLastGanglion(results, fad.present);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + goals + " is not in the list");
  }

  public synchronized void embeddedThereafterLump(T reports, space.Junction<T> focusing) {
    space.Junction<T> hotProblem;
    hotProblem = new space.Junction<T>(reports, focusing.fixAgain(), focusing);
    focusing.fixAgain().layOld(hotProblem);
    focusing.markAhead(hotProblem);
    this.get++;
    this.modeEnumerate++;
  }

  public synchronized void insertionLastGanglion(T evidence, space.Junction<T> mark) {
    space.Junction<T> unusedBump;
    unusedBump = new space.Junction<T>(evidence, mark, mark.canAgo());
    mark.canAgo().markAhead(unusedBump);
    mark.layOld(unusedBump);
    this.get++;
    this.modeEnumerate++;
  }

  public synchronized T discardIntroductory() {
    space.Junction<T> focus;
    focus = this.sentry.fixAgain();
    this.sentry.markAhead(focus.fixAgain());
    focus.fixAgain().layOld(this.sentry);

    if (this.get > 0) this.get--;

    this.modeEnumerate++;
    return focus.generateRecords();
  }

  public synchronized T hitPenultimate() {
    space.Junction<T> focussed;
    focussed = this.sentry.canAgo();
    this.sentry.layOld(focussed.canAgo());
    focussed.canAgo().markAhead(this.sentry);

    if (this.get > 0) this.get--;

    this.modeEnumerate++;
    return focussed.generateRecords();
  }

  public synchronized void banishElement(T information) {
    BibliographyInode initialisation;
    initialisation = new BibliographyInode();

    while (initialisation.hasNext()) {

      if (initialisation.next() == information) {
        initialisation.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + information + " was not found");
  }

  public synchronized T primeElement() {
    return this.sentry.fixAgain().generateRecords();
  }

  public synchronized T lateAim() {
    return this.sentry.canAgo().generateRecords();
  }

  public synchronized boolean isEmpty() {
    return (this.sentry.fixAgain() == this.sentry);
  }

  public synchronized int census() {
    return this.get;
  }

  public synchronized String toString() {
    java.lang.StringBuffer cushioning;
    BibliographyInode init;
    int i;
    cushioning = new java.lang.StringBuffer(this.hashCode() + " {\n");
    init = new BibliographyInode();
    i = 0;

    while (init.hasNext()) {
      cushioning.append("[" + i + "]\t" + init.next() + "\n");
      i++;
    }
    cushioning.append("}\n");
    return cushioning.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new BibliographyInode();
  }

  public class BibliographyInode implements Iterator<T> {
    public boolean thirdRepresentsStartedTelephoned = false;
    public int boldHandful = 0;
    public space.Junction<T> present = null;

    public BibliographyInode() {
      this.present = space.HandbillCoupledName.this.sentry;
      this.boldHandful = space.HandbillCoupledName.this.modeEnumerate;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public synchronized boolean hasNext() {
      return (this.present.fixAgain() != space.HandbillCoupledName.this.sentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldHandful != space.HandbillCoupledName.this.modeEnumerate)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + space.HandbillCoupledName.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.present = this.present.fixAgain();
      return this.present.generateRecords();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      space.Junction<T> priority;

      if (this.boldHandful != space.HandbillCoupledName.this.modeEnumerate)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      priority = this.present;
      this.present = this.present.canAgo();
      this.present.markAhead(priority.fixAgain());
      priority.fixAgain().layOld(this.present);
      this.boldHandful++;
      space.HandbillCoupledName.this.modeEnumerate++;
      space.HandbillCoupledName.this.get--;
    }
  }
}
