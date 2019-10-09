package repository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AnnulateAttributableCatalog<T> implements Iterable<T> {
  private final repository.Core<T> sentry;
  private int figure = 0;
  private int modeEnumerate = 0;

  public AnnulateAttributableCatalog() {
    this.sentry = new repository.Core<T>(null, null, null);
    this.sentry.fitComing(this.sentry);
    this.sentry.fixedPredecessor(this.sentry);
    this.figure = 0;
    this.modeEnumerate = 0;
  }

  public synchronized void integratePrototypical(T indicators) {
    this.inscribingOverProblem(indicators, this.sentry);
  }

  public synchronized void insetWorst(T figures) {
    this.encloseAfterGuest(figures, this.sentry);
  }

  public synchronized void pasteLateTotem(T computer, T point) throws ArrayStoreException {
    PlaylistParser abysm = new PlaylistParser();

    while (abysm.hasNext()) {

      if (abysm.next() == point) {
        this.inscribingOverProblem(computer, abysm.rife);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + point + " is not in the list");
  }

  public synchronized void injectedLateMatter(T information, T focused) throws ArrayStoreException {
    PlaylistParser above = new PlaylistParser();

    while (above.hasNext()) {

      if (above.next() == focused) {
        this.encloseAfterGuest(information, above.rife);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + focused + " is not in the list");
  }

  private synchronized void inscribingOverProblem(T database, repository.Core<T> aiming) {
    repository.Core<T> freshlyGanglion =
        new repository.Core<T>(database, aiming.takeLater(), aiming);
    aiming.takeLater().fixedPredecessor(freshlyGanglion);
    aiming.fitComing(freshlyGanglion);
    this.figure++;
    this.modeEnumerate++;
  }

  private synchronized void encloseAfterGuest(T study, repository.Core<T> goals) {
    repository.Core<T> refreshingRibbon = new repository.Core<T>(study, goals, goals.startLatest());
    goals.startLatest().fitComing(refreshingRibbon);
    goals.fixedPredecessor(refreshingRibbon);
    this.figure++;
    this.modeEnumerate++;
  }

  public synchronized T withdrawKickoff() {
    repository.Core<T> butt = this.sentry.takeLater();
    this.sentry.fitComing(butt.takeLater());
    butt.takeLater().fixedPredecessor(this.sentry);

    if (this.figure > 0) this.figure--;

    this.modeEnumerate++;
    return butt.drawStats();
  }

  public synchronized T dispatchWorst() {
    repository.Core<T> focus = this.sentry.startLatest();
    this.sentry.fixedPredecessor(focus.startLatest());
    focus.startLatest().fitComing(this.sentry);

    if (this.figure > 0) this.figure--;

    this.modeEnumerate++;
    return focus.drawStats();
  }

  public synchronized void dislodgeOppose(T records) {
    PlaylistParser inode = new PlaylistParser();

    while (inode.hasNext()) {

      if (inode.next() == records) {
        inode.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + records + " was not found");
  }

  public synchronized T beginningObjective() {
    return this.sentry.takeLater().drawStats();
  }

  public synchronized T pastObjective() {
    return this.sentry.startLatest().drawStats();
  }

  public synchronized boolean isEmpty() {
    return (this.sentry.takeLater() == this.sentry);
  }

  public synchronized int charge() {
    return this.figure;
  }

  public synchronized String toString() {
    java.lang.StringBuffer cushioning = new java.lang.StringBuffer(this.hashCode() + " {\n");
    PlaylistParser malloc = new PlaylistParser();
    int i = 0;

    while (malloc.hasNext()) {
      cushioning.append("[" + i + "]\t" + malloc.next() + "\n");
      i++;
    }
    cushioning.append("}\n");
    return cushioning.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new PlaylistParser();
  }

  private class PlaylistParser implements Iterator<T> {
    private repository.Core<T> rife = null;
    private int modernList = 0;
    private boolean firstNeedsBegunNicknamed = false;

    public PlaylistParser() {
      this.rife = repository.AnnulateAttributableCatalog.this.sentry;
      this.modernList = repository.AnnulateAttributableCatalog.this.modeEnumerate;
      this.firstNeedsBegunNicknamed = false;
    }

    public synchronized boolean hasNext() {
      return (this.rife.takeLater() != repository.AnnulateAttributableCatalog.this.sentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.modernList != repository.AnnulateAttributableCatalog.this.modeEnumerate)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List "
                + repository.AnnulateAttributableCatalog.this.hashCode()
                + " has no more elements");

      this.firstNeedsBegunNicknamed = true;
      this.rife = this.rife.takeLater();
      return this.rife.drawStats();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.modernList != repository.AnnulateAttributableCatalog.this.modeEnumerate)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.firstNeedsBegunNicknamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.firstNeedsBegunNicknamed = false;
      repository.Core<T> threshold = this.rife;
      this.rife = this.rife.startLatest();
      this.rife.fitComing(threshold.takeLater());
      threshold.takeLater().fixedPredecessor(this.rife);
      this.modernList++;
      repository.AnnulateAttributableCatalog.this.modeEnumerate++;
      repository.AnnulateAttributableCatalog.this.figure--;
    }
  }
}
