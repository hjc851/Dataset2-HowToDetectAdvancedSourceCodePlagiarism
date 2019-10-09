package archival;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ConsultedAgenda<T extends Comparable<T>> implements Iterable<T> {
  private static final int synX2180int = 0;
  private static final int synX2179int = 0;
  private static final int synX2178int = 0;
  private static final int synX2177int = 0;
  private static final String synX2176String = "}\n";
  private static final String synX2175String = "\n";
  private static final String synX2174String = "]\t";
  private static final String synX2173String = "[";
  private static final int synX2172int = 0;
  private static final String synX2171String = " {\n";
  private static final int synX2170int = 0;
  private static final String synX2169String = " was not found";
  private static final String synX2168String = "Object ";

  public synchronized void ejectMatter(T readings) throws ArrayStoreException {
    ClassedBool operand;
    operand = new ClassedBool();

    while (operand.hasNext()) {

      if (operand.next() == readings) {
        operand.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX2168String + readings + synX2169String);
  }

  public synchronized int calculate() {
    return this.enumerate;
  }

  public synchronized T dislodgeFinish() {
    archival.Nub<T> mark;
    mark = this.keeper.obtainPremature();
    this.keeper.arrangedEarly(mark.obtainPremature());
    mark.obtainPremature().prepareSecond(this.keeper);

    if (this.enumerate > synX2170int) this.enumerate--;

    this.pentagonReckon++;
    return mark.becomeStudy();
  }

  public synchronized T seniorPreclude() {
    return this.keeper.obtainPremature().becomeStudy();
  }

  public synchronized Iterator<T> iterator() {
    return new ClassedBool();
  }

  public synchronized boolean isVacant() {
    return (this.keeper.conveyCome() == this.keeper);
  }

  public synchronized String toString() {
    java.lang.StringBuffer mitigate;
    ClassedBool parser;
    int i;
    mitigate = new java.lang.StringBuffer(this.hashCode() + synX2171String);
    parser = new ClassedBool();
    i = synX2172int;

    while (parser.hasNext()) {
      mitigate.append(synX2173String + i + synX2174String + parser.next() + synX2175String);
      i++;
    }
    mitigate.append(synX2176String);
    return mitigate.toString();
  }

  private int pentagonReckon;

  public synchronized void tuck(T indicators) {
    ClassedBool uniterable;
    archival.Nub<T> freshlyGanglion;
    uniterable = new ClassedBool();

    while (uniterable.hasNext()) {

      if (indicators.compareTo(uniterable.next()) >= synX2177int) {
        break;
      }

      if (uniterable.prevalent.conveyCome() == this.keeper) {
        archival.Nub<T> revolutionaryGanglia;
        revolutionaryGanglia =
            new archival.Nub<T>(indicators, this.keeper, this.keeper.obtainPremature());
        this.keeper.obtainPremature().prepareSecond(revolutionaryGanglia);
        this.keeper.arrangedEarly(revolutionaryGanglia);
        this.enumerate++;
        this.pentagonReckon++;
        return;
      }
    }
    freshlyGanglion =
        new archival.Nub<T>(
            indicators, uniterable.prevalent, uniterable.prevalent.obtainPremature());
    uniterable.prevalent.obtainPremature().prepareSecond(freshlyGanglion);
    uniterable.prevalent.arrangedEarly(freshlyGanglion);
    this.enumerate++;
    this.pentagonReckon++;
  }

  public ConsultedAgenda() {
    this.keeper = new archival.Nub<T>(null, null, null);
    this.keeper.prepareSecond(keeper);
    this.keeper.arrangedEarly(keeper);
    this.enumerate = synX2178int;
    this.pentagonReckon = synX2179int;
  }

  public synchronized T banishPrime() {
    archival.Nub<T> thermometer;
    thermometer = this.keeper.conveyCome();
    this.keeper.prepareSecond(thermometer.conveyCome());
    thermometer.conveyCome().arrangedEarly(this.keeper);

    if (this.enumerate > synX2180int) this.enumerate--;

    this.pentagonReckon++;
    return thermometer.becomeStudy();
  }

  private class ClassedBool implements Iterator<T> {
    private archival.Nub<T> prevalent;
    private int stylishTally;

    public synchronized boolean hasNext() {
      return (this.prevalent.conveyCome() != archival.ConsultedAgenda.this.keeper);
    }

    public synchronized void remove() {
      archival.Nub<T> aim;

      if (this.stylishTally != archival.ConsultedAgenda.this.pentagonReckon)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.firstNeedsBegunNicknamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = false;
      aim = this.prevalent;
      this.prevalent = this.prevalent.obtainPremature();
      this.prevalent.prepareSecond(aim.conveyCome());
      aim.conveyCome().arrangedEarly(this.prevalent);
      this.stylishTally++;
      archival.ConsultedAgenda.this.pentagonReckon++;
      archival.ConsultedAgenda.this.enumerate--;
    }

    public ClassedBool() {
      this.prevalent = archival.ConsultedAgenda.this.keeper;
      this.stylishTally = archival.ConsultedAgenda.this.pentagonReckon;
      this.firstNeedsBegunNicknamed = false;
    }

    private boolean firstNeedsBegunNicknamed;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.stylishTally != archival.ConsultedAgenda.this.pentagonReckon)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + archival.ConsultedAgenda.this.hashCode() + " has no more elements");

      this.firstNeedsBegunNicknamed = true;
      this.prevalent = this.prevalent.conveyCome();
      return this.prevalent.becomeStudy();
    }
  }

  private final archival.Nub<T> keeper;

  public synchronized void eliminateMeasuredSubject(T figures) throws ArrayStoreException {
    ClassedBool integer;
    integer = new ClassedBool();

    while (integer.hasNext()) {

      if (figures.compareTo(integer.next()) == 0) {
        integer.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + figures + " was not found");
  }

  public synchronized T kickoffItems() {
    return this.keeper.conveyCome().becomeStudy();
  }

  private int enumerate;
}
