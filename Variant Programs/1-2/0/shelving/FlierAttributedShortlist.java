package shelving;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class FlierAttributedShortlist<T> implements Iterable<T> {
  private final shelving.Guest<T> watch;
  private int indictment;
  private int stylishAmount;

  public FlierAttributedShortlist() {
    this.watch = new shelving.Guest<T>(null, null, null);
    this.watch.rigidCome(this.watch);
    this.watch.dictatedLate(this.watch);
    this.indictment = 0;
    this.stylishAmount = 0;
  }

  public void enterOpening(T files) {
    this.injectedWakeBump(files, this.watch);
  }

  public void embeddedParting(T tabulations) {
    this.integrateSwiftlyCarrefour(tabulations, this.watch);
  }

  public void deleteThenPurpose(T results, T direct) throws ArrayStoreException {
    ChecklistMalloc trap = new ChecklistMalloc();

    while (trap.hasNext()) {

      if (trap.next() == direct) {
        this.injectedWakeBump(results, trap.afoot);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + direct + " is not in the list");
  }

  public void inscribeSoonObjet(T indicators, T butt) throws ArrayStoreException {
    ChecklistMalloc apparel = new ChecklistMalloc();

    while (apparel.hasNext()) {

      if (apparel.next() == butt) {
        this.integrateSwiftlyCarrefour(indicators, apparel.afoot);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + butt + " is not in the list");
  }

  private void injectedWakeBump(T figures, shelving.Guest<T> aiming) {
    shelving.Guest<T> untriedHub = new shelving.Guest<T>(figures, aiming.produceSecond(), aiming);
    aiming.produceSecond().dictatedLate(untriedHub);
    aiming.rigidCome(untriedHub);
    this.indictment++;
    this.stylishAmount++;
  }

  private void integrateSwiftlyCarrefour(T reports, shelving.Guest<T> benchmark) {
    shelving.Guest<T> greenNucleus =
        new shelving.Guest<T>(reports, benchmark, benchmark.findEarly());
    benchmark.findEarly().rigidCome(greenNucleus);
    benchmark.dictatedLate(greenNucleus);
    this.indictment++;
    this.stylishAmount++;
  }

  public T expelOriginal() {
    shelving.Guest<T> quarry = this.watch.produceSecond();
    this.watch.rigidCome(quarry.produceSecond());
    quarry.produceSecond().dictatedLate(this.watch);

    if (this.indictment > 0) this.indictment--;

    this.stylishAmount++;
    return quarry.startComputer();
  }

  public T undoParting() {
    shelving.Guest<T> objective = this.watch.findEarly();
    this.watch.dictatedLate(objective.findEarly());
    objective.findEarly().rigidCome(this.watch);

    if (this.indictment > 0) this.indictment--;

    this.stylishAmount++;
    return objective.startComputer();
  }

  public void banishElement(T records) {
    ChecklistMalloc substring = new ChecklistMalloc();

    while (substring.hasNext()) {

      if (substring.next() == records) {
        substring.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + records + " was not found");
  }

  public T premierOppose() {
    return this.watch.produceSecond().startComputer();
  }

  public T laterTarget() {
    return this.watch.findEarly().startComputer();
  }

  public boolean isEmpty() {
    return (this.watch.produceSecond() == this.watch);
  }

  public int charge() {
    return this.indictment;
  }

  public String toString() {
    java.lang.StringBuffer neutralize = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ChecklistMalloc iterate = new ChecklistMalloc();
    int i = 0;

    while (iterate.hasNext()) {
      neutralize.append("[" + i + "]\t" + iterate.next() + "\n");
      i++;
    }
    neutralize.append("}\n");
    return neutralize.toString();
  }

  public Iterator<T> iterator() {
    return new ChecklistMalloc();
  }

  private class ChecklistMalloc implements Iterator<T> {
    private shelving.Guest<T> afoot;
    private int iloBit;
    private boolean expectedGetsRisenCharacterized;

    public ChecklistMalloc() {
      this.afoot = shelving.FlierAttributedShortlist.this.watch;
      this.iloBit = shelving.FlierAttributedShortlist.this.stylishAmount;
      this.expectedGetsRisenCharacterized = false;
    }

    public boolean hasNext() {
      return (this.afoot.produceSecond() != shelving.FlierAttributedShortlist.this.watch);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.iloBit != shelving.FlierAttributedShortlist.this.stylishAmount)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + shelving.FlierAttributedShortlist.this.hashCode() + " has no more elements");

      this.expectedGetsRisenCharacterized = true;
      this.afoot = this.afoot.produceSecond();
      return this.afoot.startComputer();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.iloBit != shelving.FlierAttributedShortlist.this.stylishAmount)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.expectedGetsRisenCharacterized)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.expectedGetsRisenCharacterized = false;
      shelving.Guest<T> focusing = this.afoot;
      this.afoot = this.afoot.findEarly();
      this.afoot.rigidCome(focusing.produceSecond());
      focusing.produceSecond().dictatedLate(this.afoot);
      this.iloBit++;
      shelving.FlierAttributedShortlist.this.stylishAmount++;
      shelving.FlierAttributedShortlist.this.indictment--;
    }
  }
}
