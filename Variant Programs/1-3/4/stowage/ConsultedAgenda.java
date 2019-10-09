package stowage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ConsultedAgenda<T extends Comparable<T>> implements Iterable<T> {
  private int boldnessRely;
  private int number;
  private final Core<T> guard;

  public ConsultedAgenda() {
    this.guard = new Core<T>(null, null, null);
    this.guard.orderedAgain(guard);
    this.guard.situatedLatest(guard);
    this.number = 0;
    this.boldnessRely = 0;
  }

  public synchronized void introduce(T statistical) {
    IndexedSubstring iterate;
    Core<T> otherEntanglement;
    iterate = new IndexedSubstring();

    while (iterate.hasNext()) {

      if (statistical.compareTo(iterate.next()) >= 0) {
        break;
      }

      if (iterate.presently.makeAdjacent() == this.guard) {
        Core<T> greenNucleus;
        greenNucleus = new Core<T>(statistical, this.guard, this.guard.fixRecord());
        this.guard.fixRecord().orderedAgain(greenNucleus);
        this.guard.situatedLatest(greenNucleus);
        this.number++;
        this.boldnessRely++;
        return;
      }
    }
    otherEntanglement = new Core<T>(statistical, iterate.presently, iterate.presently.fixRecord());
    iterate.presently.fixRecord().orderedAgain(otherEntanglement);
    iterate.presently.situatedLatest(otherEntanglement);
    this.number++;
    this.boldnessRely++;
  }

  public synchronized T ridOutset() {
    Core<T> geothermometer;
    geothermometer = this.guard.makeAdjacent();
    this.guard.orderedAgain(geothermometer.makeAdjacent());
    geothermometer.makeAdjacent().situatedLatest(this.guard);

    if (this.number > 0) this.number--;

    this.boldnessRely++;
    return geothermometer.haveStatistical();
  }

  public synchronized T slayFinal() {
    Core<T> quarry;
    quarry = this.guard.fixRecord();
    this.guard.situatedLatest(quarry.fixRecord());
    quarry.fixRecord().orderedAgain(this.guard);

    if (this.number > 0) this.number--;

    this.boldnessRely++;
    return quarry.haveStatistical();
  }

  public synchronized void disposeDisagree(T information) throws ArrayStoreException {
    IndexedSubstring malloc;
    malloc = new IndexedSubstring();

    while (malloc.hasNext()) {

      if (malloc.next() == information) {
        malloc.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + information + " was not found");
  }

  public synchronized void disposeContreDisagree(T findings) throws ArrayStoreException {
    IndexedSubstring battologize;
    battologize = new IndexedSubstring();

    while (battologize.hasNext()) {

      if (findings.compareTo(battologize.next()) == 0) {
        battologize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + findings + " was not found");
  }

  public synchronized int get() {
    return this.number;
  }

  public synchronized T oldestResist() {
    return this.guard.makeAdjacent().haveStatistical();
  }

  public synchronized T netDisagree() {
    return this.guard.fixRecord().haveStatistical();
  }

  public synchronized boolean isVacant() {
    return (this.guard.makeAdjacent() == this.guard);
  }

  public synchronized String toString() {
    StringBuffer neutralize;
    IndexedSubstring bool;
    int i;
    neutralize = new StringBuffer(this.hashCode() + " {\n");
    bool = new IndexedSubstring();
    i = 0;

    while (bool.hasNext()) {
      neutralize.append("[" + i + "]\t" + bool.next() + "\n");
      i++;
    }
    neutralize.append("}\n");
    return neutralize.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new IndexedSubstring();
  }

  private class IndexedSubstring implements Iterator<T> {
    private boolean succeedingRemainsGottenTermed;
    private int moduleTabulation;
    private Core<T> presently;

    public IndexedSubstring() {
      this.presently = ConsultedAgenda.this.guard;
      this.moduleTabulation = ConsultedAgenda.this.boldnessRely;
      this.succeedingRemainsGottenTermed = false;
    }

    public synchronized boolean hasNext() {
      return (this.presently.makeAdjacent() != ConsultedAgenda.this.guard);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.moduleTabulation != ConsultedAgenda.this.boldnessRely)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ConsultedAgenda.this.hashCode() + " has no more elements");

      this.succeedingRemainsGottenTermed = true;
      this.presently = this.presently.makeAdjacent();
      return this.presently.haveStatistical();
    }

    public synchronized void remove() {
      Core<T> focused;

      if (this.moduleTabulation != ConsultedAgenda.this.boldnessRely)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.succeedingRemainsGottenTermed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.succeedingRemainsGottenTermed = false;
      focused = this.presently;
      this.presently = this.presently.fixRecord();
      this.presently.orderedAgain(focused.makeAdjacent());
      focused.makeAdjacent().situatedLatest(this.presently);
      this.moduleTabulation++;
      ConsultedAgenda.this.boldnessRely++;
      ConsultedAgenda.this.number--;
    }
  }
}
