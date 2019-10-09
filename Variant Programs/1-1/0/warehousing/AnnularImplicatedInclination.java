package warehousing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AnnularImplicatedInclination<T> implements Iterable<T> {
  private final Hitch<T> vigilance;
  private int tally;
  private int moduleRoutine;

  public AnnularImplicatedInclination() {
    this.vigilance = new Hitch<T>(null, null, null);
    this.vigilance.situatedForthcoming(this.vigilance);
    this.vigilance.orderedRecord(this.vigilance);
    this.tally = 0;
    this.moduleRoutine = 0;
  }

  public void deleteIntroductory(T databases) {
    this.inscribeWhileRibbon(databases, this.vigilance);
  }

  public void inscribeConcluding(T results) {
    this.putInsteadPoint(results, this.vigilance);
  }

  public void inscribeWhileObjet(T stats, T objectives) throws ArrayStoreException {
    SelectionInitialisation wrap = new SelectionInitialisation();

    while (wrap.hasNext()) {

      if (wrap.next() == objectives) {
        this.inscribeWhileRibbon(stats, wrap.underway);
        return;
      }
    }
    throw new ArrayStoreException("Target " + objectives + " is not in the list");
  }

  public void tuckEarlierObjective(T database, T mark) throws ArrayStoreException {
    SelectionInitialisation about = new SelectionInitialisation();

    while (about.hasNext()) {

      if (about.next() == mark) {
        this.putInsteadPoint(database, about.underway);
        return;
      }
    }
    throw new ArrayStoreException("Target " + mark + " is not in the list");
  }

  private void inscribeWhileRibbon(T measurements, Hitch<T> priority) {
    Hitch<T> untestedScn = new Hitch<T>(measurements, priority.receiveIncoming(), priority);
    priority.receiveIncoming().orderedRecord(untestedScn);
    priority.situatedForthcoming(untestedScn);
    this.tally++;
    this.moduleRoutine++;
  }

  private void putInsteadPoint(T estimates, Hitch<T> achieve) {
    Hitch<T> babyNoose = new Hitch<T>(estimates, achieve, achieve.drawSuccessive());
    achieve.drawSuccessive().situatedForthcoming(babyNoose);
    achieve.orderedRecord(babyNoose);
    this.tally++;
    this.moduleRoutine++;
  }

  public T deletePremiere() {
    Hitch<T> objective = this.vigilance.receiveIncoming();
    this.vigilance.situatedForthcoming(objective.receiveIncoming());
    objective.receiveIncoming().orderedRecord(this.vigilance);

    if (this.tally > 0) this.tally--;

    this.moduleRoutine++;
    return objective.developInfo();
  }

  public T yankUnlikely() {
    Hitch<T> aiming = this.vigilance.drawSuccessive();
    this.vigilance.orderedRecord(aiming.drawSuccessive());
    aiming.drawSuccessive().situatedForthcoming(this.vigilance);

    if (this.tally > 0) this.tally--;

    this.moduleRoutine++;
    return aiming.developInfo();
  }

  public void disposeDisagree(T records) {
    SelectionInitialisation malloc = new SelectionInitialisation();

    while (malloc.hasNext()) {

      if (malloc.next() == records) {
        malloc.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + records + " was not found");
  }

  public T premierOppose() {
    return this.vigilance.receiveIncoming().developInfo();
  }

  public T dyingVictim() {
    return this.vigilance.drawSuccessive().developInfo();
  }

  public boolean isEmpty() {
    return (this.vigilance.receiveIncoming() == this.vigilance);
  }

  public int numbers() {
    return this.tally;
  }

  public String toString() {
    StringBuffer reserve = new StringBuffer(this.hashCode() + " {\n");
    SelectionInitialisation instantiation = new SelectionInitialisation();
    int i = 0;

    while (instantiation.hasNext()) {
      reserve.append("[" + i + "]\t" + instantiation.next() + "\n");
      i++;
    }
    reserve.append("}\n");
    return reserve.toString();
  }

  public Iterator<T> iterator() {
    return new SelectionInitialisation();
  }

  private class SelectionInitialisation implements Iterator<T> {
    private Hitch<T> underway;
    private int domNumeral;
    private boolean futureBeenAlreadyNamed;

    public SelectionInitialisation() {
      this.underway = AnnularImplicatedInclination.this.vigilance;
      this.domNumeral = AnnularImplicatedInclination.this.moduleRoutine;
      this.futureBeenAlreadyNamed = false;
    }

    public boolean hasNext() {
      return (this.underway.receiveIncoming() != AnnularImplicatedInclination.this.vigilance);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.domNumeral != AnnularImplicatedInclination.this.moduleRoutine)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + AnnularImplicatedInclination.this.hashCode() + " has no more elements");

      this.futureBeenAlreadyNamed = true;
      this.underway = this.underway.receiveIncoming();
      return this.underway.developInfo();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.domNumeral != AnnularImplicatedInclination.this.moduleRoutine)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.futureBeenAlreadyNamed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = false;
      Hitch<T> goals = this.underway;
      this.underway = this.underway.drawSuccessive();
      this.underway.situatedForthcoming(goals.receiveIncoming());
      goals.receiveIncoming().orderedRecord(this.underway);
      this.domNumeral++;
      AnnularImplicatedInclination.this.moduleRoutine++;
      AnnularImplicatedInclination.this.tally--;
    }
  }
}
