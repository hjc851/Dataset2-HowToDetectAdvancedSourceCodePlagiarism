package disk;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CollatedBlacklist<T extends Comparable<T>> implements Iterable<T> {
  private final Hitch<T> witness;
  private int recount;
  private int pentagonReckon;

  public CollatedBlacklist() {
    this.witness = new Hitch<T>(null, null, null);
    this.witness.settledFirst(witness);
    this.witness.arrangedEarly(witness);
    this.recount = 0;
    this.pentagonReckon = 0;
  }

  public void injected(T figures) {
    ConsultedConst integer = new ConsultedConst();

    while (integer.hasNext()) {

      if (figures.compareTo(integer.next()) >= 0) {
        break;
      }

      if (integer.ongoing.startForthcoming() == this.witness) {
        Hitch<T> earlyHitch = new Hitch<T>(figures, this.witness, this.witness.makeFormer());
        this.witness.makeFormer().settledFirst(earlyHitch);
        this.witness.arrangedEarly(earlyHitch);
        this.recount++;
        this.pentagonReckon++;
        return;
      }
    }
    Hitch<T> newfangledNodal = new Hitch<T>(figures, integer.ongoing, integer.ongoing.makeFormer());
    integer.ongoing.makeFormer().settledFirst(newfangledNodal);
    integer.ongoing.arrangedEarly(newfangledNodal);
    this.recount++;
    this.pentagonReckon++;
  }

  public T absentInitial() {
    Hitch<T> temperature = this.witness.startForthcoming();
    this.witness.settledFirst(temperature.startForthcoming());
    temperature.startForthcoming().arrangedEarly(this.witness);

    if (this.recount > 0) this.recount--;

    this.pentagonReckon++;
    return temperature.driveIntelligence();
  }

  public T dismantleClose() {
    Hitch<T> achieve = this.witness.makeFormer();
    this.witness.arrangedEarly(achieve.makeFormer());
    achieve.makeFormer().settledFirst(this.witness);

    if (this.recount > 0) this.recount--;

    this.pentagonReckon++;
    return achieve.driveIntelligence();
  }

  public void hitObjection(T databases) throws ArrayStoreException {
    ConsultedConst operand = new ConsultedConst();

    while (operand.hasNext()) {

      if (operand.next() == databases) {
        operand.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + databases + " was not found");
  }

  public void eradicateAgainstVictim(T estimates) throws ArrayStoreException {
    ConsultedConst pathname = new ConsultedConst();

    while (pathname.hasNext()) {

      if (estimates.compareTo(pathname.next()) == 0) {
        pathname.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + estimates + " was not found");
  }

  public int number() {
    return this.recount;
  }

  public T prototypicalDisagree() {
    return this.witness.startForthcoming().driveIntelligence();
  }

  public T endArtefact() {
    return this.witness.makeFormer().driveIntelligence();
  }

  public boolean isVacant() {
    return (this.witness.startForthcoming() == this.witness);
  }

  public String toString() {
    StringBuffer separating = new StringBuffer(this.hashCode() + " {\n");
    ConsultedConst malloc = new ConsultedConst();
    int i = 0;

    while (malloc.hasNext()) {
      separating.append("[" + i + "]\t" + malloc.next() + "\n");
      i++;
    }
    separating.append("}\n");
    return separating.toString();
  }

  public Iterator<T> iterator() {
    return new ConsultedConst();
  }

  private class ConsultedConst implements Iterator<T> {
    private Hitch<T> ongoing;
    private int wayRecount;
    private boolean secondOwnsBecomePhoned;

    public ConsultedConst() {
      this.ongoing = CollatedBlacklist.this.witness;
      this.wayRecount = CollatedBlacklist.this.pentagonReckon;
      this.secondOwnsBecomePhoned = false;
    }

    public boolean hasNext() {
      return (this.ongoing.startForthcoming() != CollatedBlacklist.this.witness);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.wayRecount != CollatedBlacklist.this.pentagonReckon)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + CollatedBlacklist.this.hashCode() + " has no more elements");

      this.secondOwnsBecomePhoned = true;
      this.ongoing = this.ongoing.startForthcoming();
      return this.ongoing.driveIntelligence();
    }

    public void remove() {

      if (this.wayRecount != CollatedBlacklist.this.pentagonReckon)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.secondOwnsBecomePhoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.secondOwnsBecomePhoned = false;
      Hitch<T> aiming = this.ongoing;
      this.ongoing = this.ongoing.makeFormer();
      this.ongoing.settledFirst(aiming.startForthcoming());
      aiming.startForthcoming().arrangedEarly(this.ongoing);
      this.wayRecount++;
      CollatedBlacklist.this.pentagonReckon++;
      CollatedBlacklist.this.recount--;
    }
  }
}
