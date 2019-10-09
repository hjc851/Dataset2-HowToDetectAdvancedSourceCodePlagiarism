package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ConsultedAgenda<T extends Comparable<T>> implements Iterable<T> {
  private final Ganglia<T> guardian;
  private int charge;
  private int daringCensus;

  public ConsultedAgenda() {
    this.guardian = new Ganglia<T>(null, null, null);
    this.guardian.laidFollowing(guardian);
    this.guardian.laidPast(guardian);
    this.charge = 0;
    this.daringCensus = 0;
  }

  public void inscribe(T indicators) {
    IndexedSubstring instantiation = new IndexedSubstring();

    while (instantiation.hasNext()) {

      if (indicators.compareTo(instantiation.next()) >= 0) {
        break;
      }

      if (instantiation.ongoing.beatThe() == this.guardian) {
        Ganglia<T> newbornIssue =
            new Ganglia<T>(indicators, this.guardian, this.guardian.receiveOld());
        this.guardian.receiveOld().laidFollowing(newbornIssue);
        this.guardian.laidPast(newbornIssue);
        this.charge++;
        this.daringCensus++;
        return;
      }
    }
    Ganglia<T> novelLump =
        new Ganglia<T>(indicators, instantiation.ongoing, instantiation.ongoing.receiveOld());
    instantiation.ongoing.receiveOld().laidFollowing(novelLump);
    instantiation.ongoing.laidPast(novelLump);
    this.charge++;
    this.daringCensus++;
  }

  public T hitTop() {
    Ganglia<T> storm = this.guardian.beatThe();
    this.guardian.laidFollowing(storm.beatThe());
    storm.beatThe().laidPast(this.guardian);

    if (this.charge > 0) this.charge--;

    this.daringCensus++;
    return storm.sustainReports();
  }

  public T murderEnd() {
    Ganglia<T> focussed = this.guardian.receiveOld();
    this.guardian.laidPast(focussed.receiveOld());
    focussed.receiveOld().laidFollowing(this.guardian);

    if (this.charge > 0) this.charge--;

    this.daringCensus++;
    return focussed.sustainReports();
  }

  public void ridCavil(T intelligence) throws ArrayStoreException {
    IndexedSubstring integer = new IndexedSubstring();

    while (integer.hasNext()) {

      if (integer.next() == intelligence) {
        integer.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + intelligence + " was not found");
  }

  public void eliminateMeasuredSubject(T results) throws ArrayStoreException {
    IndexedSubstring pathname = new IndexedSubstring();

    while (pathname.hasNext()) {

      if (results.compareTo(pathname.next()) == 0) {
        pathname.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + results + " was not found");
  }

  public int numeration() {
    return this.charge;
  }

  public T forwardVictim() {
    return this.guardian.beatThe().sustainReports();
  }

  public T highThing() {
    return this.guardian.receiveOld().sustainReports();
  }

  public boolean isVacant() {
    return (this.guardian.beatThe() == this.guardian);
  }

  public String toString() {
    StringBuffer cushioning = new StringBuffer(this.hashCode() + " {\n");
    IndexedSubstring tuple = new IndexedSubstring();
    int i = 0;

    while (tuple.hasNext()) {
      cushioning.append("[" + i + "]\t" + tuple.next() + "\n");
      i++;
    }
    cushioning.append("}\n");
    return cushioning.toString();
  }

  public Iterator<T> iterator() {
    return new IndexedSubstring();
  }

  private class IndexedSubstring implements Iterator<T> {
    private Ganglia<T> ongoing;
    private int stylishTally;
    private boolean closeNowPreviouslyDubbed;

    public IndexedSubstring() {
      this.ongoing = ConsultedAgenda.this.guardian;
      this.stylishTally = ConsultedAgenda.this.daringCensus;
      this.closeNowPreviouslyDubbed = false;
    }

    public boolean hasNext() {
      return (this.ongoing.beatThe() != ConsultedAgenda.this.guardian);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.stylishTally != ConsultedAgenda.this.daringCensus)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ConsultedAgenda.this.hashCode() + " has no more elements");

      this.closeNowPreviouslyDubbed = true;
      this.ongoing = this.ongoing.beatThe();
      return this.ongoing.sustainReports();
    }

    public void remove() {

      if (this.stylishTally != ConsultedAgenda.this.daringCensus)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.closeNowPreviouslyDubbed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.closeNowPreviouslyDubbed = false;
      Ganglia<T> achieve = this.ongoing;
      this.ongoing = this.ongoing.receiveOld();
      this.ongoing.laidFollowing(achieve.beatThe());
      achieve.beatThe().laidPast(this.ongoing);
      this.stylishTally++;
      ConsultedAgenda.this.daringCensus++;
      ConsultedAgenda.this.charge--;
    }
  }
}
