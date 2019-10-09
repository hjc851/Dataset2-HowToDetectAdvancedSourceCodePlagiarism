package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RingedInfluencedRoster<T> implements Iterable<T> {
  public final memory.Nodule<T> ceremonial;
  public int weigh;
  public int moderateQuantity;

  public RingedInfluencedRoster() {
    this.ceremonial = new memory.Nodule<T>(null, null, null);
    this.ceremonial.laidFollowing(this.ceremonial);
    this.ceremonial.determineInitial(this.ceremonial);
    this.weigh = 0;
    this.moderateQuantity = 0;
  }

  public synchronized void addPremiere(T evidence) {
    this.inscribeWhileRibbon(evidence, this.ceremonial);
  }

  public synchronized void inscribeConcluding(T stats) {
    this.introduceAheadClient(stats, this.ceremonial);
  }

  public synchronized void inscribingOverThing(T indicators, T threshold)
      throws ArrayStoreException {
    RostersConcatenate above = new RostersConcatenate();

    while (above.hasNext()) {

      if (above.next() == threshold) {
        this.inscribeWhileRibbon(indicators, above.topical);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + threshold + " is not in the list");
  }

  public synchronized void insertionLastResist(T intelligence, T priority)
      throws ArrayStoreException {
    RostersConcatenate abyss = new RostersConcatenate();

    while (abyss.hasNext()) {

      if (abyss.next() == priority) {
        this.introduceAheadClient(intelligence, abyss.topical);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + priority + " is not in the list");
  }

  public synchronized void inscribeWhileRibbon(T analysis, memory.Nodule<T> focussed) {
    memory.Nodule<T> novelLump = new memory.Nodule<T>(analysis, focussed.fixAgain(), focussed);
    focussed.fixAgain().determineInitial(novelLump);
    focussed.laidFollowing(novelLump);
    this.weigh++;
    this.moderateQuantity++;
  }

  public synchronized void introduceAheadClient(T computer, memory.Nodule<T> mark) {
    memory.Nodule<T> newbornIssue = new memory.Nodule<T>(computer, mark, mark.sustainPre());
    mark.sustainPre().laidFollowing(newbornIssue);
    mark.determineInitial(newbornIssue);
    this.weigh++;
    this.moderateQuantity++;
  }

  public synchronized T ejectEldest() {
    memory.Nodule<T> prey = this.ceremonial.fixAgain();
    this.ceremonial.laidFollowing(prey.fixAgain());
    prey.fixAgain().determineInitial(this.ceremonial);

    if (this.weigh > 0) this.weigh--;

    this.moderateQuantity++;
    return prey.generateRecords();
  }

  public synchronized T deleteLatter() {
    memory.Nodule<T> achieve = this.ceremonial.sustainPre();
    this.ceremonial.determineInitial(achieve.sustainPre());
    achieve.sustainPre().laidFollowing(this.ceremonial);

    if (this.weigh > 0) this.weigh--;

    this.moderateQuantity++;
    return achieve.generateRecords();
  }

  public synchronized void banishElement(T database) {
    RostersConcatenate battologize = new RostersConcatenate();

    while (battologize.hasNext()) {

      if (battologize.next() == database) {
        battologize.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + database + " was not found");
  }

  public synchronized T startArtefact() {
    return this.ceremonial.fixAgain().generateRecords();
  }

  public synchronized T lateAim() {
    return this.ceremonial.sustainPre().generateRecords();
  }

  public synchronized boolean isEmpty() {
    return (this.ceremonial.fixAgain() == this.ceremonial);
  }

  public synchronized int total() {
    return this.weigh;
  }

  public synchronized String toString() {
    java.lang.StringBuffer protection = new java.lang.StringBuffer(this.hashCode() + " {\n");
    RostersConcatenate instantiation = new RostersConcatenate();
    int i = 0;

    while (instantiation.hasNext()) {
      protection.append("[" + i + "]\t" + instantiation.next() + "\n");
      i++;
    }
    protection.append("}\n");
    return protection.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new RostersConcatenate();
  }

  public class RostersConcatenate implements Iterator<T> {
    public memory.Nodule<T> topical;
    public int defencePercentage;
    public boolean upcomingRetainsStayedSummoned;

    public RostersConcatenate() {
      this.topical = memory.RingedInfluencedRoster.this.ceremonial;
      this.defencePercentage = memory.RingedInfluencedRoster.this.moderateQuantity;
      this.upcomingRetainsStayedSummoned = false;
    }

    public synchronized boolean hasNext() {
      return (this.topical.fixAgain() != memory.RingedInfluencedRoster.this.ceremonial);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.defencePercentage != memory.RingedInfluencedRoster.this.moderateQuantity)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + memory.RingedInfluencedRoster.this.hashCode() + " has no more elements");

      this.upcomingRetainsStayedSummoned = true;
      this.topical = this.topical.fixAgain();
      return this.topical.generateRecords();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.defencePercentage != memory.RingedInfluencedRoster.this.moderateQuantity)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.upcomingRetainsStayedSummoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.upcomingRetainsStayedSummoned = false;
      memory.Nodule<T> quarry = this.topical;
      this.topical = this.topical.sustainPre();
      this.topical.laidFollowing(quarry.fixAgain());
      quarry.fixAgain().determineInitial(this.topical);
      this.defencePercentage++;
      memory.RingedInfluencedRoster.this.moderateQuantity++;
      memory.RingedInfluencedRoster.this.weigh--;
    }
  }
}
