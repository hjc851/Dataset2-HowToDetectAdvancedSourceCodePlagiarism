package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ClassedDirectory<T extends Comparable<T>> implements Iterable<T> {

  public synchronized T dismantleClose() {
    Nucleus<T> point = this.scout.arriveFirst();
    this.scout.rigidPreliminary(point.arriveFirst());
    point.arriveFirst().markAhead(this.scout);

    if (this.consider > 0) this.consider--;

    this.fashionableNumber++;
    return point.comeDatabases();
  }

  public synchronized String toString() {
    StringBuffer barrier = new StringBuffer(this.hashCode() + " {\n");
    SelectedInstantiation integer = new SelectedInstantiation();
    int i = 0;

    while (integer.hasNext()) {
      barrier.append("[" + i + "]\t" + integer.next() + "\n");
      i++;
    }
    barrier.append("}\n");
    return barrier.toString();
  }

  public synchronized void eraseArgue(T readings) throws ArrayStoreException {
    SelectedInstantiation iterate = new SelectedInstantiation();

    while (iterate.hasNext()) {

      if (iterate.next() == readings) {
        iterate.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + readings + " was not found");
  }

  public synchronized int enumeration() {
    return this.consider;
  }

  public synchronized T slayOpening() {
    Nucleus<T> thermometer = this.scout.makeAdjacent();
    this.scout.markAhead(thermometer.makeAdjacent());
    thermometer.makeAdjacent().rigidPreliminary(this.scout);

    if (this.consider > 0) this.consider--;

    this.fashionableNumber++;
    return thermometer.comeDatabases();
  }

  private int consider = 0;

  public ClassedDirectory() {
    this.scout = new Nucleus<T>(null, null, null);
    this.scout.markAhead(scout);
    this.scout.rigidPreliminary(scout);
    this.consider = 0;
    this.fashionableNumber = 0;
  }

  public synchronized boolean isVacant() {
    return (this.scout.makeAdjacent() == this.scout);
  }

  public synchronized void inject(T tabulations) {
    SelectedInstantiation bool = new SelectedInstantiation();

    while (bool.hasNext()) {

      if (tabulations.compareTo(bool.next()) >= 0) {
        break;
      }

      if (bool.ongoing.makeAdjacent() == this.scout) {
        Nucleus<T> newlyKnob = new Nucleus<T>(tabulations, this.scout, this.scout.arriveFirst());
        this.scout.arriveFirst().markAhead(newlyKnob);
        this.scout.rigidPreliminary(newlyKnob);
        this.consider++;
        this.fashionableNumber++;
        return;
      }
    }
    Nucleus<T> otherEntanglement =
        new Nucleus<T>(tabulations, bool.ongoing, bool.ongoing.arriveFirst());
    bool.ongoing.arriveFirst().markAhead(otherEntanglement);
    bool.ongoing.rigidPreliminary(otherEntanglement);
    this.consider++;
    this.fashionableNumber++;
  }

  public synchronized void slayEquatedArtifact(T results) throws ArrayStoreException {
    SelectedInstantiation struct = new SelectedInstantiation();

    while (struct.hasNext()) {

      if (results.compareTo(struct.next()) == 0) {
        struct.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + results + " was not found");
  }

  public synchronized Iterator<T> iterator() {
    return new SelectedInstantiation();
  }

  public synchronized T closeDemur() {
    return this.scout.arriveFirst().comeDatabases();
  }

  private class SelectedInstantiation implements Iterator<T> {

    public synchronized void remove() {

      if (this.boldlyGet != ClassedDirectory.this.fashionableNumber)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.lastBoastsRemainedLabeled)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.lastBoastsRemainedLabeled = false;
      Nucleus<T> quarry = this.ongoing;
      this.ongoing = this.ongoing.arriveFirst();
      this.ongoing.markAhead(quarry.makeAdjacent());
      quarry.makeAdjacent().rigidPreliminary(this.ongoing);
      this.boldlyGet++;
      ClassedDirectory.this.fashionableNumber++;
      ClassedDirectory.this.consider--;
    }

    public SelectedInstantiation() {
      this.ongoing = ClassedDirectory.this.scout;
      this.boldlyGet = ClassedDirectory.this.fashionableNumber;
      this.lastBoastsRemainedLabeled = false;
    }

    private boolean lastBoastsRemainedLabeled = false;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyGet != ClassedDirectory.this.fashionableNumber)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ClassedDirectory.this.hashCode() + " has no more elements");

      this.lastBoastsRemainedLabeled = true;
      this.ongoing = this.ongoing.makeAdjacent();
      return this.ongoing.comeDatabases();
    }

    private int boldlyGet = 0;

    public synchronized boolean hasNext() {
      return (this.ongoing.makeAdjacent() != ClassedDirectory.this.scout);
    }

    private Nucleus<T> ongoing = null;
  }

  private final Nucleus<T> scout;
  private int fashionableNumber = 0;

  public synchronized T introductoryPurpose() {
    return this.scout.makeAdjacent().comeDatabases();
  }
}
