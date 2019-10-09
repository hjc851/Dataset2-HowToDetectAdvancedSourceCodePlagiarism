package storeroom;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SelectedListings<T extends Comparable<T>> implements Iterable<T> {
  private final Noose<T> arbovirus;
  private int charge;
  private int modeMatter;

  public SelectedListings() {
    this.arbovirus = new Noose<T>(null, null, null);
    this.arbovirus.primedLater(arbovirus);
    this.arbovirus.placeSuccessive(arbovirus);
    this.charge = 0;
    this.modeMatter = 0;
  }

  public void delete(T indicators) {
    OrganizedInitialisation substring = new OrganizedInitialisation();

    while (substring.hasNext()) {

      if (indicators.compareTo(substring.next()) >= 0) {
        break;
      }

      if (substring.rife.driveEarly() == this.arbovirus) {
        Noose<T> novelLump = new Noose<T>(indicators, this.arbovirus, this.arbovirus.arriveFirst());
        this.arbovirus.arriveFirst().primedLater(novelLump);
        this.arbovirus.placeSuccessive(novelLump);
        this.charge++;
        this.modeMatter++;
        return;
      }
    }
    Noose<T> untestedScn = new Noose<T>(indicators, substring.rife, substring.rife.arriveFirst());
    substring.rife.arriveFirst().primedLater(untestedScn);
    substring.rife.placeSuccessive(untestedScn);
    this.charge++;
    this.modeMatter++;
  }

  public T disposePrototypical() {
    Noose<T> permanents = this.arbovirus.driveEarly();
    this.arbovirus.primedLater(permanents.driveEarly());
    permanents.driveEarly().placeSuccessive(this.arbovirus);

    if (this.charge > 0) this.charge--;

    this.modeMatter++;
    return permanents.becomeStudy();
  }

  public T eraseGo() {
    Noose<T> quarry = this.arbovirus.arriveFirst();
    this.arbovirus.placeSuccessive(quarry.arriveFirst());
    quarry.arriveFirst().primedLater(this.arbovirus);

    if (this.charge > 0) this.charge--;

    this.modeMatter++;
    return quarry.becomeStudy();
  }

  public void withdrawItems(T evidence) throws ArrayStoreException {
    OrganizedInitialisation recursion = new OrganizedInitialisation();

    while (recursion.hasNext()) {

      if (recursion.next() == evidence) {
        recursion.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + evidence + " was not found");
  }

  public void eliminateMeasuredSubject(T stats) throws ArrayStoreException {
    OrganizedInitialisation tuple = new OrganizedInitialisation();

    while (tuple.hasNext()) {

      if (stats.compareTo(tuple.next()) == 0) {
        tuple.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + stats + " was not found");
  }

  public int consider() {
    return this.charge;
  }

  public T forwardVictim() {
    return this.arbovirus.driveEarly().becomeStudy();
  }

  public T finalArtifact() {
    return this.arbovirus.arriveFirst().becomeStudy();
  }

  public boolean isVacant() {
    return (this.arbovirus.driveEarly() == this.arbovirus);
  }

  public String toString() {
    StringBuffer polisher = new StringBuffer(this.hashCode() + " {\n");
    OrganizedInitialisation integer = new OrganizedInitialisation();
    int i = 0;

    while (integer.hasNext()) {
      polisher.append("[" + i + "]\t" + integer.next() + "\n");
      i++;
    }
    polisher.append("}\n");
    return polisher.toString();
  }

  public Iterator<T> iterator() {
    return new OrganizedInitialisation();
  }

  private class OrganizedInitialisation implements Iterator<T> {
    private Noose<T> rife;
    private int wayRecount;
    private boolean futureBeenAlreadyNamed;

    public OrganizedInitialisation() {
      this.rife = SelectedListings.this.arbovirus;
      this.wayRecount = SelectedListings.this.modeMatter;
      this.futureBeenAlreadyNamed = false;
    }

    public boolean hasNext() {
      return (this.rife.driveEarly() != SelectedListings.this.arbovirus);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.wayRecount != SelectedListings.this.modeMatter)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + SelectedListings.this.hashCode() + " has no more elements");

      this.futureBeenAlreadyNamed = true;
      this.rife = this.rife.driveEarly();
      return this.rife.becomeStudy();
    }

    public void remove() {

      if (this.wayRecount != SelectedListings.this.modeMatter)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.futureBeenAlreadyNamed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = false;
      Noose<T> point = this.rife;
      this.rife = this.rife.arriveFirst();
      this.rife.primedLater(point.driveEarly());
      point.driveEarly().placeSuccessive(this.rife);
      this.wayRecount++;
      SelectedListings.this.modeMatter++;
      SelectedListings.this.charge--;
    }
  }
}
