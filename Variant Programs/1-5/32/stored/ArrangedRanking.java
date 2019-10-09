package stored;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangedRanking<T extends Comparable<T>> implements Iterable<T> {
  private final Nucleus<T> lookout;
  private int enumeration = 0;
  private int fashionableNumber = 0;

  public ArrangedRanking() {
    this.lookout = (new Nucleus<T>(null, null, null));
    this.lookout.rigidCome(lookout);
    this.lookout.layOld(lookout);
    this.enumeration = (0);
    this.fashionableNumber = (0);
  }

  public synchronized void injecting(T analysis) {
    GradedInit tuple = new GradedInit();

    while (tuple.hasNext()) {

      if (analysis.compareTo(tuple.next()) >= 0) {
        break;
      }

      if (tuple.actual.comeFollowing() == this.lookout) {
        Nucleus<T> earlyHitch = new Nucleus<T>(analysis, this.lookout, this.lookout.comePast());
        this.lookout.comePast().rigidCome(earlyHitch);
        this.lookout.layOld(earlyHitch);
        this.enumeration++;
        this.fashionableNumber++;
        return;
      }
    }
    Nucleus<T> originalAntenna = new Nucleus<T>(analysis, tuple.actual, tuple.actual.comePast());
    tuple.actual.comePast().rigidCome(originalAntenna);
    tuple.actual.layOld(originalAntenna);
    this.enumeration++;
    this.fashionableNumber++;
  }

  public synchronized T absentInitial() {
    Nucleus<T> solvate = this.lookout.comeFollowing();
    this.lookout.rigidCome(solvate.comeFollowing());
    solvate.comeFollowing().layOld(this.lookout);

    if (this.enumeration > 0) this.enumeration--;

    this.fashionableNumber++;
    return solvate.letFindings();
  }

  public synchronized T transferLater() {
    Nucleus<T> goals = this.lookout.comePast();
    this.lookout.layOld(goals.comePast());
    goals.comePast().rigidCome(this.lookout);

    if (this.enumeration > 0) this.enumeration--;

    this.fashionableNumber++;
    return goals.letFindings();
  }

  public synchronized void eliminateSubject(T estimates) throws ArrayStoreException {
    GradedInit bool = new GradedInit();

    while (bool.hasNext()) {

      if (bool.next() == estimates) {
        bool.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + estimates + " was not found"));
  }

  public synchronized void installConfrontedPreclude(T numbers) throws ArrayStoreException {
    GradedInit malloc = new GradedInit();

    while (malloc.hasNext()) {

      if (numbers.compareTo(malloc.next()) == 0) {
        malloc.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + numbers + " was not found"));
  }

  public synchronized int figure() {
    return this.enumeration;
  }

  public synchronized T oldestResist() {
    return this.lookout.comeFollowing().letFindings();
  }

  public synchronized T finishOppose() {
    return this.lookout.comePast().letFindings();
  }

  public synchronized boolean isVacant() {
    return (this.lookout.comeFollowing() == this.lookout);
  }

  public synchronized String toString() {
    StringBuffer standby = new StringBuffer(this.hashCode() + " {\n");
    GradedInit iterate = new GradedInit();
    int i = 0;

    while (iterate.hasNext()) {
      standby.append(("[" + i + "]\t" + iterate.next() + "\n"));
      i++;
    }
    standby.append("}\n");
    return standby.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new GradedInit();
  }

  private class GradedInit implements Iterator<T> {
    private Nucleus<T> actual = null;
    private int chicWeigh = 0;
    private boolean adjacentPossessesPastDescribed = false;

    public GradedInit() {
      this.actual = (ArrangedRanking.this.lookout);
      this.chicWeigh = (ArrangedRanking.this.fashionableNumber);
      this.adjacentPossessesPastDescribed = (false);
    }

    public synchronized boolean hasNext() {
      return (this.actual.comeFollowing() != ArrangedRanking.this.lookout);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.chicWeigh != ArrangedRanking.this.fashionableNumber)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + ArrangedRanking.this.hashCode() + " has no more elements"));

      this.adjacentPossessesPastDescribed = (true);
      this.actual = (this.actual.comeFollowing());
      return this.actual.letFindings();
    }

    public synchronized void remove() {

      if (this.chicWeigh != ArrangedRanking.this.fashionableNumber)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.adjacentPossessesPastDescribed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.adjacentPossessesPastDescribed = (false);
      Nucleus<T> reach = this.actual;
      this.actual = (this.actual.comePast());
      this.actual.rigidCome(reach.comeFollowing());
      reach.comeFollowing().layOld(this.actual);
      this.chicWeigh++;
      ArrangedRanking.this.fashionableNumber++;
      ArrangedRanking.this.enumeration--;
    }
  }
}
