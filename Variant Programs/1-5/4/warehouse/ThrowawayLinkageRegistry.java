package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ThrowawayLinkageRegistry<T> implements Iterable<T> {
  public int calculate;

  public synchronized void injectedEldest(T results) {
    this.injectPriorJunction(results, this.guerite);
  }

  public final warehouse.Junction<T> guerite;

  public synchronized boolean isEmpty() {
    return (this.guerite.takeLater() == this.guerite);
  }

  public synchronized void deleteBody(T readings) {
    DirectoryBool namespace = new DirectoryBool();

    while (namespace.hasNext()) {

      if (namespace.next() == readings) {
        namespace.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + readings + " was not found"));
  }

  public synchronized T laterTarget() {
    return this.guerite.receiveOld().fetchTabulations();
  }

  public synchronized T absentLate() {
    warehouse.Junction<T> mark = this.guerite.receiveOld();
    this.guerite.doFinal(mark.receiveOld());
    mark.receiveOld().adjustExpected(this.guerite);

    if (this.calculate > 0) this.calculate--;

    this.braveNumerous++;
    return mark.fetchTabulations();
  }

  public synchronized Iterator<T> iterator() {
    return new DirectoryBool();
  }

  public synchronized void attachBeforehandHub(T stats, warehouse.Junction<T> aiming) {
    warehouse.Junction<T> earlyHitch =
        new warehouse.Junction<T>(stats, aiming, aiming.receiveOld());
    aiming.receiveOld().adjustExpected(earlyHitch);
    aiming.doFinal(earlyHitch);
    this.calculate++;
    this.braveNumerous++;
  }

  public synchronized int enumeration() {
    return this.calculate;
  }

  public synchronized T bestSubject() {
    return this.guerite.takeLater().fetchTabulations();
  }

  public synchronized void infixEnd(T files) {
    this.attachBeforehandHub(files, this.guerite);
  }

  public ThrowawayLinkageRegistry() {
    this.guerite = (new warehouse.Junction<T>(null, null, null));
    this.guerite.adjustExpected(this.guerite);
    this.guerite.doFinal(this.guerite);
    this.calculate = (0);
    this.braveNumerous = (0);
  }

  public int braveNumerous;

  public synchronized void injectingAgoVictim(T evidence, T achieve) throws ArrayStoreException {
    DirectoryBool prove = new DirectoryBool();

    while (prove.hasNext()) {

      if (prove.next() == achieve) {
        this.attachBeforehandHub(evidence, prove.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Target " + achieve + " is not in the list"));
  }

  public synchronized String toString() {
    java.lang.StringBuffer fender = new java.lang.StringBuffer(this.hashCode() + " {\n");
    DirectoryBool inode = new DirectoryBool();
    int i = 0;

    while (inode.hasNext()) {
      fender.append(("[" + i + "]\t" + inode.next() + "\n"));
      i++;
    }
    fender.append("}\n");
    return fender.toString();
  }

  public synchronized void injectedWakeMatter(T database, T focusing) throws ArrayStoreException {
    DirectoryBool abyss = new DirectoryBool();

    while (abyss.hasNext()) {

      if (abyss.next() == focusing) {
        this.injectPriorJunction(database, abyss.actual);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Target " + focusing + " is not in the list"));
  }

  public class DirectoryBool implements Iterator<T> {
    public boolean firstNeedsBegunNicknamed;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.chicFigure != warehouse.ThrowawayLinkageRegistry.this.braveNumerous)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List "
                + warehouse.ThrowawayLinkageRegistry.this.hashCode()
                + " has no more elements"));

      this.firstNeedsBegunNicknamed = (true);
      this.actual = (this.actual.takeLater());
      return this.actual.fetchTabulations();
    }

    public synchronized boolean hasNext() {
      return (this.actual.takeLater() != warehouse.ThrowawayLinkageRegistry.this.guerite);
    }

    public int chicFigure;
    public warehouse.Junction<T> actual;

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.chicFigure != warehouse.ThrowawayLinkageRegistry.this.braveNumerous)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.firstNeedsBegunNicknamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = (false);
      warehouse.Junction<T> prey = this.actual;
      this.actual = (this.actual.receiveOld());
      this.actual.adjustExpected(prey.takeLater());
      prey.takeLater().doFinal(this.actual);
      this.chicFigure++;
      warehouse.ThrowawayLinkageRegistry.this.braveNumerous++;
      warehouse.ThrowawayLinkageRegistry.this.calculate--;
    }

    public DirectoryBool() {
      this.actual = (warehouse.ThrowawayLinkageRegistry.this.guerite);
      this.chicFigure = (warehouse.ThrowawayLinkageRegistry.this.braveNumerous);
      this.firstNeedsBegunNicknamed = (false);
    }
  }

  public synchronized T transferInaugural() {
    warehouse.Junction<T> quarry = this.guerite.takeLater();
    this.guerite.adjustExpected(quarry.takeLater());
    quarry.takeLater().doFinal(this.guerite);

    if (this.calculate > 0) this.calculate--;

    this.braveNumerous++;
    return quarry.fetchTabulations();
  }

  public synchronized void injectPriorJunction(T estimates, warehouse.Junction<T> threshold) {
    warehouse.Junction<T> untriedHub =
        new warehouse.Junction<T>(estimates, threshold.takeLater(), threshold);
    threshold.takeLater().doFinal(untriedHub);
    threshold.adjustExpected(untriedHub);
    this.calculate++;
    this.braveNumerous++;
  }
}
