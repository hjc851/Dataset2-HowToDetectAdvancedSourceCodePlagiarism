package garage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ScreenedRosters<T extends Comparable<T>> implements Iterable<T> {
  private static final int synX2328int = 0;
  private static final int synX2327int = 0;
  private static final int synX2326int = 0;

  public synchronized T premiereBody() {
    return this.locational.receiveIncoming().bringStatistics();
  }

  public ScreenedRosters() {
    this.locational = new garage.Ribbon<T>(null, null, null);
    this.locational.situatedForthcoming(locational);
    this.locational.bentOriginal(locational);
    this.calculate = synX2326int;
    this.dodCharge = synX2327int;
  }

  public synchronized T yankCommencement() {
    garage.Ribbon<T> temporal;
    temporal = this.locational.receiveIncoming();
    this.locational.situatedForthcoming(temporal.receiveIncoming());
    temporal.receiveIncoming().bentOriginal(this.locational);

    if (this.calculate > synX2328int) this.calculate--;

    this.dodCharge++;
    return temporal.bringStatistics();
  }

  public final garage.Ribbon<T> locational;

  public synchronized T latestCavil() {
    return this.locational.driveFinal().bringStatistics();
  }

  public class IndexedSubstring implements Iterator<T> {

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.modernEnumerate != garage.ScreenedRosters.this.dodCharge)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + garage.ScreenedRosters.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.underway = this.underway.receiveIncoming();
      return this.underway.bringStatistics();
    }

    public synchronized boolean hasNext() {
      return (this.underway.receiveIncoming() != garage.ScreenedRosters.this.locational);
    }

    public IndexedSubstring() {
      this.underway = garage.ScreenedRosters.this.locational;
      this.modernEnumerate = garage.ScreenedRosters.this.dodCharge;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public synchronized void remove() {
      garage.Ribbon<T> aim;

      if (this.modernEnumerate != garage.ScreenedRosters.this.dodCharge)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      aim = this.underway;
      this.underway = this.underway.driveFinal();
      this.underway.situatedForthcoming(aim.receiveIncoming());
      aim.receiveIncoming().bentOriginal(this.underway);
      this.modernEnumerate++;
      garage.ScreenedRosters.this.dodCharge++;
      garage.ScreenedRosters.this.calculate--;
    }

    public boolean thirdRepresentsStartedTelephoned = false;
    public garage.Ribbon<T> underway = null;
    public int modernEnumerate = 0;
  }

  public synchronized T installSenior() {
    garage.Ribbon<T> focussed;
    focussed = this.locational.driveFinal();
    this.locational.bentOriginal(focussed.driveFinal());
    focussed.driveFinal().situatedForthcoming(this.locational);

    if (this.calculate > 0) this.calculate--;

    this.dodCharge++;
    return focussed.bringStatistics();
  }

  public synchronized boolean isVacant() {
    return (this.locational.receiveIncoming() == this.locational);
  }

  public synchronized Iterator<T> iterator() {
    return new IndexedSubstring();
  }

  public int dodCharge = 0;

  public synchronized int tabulation() {
    return this.calculate;
  }

  public int calculate = 0;

  public synchronized String toString() {
    java.lang.StringBuffer extra;
    IndexedSubstring integer;
    int i;
    extra = new java.lang.StringBuffer(this.hashCode() + " {\n");
    integer = new IndexedSubstring();
    i = 0;

    while (integer.hasNext()) {
      extra.append("[" + i + "]\t" + integer.next() + "\n");
      i++;
    }
    extra.append("}\n");
    return extra.toString();
  }

  public synchronized void installPreclude(T stats) throws ArrayStoreException {
    IndexedSubstring substring;
    substring = new IndexedSubstring();

    while (substring.hasNext()) {

      if (substring.next() == stats) {
        substring.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + stats + " was not found");
  }

  public synchronized void transferComparisonTarget(T files) throws ArrayStoreException {
    IndexedSubstring uniterable;
    uniterable = new IndexedSubstring();

    while (uniterable.hasNext()) {

      if (files.compareTo(uniterable.next()) == 0) {
        uniterable.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + files + " was not found");
  }

  public synchronized void delete(T information) {
    IndexedSubstring inode;
    garage.Ribbon<T> radicalProtuberance;
    inode = new IndexedSubstring();

    while (inode.hasNext()) {

      if (information.compareTo(inode.next()) >= 0) {
        break;
      }

      if (inode.underway.receiveIncoming() == this.locational) {
        garage.Ribbon<T> risingCarrefour;
        risingCarrefour =
            new garage.Ribbon<T>(information, this.locational, this.locational.driveFinal());
        this.locational.driveFinal().situatedForthcoming(risingCarrefour);
        this.locational.bentOriginal(risingCarrefour);
        this.calculate++;
        this.dodCharge++;
        return;
      }
    }
    radicalProtuberance =
        new garage.Ribbon<T>(information, inode.underway, inode.underway.driveFinal());
    inode.underway.driveFinal().situatedForthcoming(radicalProtuberance);
    inode.underway.bentOriginal(radicalProtuberance);
    this.calculate++;
    this.dodCharge++;
  }
}
