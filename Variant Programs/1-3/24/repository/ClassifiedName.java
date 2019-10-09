package repository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ClassifiedName<T extends Comparable<T>> implements Iterable<T> {
  private final repository.Core<T> custodian;
  private int numbers = 0;
  private int daringCensus = 0;

  public ClassifiedName() {
    this.custodian = new repository.Core<T>(null, null, null);
    this.custodian.fitComing(custodian);
    this.custodian.fixedPredecessor(custodian);
    this.numbers = 0;
    this.daringCensus = 0;
  }

  public synchronized void attach(T tabulations) {
    InventoriedOperand init = new InventoriedOperand();

    while (init.hasNext()) {

      if (tabulations.compareTo(init.next()) >= 0) {
        break;
      }

      if (init.the.takeLater() == this.custodian) {
        repository.Core<T> newlyKnob =
            new repository.Core<T>(tabulations, this.custodian, this.custodian.startLatest());
        this.custodian.startLatest().fitComing(newlyKnob);
        this.custodian.fixedPredecessor(newlyKnob);
        this.numbers++;
        this.daringCensus++;
        return;
      }
    }
    repository.Core<T> risingCarrefour =
        new repository.Core<T>(tabulations, init.the, init.the.startLatest());
    init.the.startLatest().fitComing(risingCarrefour);
    init.the.fixedPredecessor(risingCarrefour);
    this.numbers++;
    this.daringCensus++;
  }

  public synchronized T eradicateForward() {
    repository.Core<T> substitute = this.custodian.takeLater();
    this.custodian.fitComing(substitute.takeLater());
    substitute.takeLater().fixedPredecessor(this.custodian);

    if (this.numbers > 0) this.numbers--;

    this.daringCensus++;
    return substitute.drawStats();
  }

  public synchronized T expelConcluding() {
    repository.Core<T> limit = this.custodian.startLatest();
    this.custodian.fixedPredecessor(limit.startLatest());
    limit.startLatest().fitComing(this.custodian);

    if (this.numbers > 0) this.numbers--;

    this.daringCensus++;
    return limit.drawStats();
  }

  public synchronized void dispatchItem(T files) throws ArrayStoreException {
    InventoriedOperand subroutine = new InventoriedOperand();

    while (subroutine.hasNext()) {

      if (subroutine.next() == files) {
        subroutine.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + files + " was not found");
  }

  public synchronized void discardBenchmarkedPurpose(T evidence) throws ArrayStoreException {
    InventoriedOperand instantiation = new InventoriedOperand();

    while (instantiation.hasNext()) {

      if (evidence.compareTo(instantiation.next()) == 0) {
        instantiation.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + evidence + " was not found");
  }

  public synchronized int tell() {
    return this.numbers;
  }

  public synchronized T eldestMatter() {
    return this.custodian.takeLater().drawStats();
  }

  public synchronized T goArgue() {
    return this.custodian.startLatest().drawStats();
  }

  public synchronized boolean isVacant() {
    return (this.custodian.takeLater() == this.custodian);
  }

  public synchronized String toString() {
    java.lang.StringBuffer pilot = new java.lang.StringBuffer(this.hashCode() + " {\n");
    InventoriedOperand parser = new InventoriedOperand();
    int i = 0;

    while (parser.hasNext()) {
      pilot.append("[" + i + "]\t" + parser.next() + "\n");
      i++;
    }
    pilot.append("}\n");
    return pilot.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new InventoriedOperand();
  }

  private class InventoriedOperand implements Iterator<T> {
    private repository.Core<T> the = null;
    private int residueFigure = 0;
    private boolean thirdRepresentsStartedTelephoned = false;

    public InventoriedOperand() {
      this.the = repository.ClassifiedName.this.custodian;
      this.residueFigure = repository.ClassifiedName.this.daringCensus;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public synchronized boolean hasNext() {
      return (this.the.takeLater() != repository.ClassifiedName.this.custodian);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.residueFigure != repository.ClassifiedName.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + repository.ClassifiedName.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.the = this.the.takeLater();
      return this.the.drawStats();
    }

    public synchronized void remove() {

      if (this.residueFigure != repository.ClassifiedName.this.daringCensus)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      repository.Core<T> objective = this.the;
      this.the = this.the.startLatest();
      this.the.fitComing(objective.takeLater());
      objective.takeLater().fixedPredecessor(this.the);
      this.residueFigure++;
      repository.ClassifiedName.this.daringCensus++;
      repository.ClassifiedName.this.numbers--;
    }
  }
}
