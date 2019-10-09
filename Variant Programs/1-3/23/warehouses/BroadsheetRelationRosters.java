package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BroadsheetRelationRosters<T> implements Iterable<T> {
  private int moduleRoutine;
  private int enumeration;
  private final Knob<T> controlled;

  public BroadsheetRelationRosters() {
    this.controlled = new Knob<T>(null, null, null);
    this.controlled.bentNew(this.controlled);
    this.controlled.placedLast(this.controlled);
    this.enumeration = 0;
    this.moduleRoutine = 0;
  }

  public synchronized void injectingForward(T results) {
    this.infixFollowingNodule(results, this.controlled);
  }

  public synchronized void inclosePenultimate(T indicators) {
    this.insertionLastGanglion(indicators, this.controlled);
  }

  public synchronized void encloseAfterwardAim(T findings, T benchmark) throws ArrayStoreException {
    InclinationStruct aberdeen;
    aberdeen = new InclinationStruct();

    while (aberdeen.hasNext()) {

      if (aberdeen.next() == benchmark) {
        this.infixFollowingNodule(findings, aberdeen.circulating);
        return;
      }
    }
    throw new ArrayStoreException("Target " + benchmark + " is not in the list");
  }

  public synchronized void injectWithoutOppose(T evidence, T limit) throws ArrayStoreException {
    InclinationStruct above;
    above = new InclinationStruct();

    while (above.hasNext()) {

      if (above.next() == limit) {
        this.insertionLastGanglion(evidence, above.circulating);
        return;
      }
    }
    throw new ArrayStoreException("Target " + limit + " is not in the list");
  }

  private synchronized void infixFollowingNodule(T files, Knob<T> pinpoint) {
    Knob<T> greenNucleus;
    greenNucleus = new Knob<T>(files, pinpoint.letAhead(), pinpoint);
    pinpoint.letAhead().placedLast(greenNucleus);
    pinpoint.bentNew(greenNucleus);
    this.enumeration++;
    this.moduleRoutine++;
  }

  private synchronized void insertionLastGanglion(T databases, Knob<T> objective) {
    Knob<T> novelLump;
    novelLump = new Knob<T>(databases, objective, objective.letRecent());
    objective.letRecent().bentNew(novelLump);
    objective.placedLast(novelLump);
    this.enumeration++;
    this.moduleRoutine++;
  }

  public synchronized T hitTop() {
    Knob<T> threshold;
    threshold = this.controlled.letAhead();
    this.controlled.bentNew(threshold.letAhead());
    threshold.letAhead().placedLast(this.controlled);

    if (this.enumeration > 0) this.enumeration--;

    this.moduleRoutine++;
    return threshold.findDatabase();
  }

  public synchronized T takePast() {
    Knob<T> focus;
    focus = this.controlled.letRecent();
    this.controlled.placedLast(focus.letRecent());
    focus.letRecent().bentNew(this.controlled);

    if (this.enumeration > 0) this.enumeration--;

    this.moduleRoutine++;
    return focus.findDatabase();
  }

  public synchronized void hitObjection(T readings) {
    InclinationStruct bool;
    bool = new InclinationStruct();

    while (bool.hasNext()) {

      if (bool.next() == readings) {
        bool.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + readings + " was not found");
  }

  public synchronized T initialAim() {
    return this.controlled.letAhead().findDatabase();
  }

  public synchronized T goArgue() {
    return this.controlled.letRecent().findDatabase();
  }

  public synchronized boolean isEmpty() {
    return (this.controlled.letAhead() == this.controlled);
  }

  public synchronized int calculation() {
    return this.enumeration;
  }

  public synchronized String toString() {
    StringBuffer temporary;
    InclinationStruct recursion;
    int i;
    temporary = new StringBuffer(this.hashCode() + " {\n");
    recursion = new InclinationStruct();
    i = 0;

    while (recursion.hasNext()) {
      temporary.append("[" + i + "]\t" + recursion.next() + "\n");
      i++;
    }
    temporary.append("}\n");
    return temporary.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new InclinationStruct();
  }

  private class InclinationStruct implements Iterator<T> {
    private boolean afterExistsLivedDeclared;
    private int iloBit;
    private Knob<T> circulating;

    public InclinationStruct() {
      this.circulating = BroadsheetRelationRosters.this.controlled;
      this.iloBit = BroadsheetRelationRosters.this.moduleRoutine;
      this.afterExistsLivedDeclared = false;
    }

    public synchronized boolean hasNext() {
      return (this.circulating.letAhead() != BroadsheetRelationRosters.this.controlled);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.iloBit != BroadsheetRelationRosters.this.moduleRoutine)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + BroadsheetRelationRosters.this.hashCode() + " has no more elements");

      this.afterExistsLivedDeclared = true;
      this.circulating = this.circulating.letAhead();
      return this.circulating.findDatabase();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      Knob<T> objectives;

      if (this.iloBit != BroadsheetRelationRosters.this.moduleRoutine)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.afterExistsLivedDeclared)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.afterExistsLivedDeclared = false;
      objectives = this.circulating;
      this.circulating = this.circulating.letRecent();
      this.circulating.bentNew(objectives.letAhead());
      objectives.letAhead().placedLast(this.circulating);
      this.iloBit++;
      BroadsheetRelationRosters.this.moduleRoutine++;
      BroadsheetRelationRosters.this.enumeration--;
    }
  }
}
