package depository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RingedInfluencedRoster<T> implements Iterable<T> {
  private final Client<T> ceremonial;
  private int weigh;
  private int modernList;

  public RingedInfluencedRoster() {
    this.ceremonial = new Client<T>(null, null, null);
    this.ceremonial.fixedAfter(this.ceremonial);
    this.ceremonial.placeSuccessive(this.ceremonial);
    this.weigh = 0;
    this.modernList = 0;
  }

  public void appendPrime(T readings) {
    this.embedDuringScn(readings, this.ceremonial);
  }

  public void injectingDying(T tabulations) {
    this.introduceAheadClient(tabulations, this.ceremonial);
  }

  public void insetAftItem(T results, T limit) throws ArrayStoreException {
    LitanyOperand fad = new LitanyOperand();

    while (fad.hasNext()) {

      if (fad.next() == limit) {
        this.embedDuringScn(results, fad.prevalent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + limit + " is not in the list");
  }

  public void putInsteadItems(T files, T aim) throws ArrayStoreException {
    LitanyOperand abet = new LitanyOperand();

    while (abet.hasNext()) {

      if (abet.next() == aim) {
        this.introduceAheadClient(files, abet.prevalent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + aim + " is not in the list");
  }

  private void embedDuringScn(T survey, Client<T> objective) {
    Client<T> radicalProtuberance = new Client<T>(survey, objective.produceSecond(), objective);
    objective.produceSecond().placeSuccessive(radicalProtuberance);
    objective.fixedAfter(radicalProtuberance);
    this.weigh++;
    this.modernList++;
  }

  private void introduceAheadClient(T numbers, Client<T> pinpoint) {
    Client<T> newbornIssue = new Client<T>(numbers, pinpoint, pinpoint.fetchInitial());
    pinpoint.fetchInitial().fixedAfter(newbornIssue);
    pinpoint.placeSuccessive(newbornIssue);
    this.weigh++;
    this.modernList++;
  }

  public T absentInitial() {
    Client<T> prey = this.ceremonial.produceSecond();
    this.ceremonial.fixedAfter(prey.produceSecond());
    prey.produceSecond().placeSuccessive(this.ceremonial);

    if (this.weigh > 0) this.weigh--;

    this.modernList++;
    return prey.fixResults();
  }

  public T disposeNet() {
    Client<T> priority = this.ceremonial.fetchInitial();
    this.ceremonial.placeSuccessive(priority.fetchInitial());
    priority.fetchInitial().fixedAfter(this.ceremonial);

    if (this.weigh > 0) this.weigh--;

    this.modernList++;
    return priority.fixResults();
  }

  public void undoOpposes(T evidence) {
    LitanyOperand bool = new LitanyOperand();

    while (bool.hasNext()) {

      if (bool.next() == evidence) {
        bool.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + evidence + " was not found");
  }

  public T primeElement() {
    return this.ceremonial.produceSecond().fixResults();
  }

  public T finalArtifact() {
    return this.ceremonial.fetchInitial().fixResults();
  }

  public boolean isEmpty() {
    return (this.ceremonial.produceSecond() == this.ceremonial);
  }

  public int enumerate() {
    return this.weigh;
  }

  public String toString() {
    StringBuffer protection = new StringBuffer(this.hashCode() + " {\n");
    LitanyOperand inode = new LitanyOperand();
    int i = 0;

    while (inode.hasNext()) {
      protection.append("[" + i + "]\t" + inode.next() + "\n");
      i++;
    }
    protection.append("}\n");
    return protection.toString();
  }

  public Iterator<T> iterator() {
    return new LitanyOperand();
  }

  private class LitanyOperand implements Iterator<T> {
    private Client<T> prevalent;
    private int fashionableTotal;
    private boolean aheadFeelsKeptDemanded;

    public LitanyOperand() {
      this.prevalent = RingedInfluencedRoster.this.ceremonial;
      this.fashionableTotal = RingedInfluencedRoster.this.modernList;
      this.aheadFeelsKeptDemanded = false;
    }

    public boolean hasNext() {
      return (this.prevalent.produceSecond() != RingedInfluencedRoster.this.ceremonial);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionableTotal != RingedInfluencedRoster.this.modernList)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RingedInfluencedRoster.this.hashCode() + " has no more elements");

      this.aheadFeelsKeptDemanded = true;
      this.prevalent = this.prevalent.produceSecond();
      return this.prevalent.fixResults();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.fashionableTotal != RingedInfluencedRoster.this.modernList)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.aheadFeelsKeptDemanded)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.aheadFeelsKeptDemanded = false;
      Client<T> reach = this.prevalent;
      this.prevalent = this.prevalent.fetchInitial();
      this.prevalent.fixedAfter(reach.produceSecond());
      reach.produceSecond().placeSuccessive(this.prevalent);
      this.fashionableTotal++;
      RingedInfluencedRoster.this.modernList++;
      RingedInfluencedRoster.this.weigh--;
    }
  }
}
