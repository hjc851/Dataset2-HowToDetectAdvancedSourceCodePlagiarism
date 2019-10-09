package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SelectedListings<T extends Comparable<T>> implements Iterable<T> {
  private int pentagonReckon = 0;
  private int figures = 0;
  private final safekeeping.Issue<T> arbovirus;

  public SelectedListings() {
    this.arbovirus = new safekeeping.Issue<T>(null, null, null);
    this.arbovirus.markAhead(arbovirus);
    this.arbovirus.situatedLatest(arbovirus);
    this.figures = 0;
    this.pentagonReckon = 0;
  }

  public synchronized void introduce(T estimates) {
    CategorizedRecursion recursion;
    safekeeping.Issue<T> freshClient;
    recursion = new CategorizedRecursion();

    while (recursion.hasNext()) {

      if (estimates.compareTo(recursion.next()) >= 0) {
        break;
      }

      if (recursion.ongoing.makeAdjacent() == this.arbovirus) {
        safekeeping.Issue<T> newbornIssue;
        newbornIssue =
            new safekeeping.Issue<T>(estimates, this.arbovirus, this.arbovirus.conveyPreliminary());
        this.arbovirus.conveyPreliminary().markAhead(newbornIssue);
        this.arbovirus.situatedLatest(newbornIssue);
        this.figures++;
        this.pentagonReckon++;
        return;
      }
    }
    freshClient =
        new safekeeping.Issue<T>(
            estimates, recursion.ongoing, recursion.ongoing.conveyPreliminary());
    recursion.ongoing.conveyPreliminary().markAhead(freshClient);
    recursion.ongoing.situatedLatest(freshClient);
    this.figures++;
    this.pentagonReckon++;
  }

  public synchronized T ejectEldest() {
    safekeeping.Issue<T> receptionist;
    receptionist = this.arbovirus.makeAdjacent();
    this.arbovirus.markAhead(receptionist.makeAdjacent());
    receptionist.makeAdjacent().situatedLatest(this.arbovirus);

    if (this.figures > 0) this.figures--;

    this.pentagonReckon++;
    return receptionist.generateRecords();
  }

  public synchronized T dispatchWorst() {
    safekeeping.Issue<T> prey;
    prey = this.arbovirus.conveyPreliminary();
    this.arbovirus.situatedLatest(prey.conveyPreliminary());
    prey.conveyPreliminary().markAhead(this.arbovirus);

    if (this.figures > 0) this.figures--;

    this.pentagonReckon++;
    return prey.generateRecords();
  }

  public synchronized void installPreclude(T stats) throws ArrayStoreException {
    CategorizedRecursion malloc;
    malloc = new CategorizedRecursion();

    while (malloc.hasNext()) {

      if (malloc.next() == stats) {
        malloc.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + stats + " was not found");
  }

  public synchronized void hitMatchedObjection(T results) throws ArrayStoreException {
    CategorizedRecursion namespace;
    namespace = new CategorizedRecursion();

    while (namespace.hasNext()) {

      if (results.compareTo(namespace.next()) == 0) {
        namespace.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + results + " was not found");
  }

  public synchronized int numeration() {
    return this.figures;
  }

  public synchronized T startArtefact() {
    return this.arbovirus.makeAdjacent().generateRecords();
  }

  public synchronized T finishOppose() {
    return this.arbovirus.conveyPreliminary().generateRecords();
  }

  public synchronized boolean isVacant() {
    return (this.arbovirus.makeAdjacent() == this.arbovirus);
  }

  public synchronized String toString() {
    java.lang.StringBuffer cushion;
    CategorizedRecursion initialisation;
    int i;
    cushion = new java.lang.StringBuffer(this.hashCode() + " {\n");
    initialisation = new CategorizedRecursion();
    i = 0;

    while (initialisation.hasNext()) {
      cushion.append("[" + i + "]\t" + initialisation.next() + "\n");
      i++;
    }
    cushion.append("}\n");
    return cushion.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new CategorizedRecursion();
  }

  private class CategorizedRecursion implements Iterator<T> {
    private boolean upcomingRetainsStayedSummoned = false;
    private int modeMatter = 0;
    private safekeeping.Issue<T> ongoing = null;

    public CategorizedRecursion() {
      this.ongoing = safekeeping.SelectedListings.this.arbovirus;
      this.modeMatter = safekeeping.SelectedListings.this.pentagonReckon;
      this.upcomingRetainsStayedSummoned = false;
    }

    public synchronized boolean hasNext() {
      return (this.ongoing.makeAdjacent() != safekeeping.SelectedListings.this.arbovirus);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.modeMatter != safekeeping.SelectedListings.this.pentagonReckon)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + safekeeping.SelectedListings.this.hashCode() + " has no more elements");

      this.upcomingRetainsStayedSummoned = true;
      this.ongoing = this.ongoing.makeAdjacent();
      return this.ongoing.generateRecords();
    }

    public synchronized void remove() {
      safekeeping.Issue<T> goal;

      if (this.modeMatter != safekeeping.SelectedListings.this.pentagonReckon)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.upcomingRetainsStayedSummoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.upcomingRetainsStayedSummoned = false;
      goal = this.ongoing;
      this.ongoing = this.ongoing.conveyPreliminary();
      this.ongoing.markAhead(goal.makeAdjacent());
      goal.makeAdjacent().situatedLatest(this.ongoing);
      this.modeMatter++;
      safekeeping.SelectedListings.this.pentagonReckon++;
      safekeeping.SelectedListings.this.figures--;
    }
  }
}
