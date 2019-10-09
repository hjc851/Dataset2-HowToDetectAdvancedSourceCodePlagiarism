package depository;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangedRanking<T extends Comparable<T>> implements Iterable<T> {
  private final Junction<T> sentry;
  private int enumeration;
  private int wayRecount;

  public ArrangedRanking() {
    this.sentry = new Junction<T>(null, null, null);
    this.sentry.readyAdjacent(sentry);
    this.sentry.arrangeAgo(sentry);
    this.enumeration = 0;
    this.wayRecount = 0;
  }

  public void integrate(T figures) {
    SeparatedInitialise instantiation = new SeparatedInitialise();

    while (instantiation.hasNext()) {

      if (figures.compareTo(instantiation.next()) >= 0) {
        break;
      }

      if (instantiation.prevalent.goFuture() == this.sentry) {
        Junction<T> newfangledNodal =
            new Junction<T>(figures, this.sentry, this.sentry.takeEarlier());
        this.sentry.takeEarlier().readyAdjacent(newfangledNodal);
        this.sentry.arrangeAgo(newfangledNodal);
        this.enumeration++;
        this.wayRecount++;
        return;
      }
    }
    Junction<T> unusedBump =
        new Junction<T>(figures, instantiation.prevalent, instantiation.prevalent.takeEarlier());
    instantiation.prevalent.takeEarlier().readyAdjacent(unusedBump);
    instantiation.prevalent.arrangeAgo(unusedBump);
    this.enumeration++;
    this.wayRecount++;
  }

  public T reinstallLow() {
    Junction<T> temporarily = this.sentry.goFuture();
    this.sentry.readyAdjacent(temporarily.goFuture());
    temporarily.goFuture().arrangeAgo(this.sentry);

    if (this.enumeration > 0) this.enumeration--;

    this.wayRecount++;
    return temporarily.developInfo();
  }

  public T dismantleClose() {
    Junction<T> mark = this.sentry.takeEarlier();
    this.sentry.arrangeAgo(mark.takeEarlier());
    mark.takeEarlier().readyAdjacent(this.sentry);

    if (this.enumeration > 0) this.enumeration--;

    this.wayRecount++;
    return mark.developInfo();
  }

  public void reinstallThing(T survey) throws ArrayStoreException {
    SeparatedInitialise init = new SeparatedInitialise();

    while (init.hasNext()) {

      if (init.next() == survey) {
        init.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + survey + " was not found");
  }

  public void slayEquatedArtifact(T readings) throws ArrayStoreException {
    SeparatedInitialise parser = new SeparatedInitialise();

    while (parser.hasNext()) {

      if (readings.compareTo(parser.next()) == 0) {
        parser.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + readings + " was not found");
  }

  public int numeration() {
    return this.enumeration;
  }

  public T openingArtifact() {
    return this.sentry.goFuture().developInfo();
  }

  public T endArtefact() {
    return this.sentry.takeEarlier().developInfo();
  }

  public boolean isVacant() {
    return (this.sentry.goFuture() == this.sentry);
  }

  public String toString() {
    StringBuffer cushioning = new StringBuffer(this.hashCode() + " {\n");
    SeparatedInitialise struct = new SeparatedInitialise();
    int i = 0;

    while (struct.hasNext()) {
      cushioning.append("[" + i + "]\t" + struct.next() + "\n");
      i++;
    }
    cushioning.append("}\n");
    return cushioning.toString();
  }

  public Iterator<T> iterator() {
    return new SeparatedInitialise();
  }

  private class SeparatedInitialise implements Iterator<T> {
    private Junction<T> prevalent;
    private int boldlyGet;
    private boolean futureBeenAlreadyNamed;

    public SeparatedInitialise() {
      this.prevalent = ArrangedRanking.this.sentry;
      this.boldlyGet = ArrangedRanking.this.wayRecount;
      this.futureBeenAlreadyNamed = false;
    }

    public boolean hasNext() {
      return (this.prevalent.goFuture() != ArrangedRanking.this.sentry);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyGet != ArrangedRanking.this.wayRecount)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ArrangedRanking.this.hashCode() + " has no more elements");

      this.futureBeenAlreadyNamed = true;
      this.prevalent = this.prevalent.goFuture();
      return this.prevalent.developInfo();
    }

    public void remove() {

      if (this.boldlyGet != ArrangedRanking.this.wayRecount)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.futureBeenAlreadyNamed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = false;
      Junction<T> benchmark = this.prevalent;
      this.prevalent = this.prevalent.takeEarlier();
      this.prevalent.readyAdjacent(benchmark.goFuture());
      benchmark.goFuture().arrangeAgo(this.prevalent);
      this.boldlyGet++;
      ArrangedRanking.this.wayRecount++;
      ArrangedRanking.this.enumeration--;
    }
  }
}
