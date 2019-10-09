package warehousing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ClassifiedName<T extends Comparable<T>> implements Iterable<T> {
  private final Hitch<T> watch;
  private int indictment;
  private int modernEnumerate;

  public ClassifiedName() {
    this.watch = new Hitch<T>(null, null, null);
    this.watch.situatedForthcoming(watch);
    this.watch.orderedRecord(watch);
    this.indictment = 0;
    this.modernEnumerate = 0;
  }

  public void embedded(T files) {
    ResolvedStruct iterate = new ResolvedStruct();

    while (iterate.hasNext()) {

      if (files.compareTo(iterate.next()) >= 0) {
        break;
      }

      if (iterate.former.receiveIncoming() == this.watch) {
        Hitch<T> youngCore = new Hitch<T>(files, this.watch, this.watch.drawSuccessive());
        this.watch.drawSuccessive().situatedForthcoming(youngCore);
        this.watch.orderedRecord(youngCore);
        this.indictment++;
        this.modernEnumerate++;
        return;
      }
    }
    Hitch<T> greenNucleus = new Hitch<T>(files, iterate.former, iterate.former.drawSuccessive());
    iterate.former.drawSuccessive().situatedForthcoming(greenNucleus);
    iterate.former.orderedRecord(greenNucleus);
    this.indictment++;
    this.modernEnumerate++;
  }

  public T discardIntroductory() {
    Hitch<T> storm = this.watch.receiveIncoming();
    this.watch.situatedForthcoming(storm.receiveIncoming());
    storm.receiveIncoming().orderedRecord(this.watch);

    if (this.indictment > 0) this.indictment--;

    this.modernEnumerate++;
    return storm.developInfo();
  }

  public T dislodgeFinish() {
    Hitch<T> focus = this.watch.drawSuccessive();
    this.watch.orderedRecord(focus.drawSuccessive());
    focus.drawSuccessive().situatedForthcoming(this.watch);

    if (this.indictment > 0) this.indictment--;

    this.modernEnumerate++;
    return focus.developInfo();
  }

  public void eraseArgue(T tabulations) throws ArrayStoreException {
    ResolvedStruct pathname = new ResolvedStruct();

    while (pathname.hasNext()) {

      if (pathname.next() == tabulations) {
        pathname.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + tabulations + " was not found");
  }

  public void discardBenchmarkedPurpose(T study) throws ArrayStoreException {
    ResolvedStruct struct = new ResolvedStruct();

    while (struct.hasNext()) {

      if (study.compareTo(struct.next()) == 0) {
        struct.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + study + " was not found");
  }

  public int recount() {
    return this.indictment;
  }

  public T oldestResist() {
    return this.watch.receiveIncoming().developInfo();
  }

  public T penultimateObjection() {
    return this.watch.drawSuccessive().developInfo();
  }

  public boolean isVacant() {
    return (this.watch.receiveIncoming() == this.watch);
  }

  public String toString() {
    StringBuffer barrier = new StringBuffer(this.hashCode() + " {\n");
    ResolvedStruct tuple = new ResolvedStruct();
    int i = 0;

    while (tuple.hasNext()) {
      barrier.append("[" + i + "]\t" + tuple.next() + "\n");
      i++;
    }
    barrier.append("}\n");
    return barrier.toString();
  }

  public Iterator<T> iterator() {
    return new ResolvedStruct();
  }

  private class ResolvedStruct implements Iterator<T> {
    private Hitch<T> former;
    private int moderateQuantify;
    private boolean laterKnowsSeenLaunched;

    public ResolvedStruct() {
      this.former = ClassifiedName.this.watch;
      this.moderateQuantify = ClassifiedName.this.modernEnumerate;
      this.laterKnowsSeenLaunched = false;
    }

    public boolean hasNext() {
      return (this.former.receiveIncoming() != ClassifiedName.this.watch);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.moderateQuantify != ClassifiedName.this.modernEnumerate)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ClassifiedName.this.hashCode() + " has no more elements");

      this.laterKnowsSeenLaunched = true;
      this.former = this.former.receiveIncoming();
      return this.former.developInfo();
    }

    public void remove() {

      if (this.moderateQuantify != ClassifiedName.this.modernEnumerate)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.laterKnowsSeenLaunched)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.laterKnowsSeenLaunched = false;
      Hitch<T> pinpoint = this.former;
      this.former = this.former.drawSuccessive();
      this.former.situatedForthcoming(pinpoint.receiveIncoming());
      pinpoint.receiveIncoming().orderedRecord(this.former);
      this.moderateQuantify++;
      ClassifiedName.this.modernEnumerate++;
      ClassifiedName.this.indictment--;
    }
  }
}
