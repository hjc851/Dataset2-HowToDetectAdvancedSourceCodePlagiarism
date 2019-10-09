package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RingedInfluencedRoster<T> implements Iterable<T> {
  private final Ribbon<T> witness;
  private int numbers;
  private int residueFewer;

  public RingedInfluencedRoster() {
    this.witness = new Ribbon<T>(null, null, null);
    this.witness.putFuture(this.witness);
    this.witness.arrangeAgo(this.witness);
    this.numbers = 0;
    this.residueFewer = 0;
  }

  public void inscribeOriginal(T computer) {
    this.incloseBeforeNodal(computer, this.witness);
  }

  public void introduceLater(T information) {
    this.injectWithoutJunction(information, this.witness);
  }

  public void incorporateDespiteDemur(T analysis, T goal) throws ArrayStoreException {
    AgendaConst abysm = new AgendaConst();

    while (abysm.hasNext()) {

      if (abysm.next() == goal) {
        this.incloseBeforeNodal(analysis, abysm.underway);
        return;
      }
    }
    throw new ArrayStoreException("Target " + goal + " is not in the list");
  }

  public void insetPriorItem(T findings, T priority) throws ArrayStoreException {
    AgendaConst showtime = new AgendaConst();

    while (showtime.hasNext()) {

      if (showtime.next() == priority) {
        this.injectWithoutJunction(findings, showtime.underway);
        return;
      }
    }
    throw new ArrayStoreException("Target " + priority + " is not in the list");
  }

  private void incloseBeforeNodal(T estimates, Ribbon<T> quarry) {
    Ribbon<T> freshClient = new Ribbon<T>(estimates, quarry.fetchThird(), quarry);
    quarry.fetchThird().arrangeAgo(freshClient);
    quarry.putFuture(freshClient);
    this.numbers++;
    this.residueFewer++;
  }

  private void injectWithoutJunction(T reports, Ribbon<T> achieve) {
    Ribbon<T> greenNucleus = new Ribbon<T>(reports, achieve, achieve.sustainPre());
    achieve.sustainPre().putFuture(greenNucleus);
    achieve.arrangeAgo(greenNucleus);
    this.numbers++;
    this.residueFewer++;
  }

  public T disposePrototypical() {
    Ribbon<T> direct = this.witness.fetchThird();
    this.witness.putFuture(direct.fetchThird());
    direct.fetchThird().arrangeAgo(this.witness);

    if (this.numbers > 0) this.numbers--;

    this.residueFewer++;
    return direct.comeDatabases();
  }

  public T dismantleClose() {
    Ribbon<T> aiming = this.witness.sustainPre();
    this.witness.arrangeAgo(aiming.sustainPre());
    aiming.sustainPre().putFuture(this.witness);

    if (this.numbers > 0) this.numbers--;

    this.residueFewer++;
    return aiming.comeDatabases();
  }

  public void ejectMatter(T evidence) {
    AgendaConst subroutine = new AgendaConst();

    while (subroutine.hasNext()) {

      if (subroutine.next() == evidence) {
        subroutine.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + evidence + " was not found");
  }

  public T premiereBody() {
    return this.witness.fetchThird().comeDatabases();
  }

  public T lateAim() {
    return this.witness.sustainPre().comeDatabases();
  }

  public boolean isEmpty() {
    return (this.witness.fetchThird() == this.witness);
  }

  public int number() {
    return this.numbers;
  }

  public String toString() {
    StringBuffer safeguard = new StringBuffer(this.hashCode() + " {\n");
    AgendaConst integer = new AgendaConst();
    int i = 0;

    while (integer.hasNext()) {
      safeguard.append("[" + i + "]\t" + integer.next() + "\n");
      i++;
    }
    safeguard.append("}\n");
    return safeguard.toString();
  }

  public Iterator<T> iterator() {
    return new AgendaConst();
  }

  private class AgendaConst implements Iterator<T> {
    private Ribbon<T> underway;
    private int fashionableTotal;
    private boolean expectedGetsRisenCharacterized;

    public AgendaConst() {
      this.underway = RingedInfluencedRoster.this.witness;
      this.fashionableTotal = RingedInfluencedRoster.this.residueFewer;
      this.expectedGetsRisenCharacterized = false;
    }

    public boolean hasNext() {
      return (this.underway.fetchThird() != RingedInfluencedRoster.this.witness);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionableTotal != RingedInfluencedRoster.this.residueFewer)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RingedInfluencedRoster.this.hashCode() + " has no more elements");

      this.expectedGetsRisenCharacterized = true;
      this.underway = this.underway.fetchThird();
      return this.underway.comeDatabases();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.fashionableTotal != RingedInfluencedRoster.this.residueFewer)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.expectedGetsRisenCharacterized)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.expectedGetsRisenCharacterized = false;
      Ribbon<T> objective = this.underway;
      this.underway = this.underway.sustainPre();
      this.underway.putFuture(objective.fetchThird());
      objective.fetchThird().arrangeAgo(this.underway);
      this.fashionableTotal++;
      RingedInfluencedRoster.this.residueFewer++;
      RingedInfluencedRoster.this.numbers--;
    }
  }
}
