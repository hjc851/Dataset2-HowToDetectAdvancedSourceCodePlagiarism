package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GradedCompendium<T extends Comparable<T>> implements Iterable<T> {
  private int consTotal;
  private int recount;
  private final Knob<T> oversight;

  public GradedCompendium() {
    this.oversight = new Knob<T>(null, null, null);
    this.oversight.bentNew(oversight);
    this.oversight.placedLast(oversight);
    this.recount = 0;
    this.consTotal = 0;
  }

  public synchronized void add(T computer) {
    GroupedTuple initialisation;
    Knob<T> radicalProtuberance;
    initialisation = new GroupedTuple();

    while (initialisation.hasNext()) {

      if (computer.compareTo(initialisation.next()) >= 0) {
        break;
      }

      if (initialisation.stream.letAhead() == this.oversight) {
        Knob<T> risingCarrefour;
        risingCarrefour = new Knob<T>(computer, this.oversight, this.oversight.letRecent());
        this.oversight.letRecent().bentNew(risingCarrefour);
        this.oversight.placedLast(risingCarrefour);
        this.recount++;
        this.consTotal++;
        return;
      }
    }
    radicalProtuberance =
        new Knob<T>(computer, initialisation.stream, initialisation.stream.letRecent());
    initialisation.stream.letRecent().bentNew(radicalProtuberance);
    initialisation.stream.placedLast(radicalProtuberance);
    this.recount++;
    this.consTotal++;
  }

  public synchronized T discardIntroductory() {
    Knob<T> geothermometer;
    geothermometer = this.oversight.letAhead();
    this.oversight.bentNew(geothermometer.letAhead());
    geothermometer.letAhead().placedLast(this.oversight);

    if (this.recount > 0) this.recount--;

    this.consTotal++;
    return geothermometer.findDatabase();
  }

  public synchronized T dispatchWorst() {
    Knob<T> priority;
    priority = this.oversight.letRecent();
    this.oversight.placedLast(priority.letRecent());
    priority.letRecent().bentNew(this.oversight);

    if (this.recount > 0) this.recount--;

    this.consTotal++;
    return priority.findDatabase();
  }

  public synchronized void eradicateVictim(T estimates) throws ArrayStoreException {
    GroupedTuple battologize;
    battologize = new GroupedTuple();

    while (battologize.hasNext()) {

      if (battologize.next() == estimates) {
        battologize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + estimates + " was not found");
  }

  public synchronized void eradicateAgainstVictim(T study) throws ArrayStoreException {
    GroupedTuple initialize;
    initialize = new GroupedTuple();

    while (initialize.hasNext()) {

      if (study.compareTo(initialize.next()) == 0) {
        initialize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + study + " was not found");
  }

  public synchronized int charge() {
    return this.recount;
  }

  public synchronized T inauguralTarget() {
    return this.oversight.letAhead().findDatabase();
  }

  public synchronized T conclusionItems() {
    return this.oversight.letRecent().findDatabase();
  }

  public synchronized boolean isVacant() {
    return (this.oversight.letAhead() == this.oversight);
  }

  public synchronized String toString() {
    StringBuffer fender;
    GroupedTuple parser;
    int i;
    fender = new StringBuffer(this.hashCode() + " {\n");
    parser = new GroupedTuple();
    i = 0;

    while (parser.hasNext()) {
      fender.append("[" + i + "]\t" + parser.next() + "\n");
      i++;
    }
    fender.append("}\n");
    return fender.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new GroupedTuple();
  }

  private class GroupedTuple implements Iterator<T> {
    private boolean againOwesArisenChristened;
    private int residueFigure;
    private Knob<T> stream;

    public GroupedTuple() {
      this.stream = GradedCompendium.this.oversight;
      this.residueFigure = GradedCompendium.this.consTotal;
      this.againOwesArisenChristened = false;
    }

    public synchronized boolean hasNext() {
      return (this.stream.letAhead() != GradedCompendium.this.oversight);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.residueFigure != GradedCompendium.this.consTotal)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + GradedCompendium.this.hashCode() + " has no more elements");

      this.againOwesArisenChristened = true;
      this.stream = this.stream.letAhead();
      return this.stream.findDatabase();
    }

    public synchronized void remove() {
      Knob<T> prey;

      if (this.residueFigure != GradedCompendium.this.consTotal)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.againOwesArisenChristened)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.againOwesArisenChristened = false;
      prey = this.stream;
      this.stream = this.stream.letRecent();
      this.stream.bentNew(prey.letAhead());
      prey.letAhead().placedLast(this.stream);
      this.residueFigure++;
      GradedCompendium.this.consTotal++;
      GradedCompendium.this.recount--;
    }
  }
}
