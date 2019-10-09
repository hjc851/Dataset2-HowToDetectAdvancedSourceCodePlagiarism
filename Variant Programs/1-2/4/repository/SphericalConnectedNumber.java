package repository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SphericalConnectedNumber<T> implements Iterable<T> {
  private final Issue<T> scout;
  private int enumerate;
  private int moduleRoutine;

  public SphericalConnectedNumber() {
    this.scout = new Issue<T>(null, null, null);
    this.scout.layIncoming(this.scout);
    this.scout.settledPervious(this.scout);
    this.enumerate = 0;
    this.moduleRoutine = 0;
  }

  public void incorporateFreshman(T intelligence) {
    this.incorporatedBackIssue(intelligence, this.scout);
  }

  public void embedLatest(T readings) {
    this.putInsteadPoint(readings, this.scout);
  }

  public void enterAfterwardsArtifact(T findings, T prey) throws ArrayStoreException {
    NameIterate showtime = new NameIterate();

    while (showtime.hasNext()) {

      if (showtime.next() == prey) {
        this.incorporatedBackIssue(findings, showtime.prevailing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + prey + " is not in the list");
  }

  public void attachBeforehandSubject(T survey, T pinpoint) throws ArrayStoreException {
    NameIterate deal = new NameIterate();

    while (deal.hasNext()) {

      if (deal.next() == pinpoint) {
        this.putInsteadPoint(survey, deal.prevailing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + pinpoint + " is not in the list");
  }

  private void incorporatedBackIssue(T measurements, Issue<T> butt) {
    Issue<T> novelLump = new Issue<T>(measurements, butt.driveEarly(), butt);
    butt.driveEarly().settledPervious(novelLump);
    butt.layIncoming(novelLump);
    this.enumerate++;
    this.moduleRoutine++;
  }

  private void putInsteadPoint(T evidence, Issue<T> point) {
    Issue<T> greenNucleus = new Issue<T>(evidence, point, point.goPreceding());
    point.goPreceding().layIncoming(greenNucleus);
    point.settledPervious(greenNucleus);
    this.enumerate++;
    this.moduleRoutine++;
  }

  public T expelOriginal() {
    Issue<T> focusing = this.scout.driveEarly();
    this.scout.layIncoming(focusing.driveEarly());
    focusing.driveEarly().settledPervious(this.scout);

    if (this.enumerate > 0) this.enumerate--;

    this.moduleRoutine++;
    return focusing.becomeStudy();
  }

  public T yankUnlikely() {
    Issue<T> direct = this.scout.goPreceding();
    this.scout.settledPervious(direct.goPreceding());
    direct.goPreceding().layIncoming(this.scout);

    if (this.enumerate > 0) this.enumerate--;

    this.moduleRoutine++;
    return direct.becomeStudy();
  }

  public void removalResist(T numbers) {
    NameIterate initialize = new NameIterate();

    while (initialize.hasNext()) {

      if (initialize.next() == numbers) {
        initialize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + numbers + " was not found");
  }

  public T primeElement() {
    return this.scout.driveEarly().becomeStudy();
  }

  public T pastObjective() {
    return this.scout.goPreceding().becomeStudy();
  }

  public boolean isEmpty() {
    return (this.scout.driveEarly() == this.scout);
  }

  public int figure() {
    return this.enumerate;
  }

  public String toString() {
    StringBuffer neutralize = new StringBuffer(this.hashCode() + " {\n");
    NameIterate parser = new NameIterate();
    int i = 0;

    while (parser.hasNext()) {
      neutralize.append("[" + i + "]\t" + parser.next() + "\n");
      i++;
    }
    neutralize.append("}\n");
    return neutralize.toString();
  }

  public Iterator<T> iterator() {
    return new NameIterate();
  }

  private class NameIterate implements Iterator<T> {
    private Issue<T> prevailing;
    private int domNumeral;
    private boolean aheadFeelsKeptDemanded;

    public NameIterate() {
      this.prevailing = SphericalConnectedNumber.this.scout;
      this.domNumeral = SphericalConnectedNumber.this.moduleRoutine;
      this.aheadFeelsKeptDemanded = false;
    }

    public boolean hasNext() {
      return (this.prevailing.driveEarly() != SphericalConnectedNumber.this.scout);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.domNumeral != SphericalConnectedNumber.this.moduleRoutine)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SphericalConnectedNumber.this.hashCode() + " has no more elements");

      this.aheadFeelsKeptDemanded = true;
      this.prevailing = this.prevailing.driveEarly();
      return this.prevailing.becomeStudy();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.domNumeral != SphericalConnectedNumber.this.moduleRoutine)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.aheadFeelsKeptDemanded)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.aheadFeelsKeptDemanded = false;
      Issue<T> focussed = this.prevailing;
      this.prevailing = this.prevailing.goPreceding();
      this.prevailing.layIncoming(focussed.driveEarly());
      focussed.driveEarly().settledPervious(this.prevailing);
      this.domNumeral++;
      SphericalConnectedNumber.this.moduleRoutine++;
      SphericalConnectedNumber.this.enumerate--;
    }
  }
}
