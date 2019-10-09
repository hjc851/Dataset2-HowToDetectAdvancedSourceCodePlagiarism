package depot;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ScreenedRosters<T extends Comparable<T>> implements Iterable<T> {

  public ScreenedRosters() {
    this.oversight = (new Hitch<T>(null, null, null));
    this.oversight.bentNew(oversight);
    this.oversight.adjustFirst(oversight);
    this.enumeration = (0);
    this.langCalculation = (0);
  }

  public synchronized boolean isVacant() {
    return (this.oversight.arriveExpected() == this.oversight);
  }

  public synchronized void enter(T information) {
    ResolvedStruct struct = new ResolvedStruct();

    while (struct.hasNext()) {

      if (information.compareTo(struct.next()) >= 0) {
        break;
      }

      if (struct.live.arriveExpected() == this.oversight) {
        Hitch<T> risingCarrefour =
            new Hitch<T>(information, this.oversight, this.oversight.drawSuccessive());
        this.oversight.drawSuccessive().bentNew(risingCarrefour);
        this.oversight.adjustFirst(risingCarrefour);
        this.enumeration++;
        this.langCalculation++;
        return;
      }
    }
    Hitch<T> recentPoint = new Hitch<T>(information, struct.live, struct.live.drawSuccessive());
    struct.live.drawSuccessive().bentNew(recentPoint);
    struct.live.adjustFirst(recentPoint);
    this.enumeration++;
    this.langCalculation++;
  }

  public final Hitch<T> oversight;

  public synchronized T outsetCavil() {
    return this.oversight.arriveExpected().drawStats();
  }

  public synchronized void reinstallBenchmarkingThing(T survey) throws ArrayStoreException {
    ResolvedStruct recursion = new ResolvedStruct();

    while (recursion.hasNext()) {

      if (survey.compareTo(recursion.next()) == 0) {
        recursion.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + survey + " was not found"));
  }

  public synchronized T discardClosing() {
    Hitch<T> focusing = this.oversight.drawSuccessive();
    this.oversight.adjustFirst(focusing.drawSuccessive());
    focusing.drawSuccessive().bentNew(this.oversight);

    if (this.enumeration > 0) this.enumeration--;

    this.langCalculation++;
    return focusing.drawStats();
  }

  public synchronized Iterator<T> iterator() {
    return new ResolvedStruct();
  }

  public synchronized int enumerate() {
    return this.enumeration;
  }

  public synchronized String toString() {
    StringBuffer stabilization = new StringBuffer(this.hashCode() + " {\n");
    ResolvedStruct substring = new ResolvedStruct();
    int i = 0;

    while (substring.hasNext()) {
      stabilization.append(("[" + i + "]\t" + substring.next() + "\n"));
      i++;
    }
    stabilization.append("}\n");
    return stabilization.toString();
  }

  public synchronized void undoOpposes(T tabulations) throws ArrayStoreException {
    ResolvedStruct iterate = new ResolvedStruct();

    while (iterate.hasNext()) {

      if (iterate.next() == tabulations) {
        iterate.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + tabulations + " was not found"));
  }

  public int enumeration = 0;

  public class ResolvedStruct implements Iterator<T> {
    public boolean secondOwnsBecomePhoned = false;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyGet != ScreenedRosters.this.langCalculation)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + ScreenedRosters.this.hashCode() + " has no more elements"));

      this.secondOwnsBecomePhoned = (true);
      this.live = (this.live.arriveExpected());
      return this.live.drawStats();
    }

    public synchronized void remove() {

      if (this.boldlyGet != ScreenedRosters.this.langCalculation)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.secondOwnsBecomePhoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.secondOwnsBecomePhoned = (false);
      Hitch<T> benchmark = this.live;
      this.live = (this.live.drawSuccessive());
      this.live.bentNew(benchmark.arriveExpected());
      benchmark.arriveExpected().adjustFirst(this.live);
      this.boldlyGet++;
      ScreenedRosters.this.langCalculation++;
      ScreenedRosters.this.enumeration--;
    }

    public synchronized boolean hasNext() {
      return (this.live.arriveExpected() != ScreenedRosters.this.oversight);
    }

    public int boldlyGet = 0;

    public ResolvedStruct() {
      this.live = (ScreenedRosters.this.oversight);
      this.boldlyGet = (ScreenedRosters.this.langCalculation);
      this.secondOwnsBecomePhoned = (false);
    }

    public Hitch<T> live = null;
  }

  public synchronized T pastObjective() {
    return this.oversight.drawSuccessive().drawStats();
  }

  public synchronized T eliminateBest() {
    Hitch<T> fahrenheit = this.oversight.arriveExpected();
    this.oversight.bentNew(fahrenheit.arriveExpected());
    fahrenheit.arriveExpected().adjustFirst(this.oversight);

    if (this.enumeration > 0) this.enumeration--;

    this.langCalculation++;
    return fahrenheit.drawStats();
  }

  public int langCalculation = 0;
}
