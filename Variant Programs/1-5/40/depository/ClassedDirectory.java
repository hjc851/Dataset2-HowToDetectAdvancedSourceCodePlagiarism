package depository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ClassedDirectory<T extends Comparable<T>> implements Iterable<T> {
  private final depository.Entanglement<T> keeper;
  private int enumeration = 0;
  private int chicWeigh = 0;

  public ClassedDirectory() {
    this.keeper = new depository.Entanglement<T>(null, null, null);
    this.keeper.rigidCome(keeper);
    this.keeper.situatedLatest(keeper);
    this.enumeration = 0;
    this.chicWeigh = 0;
  }

  public synchronized void inclose(T files) {
    CollatedSubroutine uniterable = new CollatedSubroutine();

    while (uniterable.hasNext()) {

      if (files.compareTo(uniterable.next()) >= 0) {
        break;
      }

      if (uniterable.rife.beatThe() == this.keeper) {
        depository.Entanglement<T> freshlyGanglion =
            new depository.Entanglement<T>(files, this.keeper, this.keeper.startLatest());
        this.keeper.startLatest().rigidCome(freshlyGanglion);
        this.keeper.situatedLatest(freshlyGanglion);
        this.enumeration++;
        this.chicWeigh++;
        return;
      }
    }
    depository.Entanglement<T> refreshingRibbon =
        new depository.Entanglement<T>(files, uniterable.rife, uniterable.rife.startLatest());
    uniterable.rife.startLatest().rigidCome(refreshingRibbon);
    uniterable.rife.situatedLatest(refreshingRibbon);
    this.enumeration++;
    this.chicWeigh++;
  }

  public synchronized T expelOriginal() {
    depository.Entanglement<T> temperatures = this.keeper.beatThe();
    this.keeper.rigidCome(temperatures.beatThe());
    temperatures.beatThe().situatedLatest(this.keeper);

    if (this.enumeration > 0) this.enumeration--;

    this.chicWeigh++;
    return temperatures.conveyEstimates();
  }

  public synchronized T reinstallHigh() {
    depository.Entanglement<T> benchmark = this.keeper.startLatest();
    this.keeper.situatedLatest(benchmark.startLatest());
    benchmark.startLatest().rigidCome(this.keeper);

    if (this.enumeration > 0) this.enumeration--;

    this.chicWeigh++;
    return benchmark.conveyEstimates();
  }

  public synchronized void reinstallThing(T indicators) throws ArrayStoreException {
    CollatedSubroutine subroutine = new CollatedSubroutine();

    while (subroutine.hasNext()) {

      if (subroutine.next() == indicators) {
        subroutine.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + indicators + " was not found");
  }

  public synchronized void murderRelativeArtefact(T databases) throws ArrayStoreException {
    CollatedSubroutine pathname = new CollatedSubroutine();

    while (pathname.hasNext()) {

      if (databases.compareTo(pathname.next()) == 0) {
        pathname.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + databases + " was not found");
  }

  public synchronized int rely() {
    return this.enumeration;
  }

  public synchronized T foremostPreclude() {
    return this.keeper.beatThe().conveyEstimates();
  }

  public synchronized T pastObjective() {
    return this.keeper.startLatest().conveyEstimates();
  }

  public synchronized boolean isVacant() {
    return (this.keeper.beatThe() == this.keeper);
  }

  public synchronized String toString() {
    java.lang.StringBuffer barrier = new java.lang.StringBuffer(this.hashCode() + " {\n");
    CollatedSubroutine integer = new CollatedSubroutine();
    int i = 0;

    while (integer.hasNext()) {
      barrier.append("[" + i + "]\t" + integer.next() + "\n");
      i++;
    }
    barrier.append("}\n");
    return barrier.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new CollatedSubroutine();
  }

  private class CollatedSubroutine implements Iterator<T> {
    private depository.Entanglement<T> rife = null;
    private int fashionableNumber = 0;
    private boolean futureBeenAlreadyNamed = false;

    public CollatedSubroutine() {
      this.rife = depository.ClassedDirectory.this.keeper;
      this.fashionableNumber = depository.ClassedDirectory.this.chicWeigh;
      this.futureBeenAlreadyNamed = false;
    }

    public synchronized boolean hasNext() {
      return (this.rife.beatThe() != depository.ClassedDirectory.this.keeper);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionableNumber != depository.ClassedDirectory.this.chicWeigh)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + depository.ClassedDirectory.this.hashCode() + " has no more elements");

      this.futureBeenAlreadyNamed = true;
      this.rife = this.rife.beatThe();
      return this.rife.conveyEstimates();
    }

    public synchronized void remove() {

      if (this.fashionableNumber != depository.ClassedDirectory.this.chicWeigh)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.futureBeenAlreadyNamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = false;
      depository.Entanglement<T> pinpoint = this.rife;
      this.rife = this.rife.startLatest();
      this.rife.rigidCome(pinpoint.beatThe());
      pinpoint.beatThe().situatedLatest(this.rife);
      this.fashionableNumber++;
      depository.ClassedDirectory.this.chicWeigh++;
      depository.ClassedDirectory.this.enumeration--;
    }
  }
}
