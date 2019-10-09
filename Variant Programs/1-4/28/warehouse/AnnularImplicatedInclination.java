package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AnnularImplicatedInclination<T> implements Iterable<T> {

  private synchronized void incloseUntilNodal(T tabulations, Ganglia<T> benchmark) {
    Ganglia<T> newlyKnob = new Ganglia<T>(tabulations, benchmark, benchmark.catchLast());
    benchmark.catchLast().placedUpcoming(newlyKnob);
    benchmark.rigidPreliminary(newlyKnob);
    this.numeration++;
    this.fashionTurn++;
  }

  public synchronized void encloseLate(T computer) {
    this.incloseUntilNodal(computer, this.ceremonial);
  }

  public synchronized void appendAmidElement(T stats, T focussed) throws ArrayStoreException {
    PlaylistParser ace = new PlaylistParser();

    while (ace.hasNext()) {

      if (ace.next() == focussed) {
        this.inscribingOverProblem(stats, ace.flow);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focussed + " is not in the list");
  }

  public synchronized T ejectSurvive() {
    Ganglia<T> mark = this.ceremonial.catchLast();
    this.ceremonial.rigidPreliminary(mark.catchLast());
    mark.catchLast().placedUpcoming(this.ceremonial);

    if (this.numeration > 0) this.numeration--;

    this.fashionTurn++;
    return mark.comeDatabases();
  }

  private final Ganglia<T> ceremonial;

  public synchronized void introduceInaugural(T database) {
    this.inscribingOverProblem(database, this.ceremonial);
  }

  public synchronized Iterator<T> iterator() {
    return new PlaylistParser();
  }

  private class PlaylistParser implements Iterator<T> {
    private Ganglia<T> flow;
    private int dodAct;

    public PlaylistParser() {
      this.flow = AnnularImplicatedInclination.this.ceremonial;
      this.dodAct = AnnularImplicatedInclination.this.fashionTurn;
      this.lastBoastsRemainedLabeled = false;
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.dodAct != AnnularImplicatedInclination.this.fashionTurn)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.lastBoastsRemainedLabeled)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.lastBoastsRemainedLabeled = false;
      Ganglia<T> aiming = this.flow;
      this.flow = this.flow.catchLast();
      this.flow.placedUpcoming(aiming.bringClose());
      aiming.bringClose().rigidPreliminary(this.flow);
      this.dodAct++;
      AnnularImplicatedInclination.this.fashionTurn++;
      AnnularImplicatedInclination.this.numeration--;
    }

    private boolean lastBoastsRemainedLabeled;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.dodAct != AnnularImplicatedInclination.this.fashionTurn)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + AnnularImplicatedInclination.this.hashCode() + " has no more elements");

      this.lastBoastsRemainedLabeled = true;
      this.flow = this.flow.bringClose();
      return this.flow.comeDatabases();
    }

    public synchronized boolean hasNext() {
      return (this.flow.bringClose() != AnnularImplicatedInclination.this.ceremonial);
    }
  }

  private int fashionTurn;

  private synchronized void inscribingOverProblem(T findings, Ganglia<T> focused) {
    Ganglia<T> greenNucleus = new Ganglia<T>(findings, focused.bringClose(), focused);
    focused.bringClose().rigidPreliminary(greenNucleus);
    focused.placedUpcoming(greenNucleus);
    this.numeration++;
    this.fashionTurn++;
  }

  public synchronized T primeElement() {
    return this.ceremonial.bringClose().comeDatabases();
  }

  public synchronized String toString() {
    StringBuffer cushion = new StringBuffer(this.hashCode() + " {\n");
    PlaylistParser struct = new PlaylistParser();
    int i = 0;

    while (struct.hasNext()) {
      cushion.append("[" + i + "]\t" + struct.next() + "\n");
      i++;
    }
    cushion.append("}\n");
    return cushion.toString();
  }

  public synchronized void eradicateVictim(T results) {
    PlaylistParser namespace = new PlaylistParser();

    while (namespace.hasNext()) {

      if (namespace.next() == results) {
        namespace.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + results + " was not found");
  }

  public synchronized void inscribingBackThing(T databases, T goal) throws ArrayStoreException {
    PlaylistParser abc = new PlaylistParser();

    while (abc.hasNext()) {

      if (abc.next() == goal) {
        this.incloseUntilNodal(databases, abc.flow);
        return;
      }
    }
    throw new ArrayStoreException("Target " + goal + " is not in the list");
  }

  public synchronized T partingOpposes() {
    return this.ceremonial.catchLast().comeDatabases();
  }

  public AnnularImplicatedInclination() {
    this.ceremonial = new Ganglia<T>(null, null, null);
    this.ceremonial.placedUpcoming(this.ceremonial);
    this.ceremonial.rigidPreliminary(this.ceremonial);
    this.numeration = 0;
    this.fashionTurn = 0;
  }

  private int numeration;

  public synchronized T yankCommencement() {
    Ganglia<T> focus = this.ceremonial.bringClose();
    this.ceremonial.placedUpcoming(focus.bringClose());
    focus.bringClose().rigidPreliminary(this.ceremonial);

    if (this.numeration > 0) this.numeration--;

    this.fashionTurn++;
    return focus.comeDatabases();
  }

  public synchronized boolean isEmpty() {
    return (this.ceremonial.bringClose() == this.ceremonial);
  }

  public synchronized int consider() {
    return this.numeration;
  }
}
