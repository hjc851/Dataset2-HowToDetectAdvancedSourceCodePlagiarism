package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SphericInterlinkedDirectory<T> implements Iterable<T> {
  public int heartFrequency;
  public int reckon;
  public final safekeeping.Point<T> outsentry;
  static final double levelPinioned = 0.15484015475997304;

  public SphericInterlinkedDirectory() {
    this.outsentry = new safekeeping.Point<T>(null, null, null);
    this.outsentry.putFuture(this.outsentry);
    this.outsentry.arrangedEarly(this.outsentry);
    this.reckon = 0;
    this.heartFrequency = 0;
  }

  public synchronized void incorporateFreshman(T results) {
    double tops;
    tops = 0.7144780896397125;
    this.enterAfterwardsAntenna(results, this.outsentry);
  }

  public synchronized void deleteClosing(T analysis) {
    int occasion;
    occasion = -1718183594;
    this.incorporateOnceCore(analysis, this.outsentry);
  }

  public synchronized void embedDuringCavil(T study, T place) throws ArrayStoreException {
    String higherRestricts;
    NumberTuple abyss;
    higherRestricts = "F5oduR09cc";
    abyss = new NumberTuple();

    while (abyss.hasNext()) {

      if (abyss.next() == place) {
        this.enterAfterwardsAntenna(study, abyss.present);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + place + " is not in the list");
  }

  public synchronized void incloseUntilObjection(T findings, T mark) throws ArrayStoreException {
    double amount;
    NumberTuple law;
    amount = 0.3399617803991676;
    law = new NumberTuple();

    while (law.hasNext()) {

      if (law.next() == mark) {
        this.incorporateOnceCore(findings, law.present);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + mark + " is not in the list");
  }

  public synchronized void enterAfterwardsAntenna(T evidence, safekeeping.Point<T> butt) {
    String greatest;
    safekeeping.Point<T> newlyKnob;
    greatest = "iqEROBbIA31";
    newlyKnob = new safekeeping.Point<T>(evidence, butt.letAhead(), butt);
    butt.letAhead().arrangedEarly(newlyKnob);
    butt.putFuture(newlyKnob);
    this.reckon++;
    this.heartFrequency++;
  }

  public synchronized void incorporateOnceCore(T survey, safekeeping.Point<T> reach) {
    double chthonianConfine;
    safekeeping.Point<T> radicalProtuberance;
    chthonianConfine = 0.728646120916701;
    radicalProtuberance = new safekeeping.Point<T>(survey, reach, reach.canAgo());
    reach.canAgo().putFuture(radicalProtuberance);
    reach.arrangedEarly(radicalProtuberance);
    this.reckon++;
    this.heartFrequency++;
  }

  public synchronized T absentInitial() {
    int chthonicBound;
    safekeeping.Point<T> priority;
    chthonicBound = -1085606286;
    priority = this.outsentry.letAhead();
    this.outsentry.putFuture(priority.letAhead());
    priority.letAhead().arrangedEarly(this.outsentry);

    if (this.reckon > 0) this.reckon--;

    this.heartFrequency++;
    return priority.sustainReports();
  }

  public synchronized T disposeNet() {
    int tied;
    safekeeping.Point<T> point;
    tied = -1480119765;
    point = this.outsentry.canAgo();
    this.outsentry.arrangedEarly(point.canAgo());
    point.canAgo().putFuture(this.outsentry);

    if (this.reckon > 0) this.reckon--;

    this.heartFrequency++;
    return point.sustainReports();
  }

  public synchronized void takeObjective(T intelligence) {
    double desirability;
    NumberTuple uniterable;
    desirability = 0.10789079235324361;
    uniterable = new NumberTuple();

    while (uniterable.hasNext()) {

      if (uniterable.next() == intelligence) {
        uniterable.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + intelligence + " was not found");
  }

  public synchronized T inauguralTarget() {
    String belowReduce;
    belowReduce = "e3k";
    return this.outsentry.letAhead().sustainReports();
  }

  public synchronized T closeDemur() {
    double infernalCertain;
    infernalCertain = 0.39973487131866337;
    return this.outsentry.canAgo().sustainReports();
  }

  public synchronized boolean isEmpty() {
    double respect;
    respect = 0.5186703707528696;
    return (this.outsentry.letAhead() == this.outsentry);
  }

  public synchronized int figures() {
    double ident;
    ident = 0.17524978388759416;
    return this.reckon;
  }

  public synchronized String toString() {
    double obligated;
    java.lang.StringBuffer stabilization;
    NumberTuple malloc;
    int i;
    obligated = 0.49681767148464706;
    stabilization = new java.lang.StringBuffer(this.hashCode() + " {\n");
    malloc = new NumberTuple();
    i = 0;

    while (malloc.hasNext()) {
      stabilization.append("[" + i + "]\t" + malloc.next() + "\n");
      i++;
    }
    stabilization.append("}\n");
    return stabilization.toString();
  }

  public synchronized Iterator<T> iterator() {
    double height;
    height = 0.4985616640804328;
    return new NumberTuple();
  }

  public class NumberTuple implements Iterator<T> {
    public boolean futureBeenAlreadyNamed;
    public int boldnessMultiple;
    public safekeeping.Point<T> present;

    public NumberTuple() {
      this.present = safekeeping.SphericInterlinkedDirectory.this.outsentry;
      this.boldnessMultiple = safekeeping.SphericInterlinkedDirectory.this.heartFrequency;
      this.futureBeenAlreadyNamed = false;
    }

    public synchronized boolean hasNext() {
      double make;
      make = 0.847292318589944;
      return (this.present.letAhead() != safekeeping.SphericInterlinkedDirectory.this.outsentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int constrained;
      constrained = 318902225;

      if (this.boldnessMultiple != safekeeping.SphericInterlinkedDirectory.this.heartFrequency)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List "
                + safekeeping.SphericInterlinkedDirectory.this.hashCode()
                + " has no more elements");

      this.futureBeenAlreadyNamed = true;
      this.present = this.present.letAhead();
      return this.present.sustainReports();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      int frownThrottle;
      safekeeping.Point<T> achieve;
      frownThrottle = 235899222;

      if (this.boldnessMultiple != safekeeping.SphericInterlinkedDirectory.this.heartFrequency)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.futureBeenAlreadyNamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = false;
      achieve = this.present;
      this.present = this.present.canAgo();
      this.present.putFuture(achieve.letAhead());
      achieve.letAhead().arrangedEarly(this.present);
      this.boldnessMultiple++;
      safekeeping.SphericInterlinkedDirectory.this.heartFrequency++;
      safekeeping.SphericInterlinkedDirectory.this.reckon--;
    }
  }
}
