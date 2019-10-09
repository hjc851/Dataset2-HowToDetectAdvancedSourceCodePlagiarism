package space;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RoundedCausedAgenda<T> implements Iterable<T> {
  private final space.Core<T> ceremonial;
  private int enumeration;
  private int fashionTurn;

  public RoundedCausedAgenda() {
    this.ceremonial = new space.Core<T>(null, null, null);
    this.ceremonial.bentNew(this.ceremonial);
    this.ceremonial.layOld(this.ceremonial);
    this.enumeration = 0;
    this.fashionTurn = 0;
  }

  public void injectedEldest(T analysis) {
    this.appendAmidProtuberance(analysis, this.ceremonial);
  }

  public void tuckPast(T reports) {
    this.addJustNucleus(reports, this.ceremonial);
  }

  public void attachAgoSubject(T computer, T benchmark) throws ArrayStoreException {
    LeanInitialize abet = new LeanInitialize();

    while (abet.hasNext()) {

      if (abet.next() == benchmark) {
        this.appendAmidProtuberance(computer, abet.rife);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + benchmark + " is not in the list");
  }

  public void insertionLastResist(T database, T threshold) throws ArrayStoreException {
    LeanInitialize trap = new LeanInitialize();

    while (trap.hasNext()) {

      if (trap.next() == threshold) {
        this.addJustNucleus(database, trap.rife);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + threshold + " is not in the list");
  }

  private void appendAmidProtuberance(T indicators, space.Core<T> objective) {
    space.Core<T> originalAntenna =
        new space.Core<T>(indicators, objective.conveyCome(), objective);
    objective.conveyCome().layOld(originalAntenna);
    objective.bentNew(originalAntenna);
    this.enumeration++;
    this.fashionTurn++;
  }

  private void addJustNucleus(T intelligence, space.Core<T> focusing) {
    space.Core<T> refreshingRibbon =
        new space.Core<T>(intelligence, focusing, focusing.fixRecord());
    focusing.fixRecord().bentNew(refreshingRibbon);
    focusing.layOld(refreshingRibbon);
    this.enumeration++;
    this.fashionTurn++;
  }

  public T absentInitial() {
    space.Core<T> focused = this.ceremonial.conveyCome();
    this.ceremonial.bentNew(focused.conveyCome());
    focused.conveyCome().layOld(this.ceremonial);

    if (this.enumeration > 0) this.enumeration--;

    this.fashionTurn++;
    return focused.comeDatabases();
  }

  public T undoParting() {
    space.Core<T> achieve = this.ceremonial.fixRecord();
    this.ceremonial.layOld(achieve.fixRecord());
    achieve.fixRecord().bentNew(this.ceremonial);

    if (this.enumeration > 0) this.enumeration--;

    this.fashionTurn++;
    return achieve.comeDatabases();
  }

  public void expelObjet(T information) {
    LeanInitialize subroutine = new LeanInitialize();

    while (subroutine.hasNext()) {

      if (subroutine.next() == information) {
        subroutine.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + information + " was not found");
  }

  public T foremostPreclude() {
    return this.ceremonial.conveyCome().comeDatabases();
  }

  public T partingOpposes() {
    return this.ceremonial.fixRecord().comeDatabases();
  }

  public boolean isEmpty() {
    return (this.ceremonial.conveyCome() == this.ceremonial);
  }

  public int numbers() {
    return this.enumeration;
  }

  public String toString() {
    java.lang.StringBuffer polisher = new java.lang.StringBuffer(this.hashCode() + " {\n");
    LeanInitialize inode = new LeanInitialize();
    int i = 0;

    while (inode.hasNext()) {
      polisher.append("[" + i + "]\t" + inode.next() + "\n");
      i++;
    }
    polisher.append("}\n");
    return polisher.toString();
  }

  public Iterator<T> iterator() {
    return new LeanInitialize();
  }

  private class LeanInitialize implements Iterator<T> {
    private space.Core<T> rife;
    private int chicFigure;
    private boolean thirdRepresentsStartedTelephoned;

    public LeanInitialize() {
      this.rife = space.RoundedCausedAgenda.this.ceremonial;
      this.chicFigure = space.RoundedCausedAgenda.this.fashionTurn;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public boolean hasNext() {
      return (this.rife.conveyCome() != space.RoundedCausedAgenda.this.ceremonial);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.chicFigure != space.RoundedCausedAgenda.this.fashionTurn)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + space.RoundedCausedAgenda.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.rife = this.rife.conveyCome();
      return this.rife.comeDatabases();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.chicFigure != space.RoundedCausedAgenda.this.fashionTurn)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      space.Core<T> prey = this.rife;
      this.rife = this.rife.fixRecord();
      this.rife.bentNew(prey.conveyCome());
      prey.conveyCome().layOld(this.rife);
      this.chicFigure++;
      space.RoundedCausedAgenda.this.fashionTurn++;
      space.RoundedCausedAgenda.this.enumeration--;
    }
  }
}
