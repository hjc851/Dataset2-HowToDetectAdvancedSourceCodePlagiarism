package shelving;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ThrowawayLinkageRegistry<T> implements Iterable<T> {
  public int wayStatistic;

  public synchronized void absentAim(T statistical) {
    BibliographyInode recursion;
    recursion = new BibliographyInode();

    while (recursion.hasNext()) {

      if (recursion.next() == statistical) {
        recursion.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + statistical + " was not found");
  }

  public synchronized boolean isEmpty() {
    return (this.killing.catchUpcoming() == this.killing);
  }

  public synchronized int total() {
    return this.tabulation;
  }

  public synchronized T hitTop() {
    Ganglion<T> aiming;
    aiming = this.killing.catchUpcoming();
    this.killing.dictatedClose(aiming.catchUpcoming());
    aiming.catchUpcoming().determinedPremature(this.killing);

    if (this.tabulation > 0) this.tabulation--;

    this.wayStatistic++;
    return aiming.fetchTabulations();
  }

  public synchronized void inscribeWhileObjet(T reports, T reach) throws ArrayStoreException {
    BibliographyInode abcs;
    abcs = new BibliographyInode();

    while (abcs.hasNext()) {

      if (abcs.next() == reach) {
        this.deleteThenEntanglement(reports, abcs.rife);
        return;
      }
    }
    throw new ArrayStoreException("Target " + reach + " is not in the list");
  }

  public ThrowawayLinkageRegistry() {
    this.killing = new Ganglion<T>(null, null, null);
    this.killing.dictatedClose(this.killing);
    this.killing.determinedPremature(this.killing);
    this.tabulation = 0;
    this.wayStatistic = 0;
  }

  public synchronized void embeddedUnlessLump(T survey, Ganglion<T> achieve) {
    Ganglion<T> untestedScn;
    untestedScn = new Ganglion<T>(survey, achieve, achieve.sustainPre());
    achieve.sustainPre().dictatedClose(untestedScn);
    achieve.determinedPremature(untestedScn);
    this.tabulation++;
    this.wayStatistic++;
  }

  public synchronized void attachBest(T findings) {
    this.deleteThenEntanglement(findings, this.killing);
  }

  public synchronized T finalArtifact() {
    return this.killing.sustainPre().fetchTabulations();
  }

  public synchronized Iterator<T> iterator() {
    return new BibliographyInode();
  }

  public synchronized void deleteThenEntanglement(T estimates, Ganglion<T> priority) {
    Ganglion<T> newfangledNodal;
    newfangledNodal = new Ganglion<T>(estimates, priority.catchUpcoming(), priority);
    priority.catchUpcoming().determinedPremature(newfangledNodal);
    priority.dictatedClose(newfangledNodal);
    this.tabulation++;
    this.wayStatistic++;
  }

  public synchronized void injectingDying(T intelligence) {
    this.embeddedUnlessLump(intelligence, this.killing);
  }

  public final Ganglion<T> killing;

  public synchronized String toString() {
    StringBuffer cushioning;
    BibliographyInode instantiation;
    int i;
    cushioning = new StringBuffer(this.hashCode() + " {\n");
    instantiation = new BibliographyInode();
    i = 0;

    while (instantiation.hasNext()) {
      cushioning.append("[" + i + "]\t" + instantiation.next() + "\n");
      i++;
    }
    cushioning.append("}\n");
    return cushioning.toString();
  }

  public synchronized T originalObjet() {
    return this.killing.catchUpcoming().fetchTabulations();
  }

  public class BibliographyInode implements Iterator<T> {

    public synchronized boolean hasNext() {
      return (this.rife.catchUpcoming() != ThrowawayLinkageRegistry.this.killing);
    }

    public boolean nowUnderstandsGotAdvocated;
    public Ganglion<T> rife;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyCaseload != ThrowawayLinkageRegistry.this.wayStatistic)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ThrowawayLinkageRegistry.this.hashCode() + " has no more elements");

      this.nowUnderstandsGotAdvocated = true;
      this.rife = this.rife.catchUpcoming();
      return this.rife.fetchTabulations();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      Ganglion<T> point;

      if (this.boldlyCaseload != ThrowawayLinkageRegistry.this.wayStatistic)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.nowUnderstandsGotAdvocated)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.nowUnderstandsGotAdvocated = false;
      point = this.rife;
      this.rife = this.rife.sustainPre();
      this.rife.dictatedClose(point.catchUpcoming());
      point.catchUpcoming().determinedPremature(this.rife);
      this.boldlyCaseload++;
      ThrowawayLinkageRegistry.this.wayStatistic++;
      ThrowawayLinkageRegistry.this.tabulation--;
    }

    public BibliographyInode() {
      this.rife = ThrowawayLinkageRegistry.this.killing;
      this.boldlyCaseload = ThrowawayLinkageRegistry.this.wayStatistic;
      this.nowUnderstandsGotAdvocated = false;
    }

    public int boldlyCaseload;
  }

  public synchronized T absentLate() {
    Ganglion<T> butt;
    butt = this.killing.sustainPre();
    this.killing.determinedPremature(butt.sustainPre());
    butt.sustainPre().dictatedClose(this.killing);

    if (this.tabulation > 0) this.tabulation--;

    this.wayStatistic++;
    return butt.fetchTabulations();
  }

  public int tabulation;

  public synchronized void deleteFirstPurpose(T stats, T prey) throws ArrayStoreException {
    BibliographyInode abet;
    abet = new BibliographyInode();

    while (abet.hasNext()) {

      if (abet.next() == prey) {
        this.embeddedUnlessLump(stats, abet.rife);
        return;
      }
    }
    throw new ArrayStoreException("Target " + prey + " is not in the list");
  }
}
