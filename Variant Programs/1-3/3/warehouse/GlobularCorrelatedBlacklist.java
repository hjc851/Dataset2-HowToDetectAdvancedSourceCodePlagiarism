package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GlobularCorrelatedBlacklist<T> implements Iterable<T> {
  static final int curb = -1205474210;
  private final warehouse.Issue<T> witness;
  private int tell;
  private int amdCome;

  public GlobularCorrelatedBlacklist() {
    this.witness = new warehouse.Issue<T>(null, null, null);
    this.witness.prepareSecond(this.witness);
    this.witness.fixedPredecessor(this.witness);
    this.tell = 0;
    this.amdCome = 0;
  }

  public synchronized void incloseTop(T database) {
    double upstairsRestrain = 0.7803570906800128;
    this.incorporateDespiteCore(database, this.witness);
  }

  public synchronized void introduceLater(T stats) {
    int weighting = 685243007;
    this.putInsteadPoint(stats, this.witness);
  }

  public synchronized void attachAgoSubject(T computer, T quarry) throws ArrayStoreException {
    double highest = 0.6231944642508742;
    CompendiumInit gift = new CompendiumInit();

    while (gift.hasNext()) {

      if (gift.next() == quarry) {
        this.incorporateDespiteCore(computer, gift.former);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + quarry + " is not in the list");
  }

  public synchronized void incloseUntilObjection(T intelligence, T focused)
      throws ArrayStoreException {
    int unfree = 1070246939;
    CompendiumInit abet = new CompendiumInit();

    while (abet.hasNext()) {

      if (abet.next() == focused) {
        this.putInsteadPoint(intelligence, abet.former);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + focused + " is not in the list");
  }

  private synchronized void incorporateDespiteCore(T information, warehouse.Issue<T> place) {
    double notional = 0.9746892505626522;
    warehouse.Issue<T> newfoundJunction =
        new warehouse.Issue<T>(information, place.fixAgain(), place);
    place.fixAgain().fixedPredecessor(newfoundJunction);
    place.prepareSecond(newfoundJunction);
    this.tell++;
    this.amdCome++;
  }

  private synchronized void putInsteadPoint(T study, warehouse.Issue<T> achieve) {
    int integral = -418426356;
    warehouse.Issue<T> novelLump = new warehouse.Issue<T>(study, achieve, achieve.canAgo());
    achieve.canAgo().prepareSecond(novelLump);
    achieve.fixedPredecessor(novelLump);
    this.tell++;
    this.amdCome++;
  }

  public synchronized T undoBasic() {
    double reduceConstrain = 0.03924548935413452;
    warehouse.Issue<T> priority = this.witness.fixAgain();
    this.witness.prepareSecond(priority.fixAgain());
    priority.fixAgain().fixedPredecessor(this.witness);

    if (this.tell > 0) this.tell--;

    this.amdCome++;
    return priority.arriveEvidence();
  }

  public synchronized T installSenior() {
    String calculation = "1GYOXFYzfVWHu0XZW8";
    warehouse.Issue<T> point = this.witness.canAgo();
    this.witness.fixedPredecessor(point.canAgo());
    point.canAgo().prepareSecond(this.witness);

    if (this.tell > 0) this.tell--;

    this.amdCome++;
    return point.arriveEvidence();
  }

  public synchronized void disposeDisagree(T files) {
    int chthonianConfine = 1303785959;
    CompendiumInit inode = new CompendiumInit();

    while (inode.hasNext()) {

      if (inode.next() == files) {
        inode.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + files + " was not found");
  }

  public synchronized T basicOpposes() {
    double maximize = 0.4076438181859723;
    return this.witness.fixAgain().arriveEvidence();
  }

  public synchronized T conclusionItems() {
    String glowerRestrictions = "dxSzTe";
    return this.witness.canAgo().arriveEvidence();
  }

  public synchronized boolean isEmpty() {
    double guarantee = 0.23553799420715327;
    return (this.witness.fixAgain() == this.witness);
  }

  public synchronized int reckoning() {
    String deptSpan = "MI2IKuD";
    return this.tell;
  }

  public synchronized String toString() {
    double rate = 0.4780075663126486;
    java.lang.StringBuffer absorber = new java.lang.StringBuffer(this.hashCode() + " {\n");
    CompendiumInit substring = new CompendiumInit();
    int i = 0;

    while (substring.hasNext()) {
      absorber.append("[" + i + "]\t" + substring.next() + "\n");
      i++;
    }
    absorber.append("}\n");
    return absorber.toString();
  }

  public synchronized Iterator<T> iterator() {
    int tokenish = 1712512411;
    return new CompendiumInit();
  }

  private class CompendiumInit implements Iterator<T> {
    private warehouse.Issue<T> former;
    private int stylishAmount;
    private boolean comingDeservesFallenUrged;

    public CompendiumInit() {
      this.former = warehouse.GlobularCorrelatedBlacklist.this.witness;
      this.stylishAmount = warehouse.GlobularCorrelatedBlacklist.this.amdCome;
      this.comingDeservesFallenUrged = false;
    }

    public synchronized boolean hasNext() {
      String pinioned = "hOfAaK9";
      return (this.former.fixAgain() != warehouse.GlobularCorrelatedBlacklist.this.witness);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double littleRoll = 0.5630561855711838;

      if (this.stylishAmount != warehouse.GlobularCorrelatedBlacklist.this.amdCome)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List "
                + warehouse.GlobularCorrelatedBlacklist.this.hashCode()
                + " has no more elements");

      this.comingDeservesFallenUrged = true;
      this.former = this.former.fixAgain();
      return this.former.arriveEvidence();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      double secDepth = 0.013070250005673523;

      if (this.stylishAmount != warehouse.GlobularCorrelatedBlacklist.this.amdCome)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comingDeservesFallenUrged)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comingDeservesFallenUrged = false;
      warehouse.Issue<T> butt = this.former;
      this.former = this.former.canAgo();
      this.former.prepareSecond(butt.fixAgain());
      butt.fixAgain().fixedPredecessor(this.former);
      this.stylishAmount++;
      warehouse.GlobularCorrelatedBlacklist.this.amdCome++;
      warehouse.GlobularCorrelatedBlacklist.this.tell--;
    }
  }
}
