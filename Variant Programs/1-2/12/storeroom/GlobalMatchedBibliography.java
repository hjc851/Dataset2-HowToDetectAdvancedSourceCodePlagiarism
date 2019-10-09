package storeroom;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GlobalMatchedBibliography<T> implements Iterable<T> {
  private final Noose<T> keeper;
  private int total;
  private int pentagonIssue;

  public GlobalMatchedBibliography() {
    this.keeper = new Noose<T>(null, null, null);
    this.keeper.primedLater(this.keeper);
    this.keeper.placeSuccessive(this.keeper);
    this.total = 0;
    this.pentagonIssue = 0;
  }

  public void installForemost(T files) {
    this.incloseBeforeNodal(files, this.keeper);
  }

  public void addLatter(T information) {
    this.introduceAheadClient(information, this.keeper);
  }

  public void integrateWithinDisagree(T database, T mark) throws ArrayStoreException {
    DirectoryBool abet = new DirectoryBool();

    while (abet.hasNext()) {

      if (abet.next() == mark) {
        this.incloseBeforeNodal(database, abet.existing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + mark + " is not in the list");
  }

  public void appendDuringElement(T tabulations, T aiming) throws ArrayStoreException {
    DirectoryBool above = new DirectoryBool();

    while (above.hasNext()) {

      if (above.next() == aiming) {
        this.introduceAheadClient(tabulations, above.existing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + aiming + " is not in the list");
  }

  private void incloseBeforeNodal(T numbers, Noose<T> butt) {
    Noose<T> newbornIssue = new Noose<T>(numbers, butt.driveEarly(), butt);
    butt.driveEarly().placeSuccessive(newbornIssue);
    butt.primedLater(newbornIssue);
    this.total++;
    this.pentagonIssue++;
  }

  private void introduceAheadClient(T findings, Noose<T> achieve) {
    Noose<T> modernGuest = new Noose<T>(findings, achieve, achieve.arriveFirst());
    achieve.arriveFirst().primedLater(modernGuest);
    achieve.placeSuccessive(modernGuest);
    this.total++;
    this.pentagonIssue++;
  }

  public T removalOldest() {
    Noose<T> focused = this.keeper.driveEarly();
    this.keeper.primedLater(focused.driveEarly());
    focused.driveEarly().placeSuccessive(this.keeper);

    if (this.total > 0) this.total--;

    this.pentagonIssue++;
    return focused.becomeStudy();
  }

  public T disposeNet() {
    Noose<T> priority = this.keeper.arriveFirst();
    this.keeper.placeSuccessive(priority.arriveFirst());
    priority.arriveFirst().primedLater(this.keeper);

    if (this.total > 0) this.total--;

    this.pentagonIssue++;
    return priority.becomeStudy();
  }

  public void yankTotem(T databases) {
    DirectoryBool battologize = new DirectoryBool();

    while (battologize.hasNext()) {

      if (battologize.next() == databases) {
        battologize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + databases + " was not found");
  }

  public T freshmanDemur() {
    return this.keeper.driveEarly().becomeStudy();
  }

  public T conclusionItems() {
    return this.keeper.arriveFirst().becomeStudy();
  }

  public boolean isEmpty() {
    return (this.keeper.driveEarly() == this.keeper);
  }

  public int recount() {
    return this.total;
  }

  public String toString() {
    StringBuffer mitigate = new StringBuffer(this.hashCode() + " {\n");
    DirectoryBool initialisation = new DirectoryBool();
    int i = 0;

    while (initialisation.hasNext()) {
      mitigate.append("[" + i + "]\t" + initialisation.next() + "\n");
      i++;
    }
    mitigate.append("}\n");
    return mitigate.toString();
  }

  public Iterator<T> iterator() {
    return new DirectoryBool();
  }

  private class DirectoryBool implements Iterator<T> {
    private Noose<T> existing;
    private int defencePercentage;
    private boolean comingDeservesFallenUrged;

    public DirectoryBool() {
      this.existing = GlobalMatchedBibliography.this.keeper;
      this.defencePercentage = GlobalMatchedBibliography.this.pentagonIssue;
      this.comingDeservesFallenUrged = false;
    }

    public boolean hasNext() {
      return (this.existing.driveEarly() != GlobalMatchedBibliography.this.keeper);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.defencePercentage != GlobalMatchedBibliography.this.pentagonIssue)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + GlobalMatchedBibliography.this.hashCode() + " has no more elements");

      this.comingDeservesFallenUrged = true;
      this.existing = this.existing.driveEarly();
      return this.existing.becomeStudy();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.defencePercentage != GlobalMatchedBibliography.this.pentagonIssue)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comingDeservesFallenUrged)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comingDeservesFallenUrged = false;
      Noose<T> pinpoint = this.existing;
      this.existing = this.existing.arriveFirst();
      this.existing.primedLater(pinpoint.driveEarly());
      pinpoint.driveEarly().placeSuccessive(this.existing);
      this.defencePercentage++;
      GlobalMatchedBibliography.this.pentagonIssue++;
      GlobalMatchedBibliography.this.total--;
    }
  }
}
