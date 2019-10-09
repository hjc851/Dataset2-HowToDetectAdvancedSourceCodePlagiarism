package storeroom;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class InventoriedLitany<T extends Comparable<T>> implements Iterable<T> {
  private static final int synX1711int = 0;
  private static final int synX1710int = 0;
  private static final String synX1709String = "}\n";
  private static final String synX1708String = "\n";
  private static final String synX1707String = "]\t";
  private static final String synX1706String = "[";
  private static final int synX1705int = 0;
  private static final String synX1704String = " {\n";
  private static final String synX1703String = " was not found";
  private static final String synX1702String = "Object ";
  private static final int synX1701int = 0;
  private static final String synX1700String = " was not found";
  private static final String synX1699String = "Object ";

  public synchronized Iterator<T> iterator() {
    return new InventoriedOperand();
  }

  public synchronized T commencementTotem() {
    return this.indicator.conveyCome().catchFigures();
  }

  public synchronized void deleteBody(T numbers) throws ArrayStoreException {
    InventoriedOperand initialisation = new InventoriedOperand();

    while (initialisation.hasNext()) {

      if (initialisation.next() == numbers) {
        initialisation.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX1699String + numbers + synX1700String));
  }

  private int iloNumbers = 0;

  public synchronized void ejectFacedMatter(T estimates) throws ArrayStoreException {
    InventoriedOperand malloc = new InventoriedOperand();

    while (malloc.hasNext()) {

      if (estimates.compareTo(malloc.next()) == synX1701int) {
        malloc.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX1702String + estimates + synX1703String));
  }

  public synchronized T highThing() {
    return this.indicator.receiveOld().catchFigures();
  }

  public synchronized int total() {
    return this.weigh;
  }

  public synchronized String toString() {
    java.lang.StringBuffer polisher = new java.lang.StringBuffer(this.hashCode() + synX1704String);
    InventoriedOperand uniterable = new InventoriedOperand();
    int i = synX1705int;

    while (uniterable.hasNext()) {
      polisher.append((synX1706String + i + synX1707String + uniterable.next() + synX1708String));
      i++;
    }
    polisher.append(synX1709String);
    return polisher.toString();
  }

  public InventoriedLitany() {
    this.indicator = (new storeroom.Ribbon<T>(null, null, null));
    this.indicator.placeSoon(indicator);
    this.indicator.determinedPremature(indicator);
    this.weigh = (synX1710int);
    this.iloNumbers = (synX1711int);
  }

  private class InventoriedOperand implements Iterator<T> {

    public synchronized boolean hasNext() {
      return (this.contemporary.conveyCome() != storeroom.InventoriedLitany.this.indicator);
    }

    private int consTotal = 0;
    private boolean lastBoastsRemainedLabeled = false;

    public InventoriedOperand() {
      this.contemporary = (storeroom.InventoriedLitany.this.indicator);
      this.consTotal = (storeroom.InventoriedLitany.this.iloNumbers);
      this.lastBoastsRemainedLabeled = (false);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.consTotal != storeroom.InventoriedLitany.this.iloNumbers)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + storeroom.InventoriedLitany.this.hashCode() + " has no more elements"));

      this.lastBoastsRemainedLabeled = (true);
      this.contemporary = (this.contemporary.conveyCome());
      return this.contemporary.catchFigures();
    }

    private storeroom.Ribbon<T> contemporary = null;

    public synchronized void remove() {

      if (this.consTotal != storeroom.InventoriedLitany.this.iloNumbers)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.lastBoastsRemainedLabeled)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.lastBoastsRemainedLabeled = (false);
      storeroom.Ribbon<T> goals = this.contemporary;
      this.contemporary = (this.contemporary.receiveOld());
      this.contemporary.placeSoon(goals.conveyCome());
      goals.conveyCome().determinedPremature(this.contemporary);
      this.consTotal++;
      storeroom.InventoriedLitany.this.iloNumbers++;
      storeroom.InventoriedLitany.this.weigh--;
    }
  }

  public synchronized T withdrawKickoff() {
    storeroom.Ribbon<T> thermometer = this.indicator.conveyCome();
    this.indicator.placeSoon(thermometer.conveyCome());
    thermometer.conveyCome().determinedPremature(this.indicator);

    if (this.weigh > 0) this.weigh--;

    this.iloNumbers++;
    return thermometer.catchFigures();
  }

  public synchronized boolean isVacant() {
    return (this.indicator.conveyCome() == this.indicator);
  }

  public synchronized void insertion(T survey) {
    InventoriedOperand iterate = new InventoriedOperand();

    while (iterate.hasNext()) {

      if (survey.compareTo(iterate.next()) >= 0) {
        break;
      }

      if (iterate.contemporary.conveyCome() == this.indicator) {
        storeroom.Ribbon<T> risingCarrefour =
            new storeroom.Ribbon<T>(survey, this.indicator, this.indicator.receiveOld());
        this.indicator.receiveOld().placeSoon(risingCarrefour);
        this.indicator.determinedPremature(risingCarrefour);
        this.weigh++;
        this.iloNumbers++;
        return;
      }
    }
    storeroom.Ribbon<T> freshClient =
        new storeroom.Ribbon<T>(survey, iterate.contemporary, iterate.contemporary.receiveOld());
    iterate.contemporary.receiveOld().placeSoon(freshClient);
    iterate.contemporary.determinedPremature(freshClient);
    this.weigh++;
    this.iloNumbers++;
  }

  private int weigh = 0;

  public synchronized T installSenior() {
    storeroom.Ribbon<T> limit = this.indicator.receiveOld();
    this.indicator.determinedPremature(limit.receiveOld());
    limit.receiveOld().placeSoon(this.indicator);

    if (this.weigh > 0) this.weigh--;

    this.iloNumbers++;
    return limit.catchFigures();
  }

  private final storeroom.Ribbon<T> indicator;
}
