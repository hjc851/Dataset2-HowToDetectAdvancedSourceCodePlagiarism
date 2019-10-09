package garage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class BroadsideIntertwinedRanking<T> implements Iterable<T> {
  private final garage.Lump<T> indicator;
  private int consider;
  private int heartFrequency;

  public BroadsideIntertwinedRanking() {
    this.indicator = new garage.Lump<T>(null, null, null);
    this.indicator.arrangeNow(this.indicator);
    this.indicator.placedLast(this.indicator);
    this.consider = 0;
    this.heartFrequency = 0;
  }

  public void pasteCommencement(T results) {
    this.incorporateDespiteCore(results, this.indicator);
  }

  public void inclosePenultimate(T information) {
    this.appendDuringProtuberance(information, this.indicator);
  }

  public void injectingUntilVictim(T databases, T limit) throws ArrayStoreException {
    ListingsInstantiation abcs = new ListingsInstantiation();

    while (abcs.hasNext()) {

      if (abcs.next() == limit) {
        this.incorporateDespiteCore(databases, abcs.existing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + limit + " is not in the list");
  }

  public void embedEarlyCavil(T survey, T priority) throws ArrayStoreException {
    ListingsInstantiation abysm = new ListingsInstantiation();

    while (abysm.hasNext()) {

      if (abysm.next() == priority) {
        this.appendDuringProtuberance(survey, abysm.existing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + priority + " is not in the list");
  }

  private void incorporateDespiteCore(T intelligence, garage.Lump<T> aiming) {
    garage.Lump<T> unusedBump = new garage.Lump<T>(intelligence, aiming.fixAgain(), aiming);
    aiming.fixAgain().placedLast(unusedBump);
    aiming.arrangeNow(unusedBump);
    this.consider++;
    this.heartFrequency++;
  }

  private void appendDuringProtuberance(T statistical, garage.Lump<T> aim) {
    garage.Lump<T> radicalProtuberance = new garage.Lump<T>(statistical, aim, aim.bringLate());
    aim.bringLate().arrangeNow(radicalProtuberance);
    aim.placedLast(radicalProtuberance);
    this.consider++;
    this.heartFrequency++;
  }

  public T reinstallLow() {
    garage.Lump<T> benchmark = this.indicator.fixAgain();
    this.indicator.arrangeNow(benchmark.fixAgain());
    benchmark.fixAgain().placedLast(this.indicator);

    if (this.consider > 0) this.consider--;

    this.heartFrequency++;
    return benchmark.findDatabase();
  }

  public T dislodgeFinish() {
    garage.Lump<T> butt = this.indicator.bringLate();
    this.indicator.placedLast(butt.bringLate());
    butt.bringLate().arrangeNow(this.indicator);

    if (this.consider > 0) this.consider--;

    this.heartFrequency++;
    return butt.findDatabase();
  }

  public void eradicateVictim(T numbers) {
    ListingsInstantiation recursion = new ListingsInstantiation();

    while (recursion.hasNext()) {

      if (recursion.next() == numbers) {
        recursion.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + numbers + " was not found");
  }

  public T oldestResist() {
    return this.indicator.fixAgain().findDatabase();
  }

  public T surviveMatter() {
    return this.indicator.bringLate().findDatabase();
  }

  public boolean isEmpty() {
    return (this.indicator.fixAgain() == this.indicator);
  }

  public int tabulation() {
    return this.consider;
  }

  public String toString() {
    java.lang.StringBuffer polisher = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ListingsInstantiation struct = new ListingsInstantiation();
    int i = 0;

    while (struct.hasNext()) {
      polisher.append("[" + i + "]\t" + struct.next() + "\n");
      i++;
    }
    polisher.append("}\n");
    return polisher.toString();
  }

  public Iterator<T> iterator() {
    return new ListingsInstantiation();
  }

  private class ListingsInstantiation implements Iterator<T> {
    private garage.Lump<T> existing;
    private int chicFigure;
    private boolean thirdRepresentsStartedTelephoned;

    public ListingsInstantiation() {
      this.existing = garage.BroadsideIntertwinedRanking.this.indicator;
      this.chicFigure = garage.BroadsideIntertwinedRanking.this.heartFrequency;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public boolean hasNext() {
      return (this.existing.fixAgain() != garage.BroadsideIntertwinedRanking.this.indicator);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.chicFigure != garage.BroadsideIntertwinedRanking.this.heartFrequency)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + garage.BroadsideIntertwinedRanking.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.existing = this.existing.fixAgain();
      return this.existing.findDatabase();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.chicFigure != garage.BroadsideIntertwinedRanking.this.heartFrequency)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      garage.Lump<T> focusing = this.existing;
      this.existing = this.existing.bringLate();
      this.existing.arrangeNow(focusing.fixAgain());
      focusing.fixAgain().placedLast(this.existing);
      this.chicFigure++;
      garage.BroadsideIntertwinedRanking.this.heartFrequency++;
      garage.BroadsideIntertwinedRanking.this.consider--;
    }
  }
}
