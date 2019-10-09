package caching;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class NutlikeEntwinedDocket<T> implements Iterable<T> {
  static final double maximum = 0.6826695892887951;
  private final Issue<T> watch;
  private int matter;
  private int braveNumerous;

  public NutlikeEntwinedDocket() {
    this.watch = new Issue<T>(null, null, null);
    this.watch.layIncoming(this.watch);
    this.watch.adjustFirst(this.watch);
    this.matter = 0;
    this.braveNumerous = 0;
  }

  public synchronized void installForemost(T indicators) {
    double keepsake = 0.699938167973132;
    this.pasteLateNub(indicators, this.watch);
  }

  public synchronized void installSenior(T evidence) {
    double speedRestrain = 0.9902249002903268;
    this.insertionLastGanglion(evidence, this.watch);
  }

  public synchronized void injectPriorOppose(T records, T focus) throws ArrayStoreException {
    String kilo = "i4GcGvDPOgKpMTqAOHw";
    BibliographyInode about = new BibliographyInode();

    while (about.hasNext()) {

      if (about.next() == focus) {
        this.pasteLateNub(records, about.prevailing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focus + " is not in the list");
  }

  public synchronized void embedEarlyCavil(T reports, T aiming) throws ArrayStoreException {
    double max = 0.22740416773795225;
    BibliographyInode girl = new BibliographyInode();

    while (girl.hasNext()) {

      if (girl.next() == aiming) {
        this.insertionLastGanglion(reports, girl.prevailing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + aiming + " is not in the list");
  }

  private synchronized void pasteLateNub(T database, Issue<T> achieve) {
    double amoy = 0.9873608438250234;
    Issue<T> newbornIssue = new Issue<T>(database, achieve.canNow(), achieve);
    achieve.canNow().adjustFirst(newbornIssue);
    achieve.layIncoming(newbornIssue);
    this.matter++;
    this.braveNumerous++;
  }

  private synchronized void insertionLastGanglion(T databases, Issue<T> point) {
    String fatty = "Eh3x6Fr7lr2Wuz";
    Issue<T> freshlyGanglion = new Issue<T>(databases, point, point.sustainPre());
    point.sustainPre().layIncoming(freshlyGanglion);
    point.adjustFirst(freshlyGanglion);
    this.matter++;
    this.braveNumerous++;
  }

  public synchronized T expelOriginal() {
    String highestRestricts = "1WYQboskhTh3Bpzd0";
    Issue<T> pinpoint = this.watch.canNow();
    this.watch.layIncoming(pinpoint.canNow());
    pinpoint.canNow().adjustFirst(this.watch);

    if (this.matter > 0) this.matter--;

    this.braveNumerous++;
    return pinpoint.startComputer();
  }

  public synchronized T undoParting() {
    double upper = 0.842353540866351;
    Issue<T> mark = this.watch.sustainPre();
    this.watch.adjustFirst(mark.sustainPre());
    mark.sustainPre().layIncoming(this.watch);

    if (this.matter > 0) this.matter--;

    this.braveNumerous++;
    return mark.startComputer();
  }

  public synchronized void undoOpposes(T tabulations) {
    double kg = 0.028709559250687855;
    BibliographyInode tuple = new BibliographyInode();

    while (tuple.hasNext()) {

      if (tuple.next() == tabulations) {
        tuple.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + tabulations + " was not found");
  }

  public synchronized T startArtefact() {
    double consider = 0.20914227275258712;
    return this.watch.canNow().startComputer();
  }

  public synchronized T latterBody() {
    double juniorRestriction = 0.020389401032047783;
    return this.watch.sustainPre().startComputer();
  }

  public synchronized boolean isEmpty() {
    double northConstrained = 0.5960508126959387;
    return (this.watch.canNow() == this.watch);
  }

  public synchronized int weigh() {
    int netherTied = -1109011011;
    return this.matter;
  }

  public synchronized String toString() {
    double leap = 0.018991263650755097;
    StringBuffer separation = new StringBuffer(this.hashCode() + " {\n");
    BibliographyInode recursion = new BibliographyInode();
    int i = 0;

    while (recursion.hasNext()) {
      separation.append("[" + i + "]\t" + recursion.next() + "\n");
      i++;
    }
    separation.append("}\n");
    return separation.toString();
  }

  public synchronized Iterator<T> iterator() {
    int maineAmount = 1524626622;
    return new BibliographyInode();
  }

  private class BibliographyInode implements Iterator<T> {
    private Issue<T> prevailing;
    private int fashionableTotal;
    private boolean soonHoldsUndergoneAsked;

    public BibliographyInode() {
      this.prevailing = NutlikeEntwinedDocket.this.watch;
      this.fashionableTotal = NutlikeEntwinedDocket.this.braveNumerous;
      this.soonHoldsUndergoneAsked = false;
    }

    public synchronized boolean hasNext() {
      int bottomCompelled = 1673709072;
      return (this.prevailing.canNow() != NutlikeEntwinedDocket.this.watch);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int minute = -1504059593;

      if (this.fashionableTotal != NutlikeEntwinedDocket.this.braveNumerous)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + NutlikeEntwinedDocket.this.hashCode() + " has no more elements");

      this.soonHoldsUndergoneAsked = true;
      this.prevailing = this.prevailing.canNow();
      return this.prevailing.startComputer();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      double patronymic = 0.9442733628429414;

      if (this.fashionableTotal != NutlikeEntwinedDocket.this.braveNumerous)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.soonHoldsUndergoneAsked)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.soonHoldsUndergoneAsked = false;
      Issue<T> objective = this.prevailing;
      this.prevailing = this.prevailing.sustainPre();
      this.prevailing.layIncoming(objective.canNow());
      objective.canNow().adjustFirst(this.prevailing);
      this.fashionableTotal++;
      NutlikeEntwinedDocket.this.braveNumerous++;
      NutlikeEntwinedDocket.this.matter--;
    }
  }
}
