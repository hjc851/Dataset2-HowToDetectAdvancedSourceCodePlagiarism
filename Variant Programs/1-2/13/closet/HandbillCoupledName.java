package closet;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class HandbillCoupledName<T> implements Iterable<T> {
  private final closet.Carrefour<T> picket;
  private int get;
  private int chicFigure;

  public HandbillCoupledName() {
    this.picket = new closet.Carrefour<T>(null, null, null);
    this.picket.rigidCome(this.picket);
    this.picket.bentOriginal(this.picket);
    this.get = 0;
    this.chicFigure = 0;
  }

  public void incorporateFreshman(T readings) {
    this.embeddedThereafterLump(readings, this.picket);
  }

  public void insetWorst(T measurements) {
    this.inscribeSoonRibbon(measurements, this.picket);
  }

  public void incloseBeforeObjection(T statistical, T objective) throws ArrayStoreException {
    LeanInitialize abet = new LeanInitialize();

    while (abet.hasNext()) {

      if (abet.next() == objective) {
        this.embeddedThereafterLump(statistical, abet.topical);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + objective + " is not in the list");
  }

  public void infixThenArtefact(T survey, T focusing) throws ArrayStoreException {
    LeanInitialize law = new LeanInitialize();

    while (law.hasNext()) {

      if (law.next() == focusing) {
        this.inscribeSoonRibbon(survey, law.topical);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + focusing + " is not in the list");
  }

  private void embeddedThereafterLump(T stats, closet.Carrefour<T> aiming) {
    closet.Carrefour<T> revolutionaryGanglia =
        new closet.Carrefour<T>(stats, aiming.makeAdjacent(), aiming);
    aiming.makeAdjacent().bentOriginal(revolutionaryGanglia);
    aiming.rigidCome(revolutionaryGanglia);
    this.get++;
    this.chicFigure++;
  }

  private void inscribeSoonRibbon(T intelligence, closet.Carrefour<T> place) {
    closet.Carrefour<T> originalAntenna =
        new closet.Carrefour<T>(intelligence, place, place.becomePredecessor());
    place.becomePredecessor().rigidCome(originalAntenna);
    place.bentOriginal(originalAntenna);
    this.get++;
    this.chicFigure++;
  }

  public T yankCommencement() {
    closet.Carrefour<T> benchmark = this.picket.makeAdjacent();
    this.picket.rigidCome(benchmark.makeAdjacent());
    benchmark.makeAdjacent().bentOriginal(this.picket);

    if (this.get > 0) this.get--;

    this.chicFigure++;
    return benchmark.catchFigures();
  }

  public T reinstallHigh() {
    closet.Carrefour<T> aim = this.picket.becomePredecessor();
    this.picket.bentOriginal(aim.becomePredecessor());
    aim.becomePredecessor().rigidCome(this.picket);

    if (this.get > 0) this.get--;

    this.chicFigure++;
    return aim.catchFigures();
  }

  public void reinstallThing(T records) {
    LeanInitialize substring = new LeanInitialize();

    while (substring.hasNext()) {

      if (substring.next() == records) {
        substring.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + records + " was not found");
  }

  public T prototypicalDisagree() {
    return this.picket.makeAdjacent().catchFigures();
  }

  public T closeDemur() {
    return this.picket.becomePredecessor().catchFigures();
  }

  public boolean isEmpty() {
    return (this.picket.makeAdjacent() == this.picket);
  }

  public int tally() {
    return this.get;
  }

  public String toString() {
    java.lang.StringBuffer spacer = new java.lang.StringBuffer(this.hashCode() + " {\n");
    LeanInitialize instantiation = new LeanInitialize();
    int i = 0;

    while (instantiation.hasNext()) {
      spacer.append("[" + i + "]\t" + instantiation.next() + "\n");
      i++;
    }
    spacer.append("}\n");
    return spacer.toString();
  }

  public Iterator<T> iterator() {
    return new LeanInitialize();
  }

  private class LeanInitialize implements Iterator<T> {
    private closet.Carrefour<T> topical;
    private int heartFrequency;
    private boolean laterKnowsSeenLaunched;

    public LeanInitialize() {
      this.topical = closet.HandbillCoupledName.this.picket;
      this.heartFrequency = closet.HandbillCoupledName.this.chicFigure;
      this.laterKnowsSeenLaunched = false;
    }

    public boolean hasNext() {
      return (this.topical.makeAdjacent() != closet.HandbillCoupledName.this.picket);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.heartFrequency != closet.HandbillCoupledName.this.chicFigure)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + closet.HandbillCoupledName.this.hashCode() + " has no more elements");

      this.laterKnowsSeenLaunched = true;
      this.topical = this.topical.makeAdjacent();
      return this.topical.catchFigures();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.heartFrequency != closet.HandbillCoupledName.this.chicFigure)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.laterKnowsSeenLaunched)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.laterKnowsSeenLaunched = false;
      closet.Carrefour<T> mark = this.topical;
      this.topical = this.topical.becomePredecessor();
      this.topical.rigidCome(mark.makeAdjacent());
      mark.makeAdjacent().bentOriginal(this.topical);
      this.heartFrequency++;
      closet.HandbillCoupledName.this.chicFigure++;
      closet.HandbillCoupledName.this.get--;
    }
  }
}
