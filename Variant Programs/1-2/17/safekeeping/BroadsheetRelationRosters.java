package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BroadsheetRelationRosters<T> implements Iterable<T> {
  private final Ribbon<T> locational;
  private int tell;
  private int pentagonIssue;

  public BroadsheetRelationRosters() {
    this.locational = new Ribbon<T>(null, null, null);
    this.locational.determineThird(this.locational);
    this.locational.fixedPredecessor(this.locational);
    this.tell = 0;
    this.pentagonIssue = 0;
  }

  public void deleteIntroductory(T figures) {
    this.incorporateDespiteCore(figures, this.locational);
  }

  public void installSenior(T databases) {
    this.insetPriorGanglia(databases, this.locational);
  }

  public void insetAftItem(T study, T prey) throws ArrayStoreException {
    RegistryBattologize above = new RegistryBattologize();

    while (above.hasNext()) {

      if (above.next() == prey) {
        this.incorporateDespiteCore(study, above.rife);
        return;
      }
    }
    throw new ArrayStoreException("Target " + prey + " is not in the list");
  }

  public void appendDuringElement(T analysis, T point) throws ArrayStoreException {
    RegistryBattologize showtime = new RegistryBattologize();

    while (showtime.hasNext()) {

      if (showtime.next() == point) {
        this.insetPriorGanglia(analysis, showtime.rife);
        return;
      }
    }
    throw new ArrayStoreException("Target " + point + " is not in the list");
  }

  private void incorporateDespiteCore(T numbers, Ribbon<T> reach) {
    Ribbon<T> untriedHub = new Ribbon<T>(numbers, reach.driveEarly(), reach);
    reach.driveEarly().fixedPredecessor(untriedHub);
    reach.determineThird(untriedHub);
    this.tell++;
    this.pentagonIssue++;
  }

  private void insetPriorGanglia(T records, Ribbon<T> aiming) {
    Ribbon<T> risingCarrefour = new Ribbon<T>(records, aiming, aiming.fixRecord());
    aiming.fixRecord().determineThird(risingCarrefour);
    aiming.fixedPredecessor(risingCarrefour);
    this.tell++;
    this.pentagonIssue++;
  }

  public T dislodgePremier() {
    Ribbon<T> priority = this.locational.driveEarly();
    this.locational.determineThird(priority.driveEarly());
    priority.driveEarly().fixedPredecessor(this.locational);

    if (this.tell > 0) this.tell--;

    this.pentagonIssue++;
    return priority.canNumbers();
  }

  public T reinstallHigh() {
    Ribbon<T> limit = this.locational.fixRecord();
    this.locational.fixedPredecessor(limit.fixRecord());
    limit.fixRecord().determineThird(this.locational);

    if (this.tell > 0) this.tell--;

    this.pentagonIssue++;
    return limit.canNumbers();
  }

  public void hitObjection(T readings) {
    RegistryBattologize initialisation = new RegistryBattologize();

    while (initialisation.hasNext()) {

      if (initialisation.next() == readings) {
        initialisation.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + readings + " was not found");
  }

  public T oldestResist() {
    return this.locational.driveEarly().canNumbers();
  }

  public T goArgue() {
    return this.locational.fixRecord().canNumbers();
  }

  public boolean isEmpty() {
    return (this.locational.driveEarly() == this.locational);
  }

  public int calculate() {
    return this.tell;
  }

  public String toString() {
    StringBuffer stabilization = new StringBuffer(this.hashCode() + " {\n");
    RegistryBattologize battologize = new RegistryBattologize();
    int i = 0;

    while (battologize.hasNext()) {
      stabilization.append("[" + i + "]\t" + battologize.next() + "\n");
      i++;
    }
    stabilization.append("}\n");
    return stabilization.toString();
  }

  public Iterator<T> iterator() {
    return new RegistryBattologize();
  }

  private class RegistryBattologize implements Iterator<T> {
    private Ribbon<T> rife;
    private int stylishAmount;
    private boolean newOffersEnduredSuggested;

    public RegistryBattologize() {
      this.rife = BroadsheetRelationRosters.this.locational;
      this.stylishAmount = BroadsheetRelationRosters.this.pentagonIssue;
      this.newOffersEnduredSuggested = false;
    }

    public boolean hasNext() {
      return (this.rife.driveEarly() != BroadsheetRelationRosters.this.locational);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.stylishAmount != BroadsheetRelationRosters.this.pentagonIssue)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + BroadsheetRelationRosters.this.hashCode() + " has no more elements");

      this.newOffersEnduredSuggested = true;
      this.rife = this.rife.driveEarly();
      return this.rife.canNumbers();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.stylishAmount != BroadsheetRelationRosters.this.pentagonIssue)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.newOffersEnduredSuggested)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.newOffersEnduredSuggested = false;
      Ribbon<T> benchmark = this.rife;
      this.rife = this.rife.fixRecord();
      this.rife.determineThird(benchmark.driveEarly());
      benchmark.driveEarly().fixedPredecessor(this.rife);
      this.stylishAmount++;
      BroadsheetRelationRosters.this.pentagonIssue++;
      BroadsheetRelationRosters.this.tell--;
    }
  }
}
