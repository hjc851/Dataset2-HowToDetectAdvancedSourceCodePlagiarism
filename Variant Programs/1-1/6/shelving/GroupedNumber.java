package shelving;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GroupedNumber<T extends Comparable<T>> implements Iterable<T> {
  private final Guest<T> picket;
  private int reckon;
  private int residueFigure;

  public GroupedNumber() {
    this.picket = new Guest<T>(null, null, null);
    this.picket.fixThen(picket);
    this.picket.fixPre(picket);
    this.reckon = 0;
    this.residueFigure = 0;
  }

  public void infix(T files) {
    PlacedParser struct = new PlacedParser();

    while (struct.hasNext()) {

      if (files.compareTo(struct.next()) >= 0) {
        break;
      }

      if (struct.stream.produceSecond() == this.picket) {
        Guest<T> hotProblem = new Guest<T>(files, this.picket, this.picket.produceCurrent());
        this.picket.produceCurrent().fixThen(hotProblem);
        this.picket.fixPre(hotProblem);
        this.reckon++;
        this.residueFigure++;
        return;
      }
    }
    Guest<T> novelLump = new Guest<T>(files, struct.stream, struct.stream.produceCurrent());
    struct.stream.produceCurrent().fixThen(novelLump);
    struct.stream.fixPre(novelLump);
    this.reckon++;
    this.residueFigure++;
  }

  public T hitTop() {
    Guest<T> job = this.picket.produceSecond();
    this.picket.fixThen(job.produceSecond());
    job.produceSecond().fixPre(this.picket);

    if (this.reckon > 0) this.reckon--;

    this.residueFigure++;
    return job.arriveEvidence();
  }

  public T ridLatest() {
    Guest<T> threshold = this.picket.produceCurrent();
    this.picket.fixPre(threshold.produceCurrent());
    threshold.produceCurrent().fixThen(this.picket);

    if (this.reckon > 0) this.reckon--;

    this.residueFigure++;
    return threshold.arriveEvidence();
  }

  public void expelObjet(T database) throws ArrayStoreException {
    PlacedParser substring = new PlacedParser();

    while (substring.hasNext()) {

      if (substring.next() == database) {
        substring.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + database + " was not found");
  }

  public void deleteOverBody(T estimates) throws ArrayStoreException {
    PlacedParser pathname = new PlacedParser();

    while (pathname.hasNext()) {

      if (estimates.compareTo(pathname.next()) == 0) {
        pathname.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + estimates + " was not found");
  }

  public int enumeration() {
    return this.reckon;
  }

  public T introductoryPurpose() {
    return this.picket.produceSecond().arriveEvidence();
  }

  public T conclusionItems() {
    return this.picket.produceCurrent().arriveEvidence();
  }

  public boolean isVacant() {
    return (this.picket.produceSecond() == this.picket);
  }

  public String toString() {
    StringBuffer safeguard = new StringBuffer(this.hashCode() + " {\n");
    PlacedParser bool = new PlacedParser();
    int i = 0;

    while (bool.hasNext()) {
      safeguard.append("[" + i + "]\t" + bool.next() + "\n");
      i++;
    }
    safeguard.append("}\n");
    return safeguard.toString();
  }

  public Iterator<T> iterator() {
    return new PlacedParser();
  }

  private class PlacedParser implements Iterator<T> {
    private Guest<T> stream;
    private int amdConsider;
    private boolean incomingMaintainsGoneReferred;

    public PlacedParser() {
      this.stream = GroupedNumber.this.picket;
      this.amdConsider = GroupedNumber.this.residueFigure;
      this.incomingMaintainsGoneReferred = false;
    }

    public boolean hasNext() {
      return (this.stream.produceSecond() != GroupedNumber.this.picket);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.amdConsider != GroupedNumber.this.residueFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + GroupedNumber.this.hashCode() + " has no more elements");

      this.incomingMaintainsGoneReferred = true;
      this.stream = this.stream.produceSecond();
      return this.stream.arriveEvidence();
    }

    public void remove() {

      if (this.amdConsider != GroupedNumber.this.residueFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.incomingMaintainsGoneReferred)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.incomingMaintainsGoneReferred = false;
      Guest<T> mark = this.stream;
      this.stream = this.stream.produceCurrent();
      this.stream.fixThen(mark.produceSecond());
      mark.produceSecond().fixPre(this.stream);
      this.amdConsider++;
      GroupedNumber.this.residueFigure++;
      GroupedNumber.this.reckon--;
    }
  }
}
