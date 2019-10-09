package shelving;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CyclicalUnrelatedCompilation<T> implements Iterable<T> {
  private final Guest<T> keeper;
  private int rely;
  private int chicFigure;

  public CyclicalUnrelatedCompilation() {
    this.keeper = new Guest<T>(null, null, null);
    this.keeper.fixThen(this.keeper);
    this.keeper.fixPre(this.keeper);
    this.rely = 0;
    this.chicFigure = 0;
  }

  public void installForemost(T readings) {
    this.integrateWithinCarrefour(readings, this.keeper);
  }

  public void encloseLate(T results) {
    this.enterLaterAntenna(results, this.keeper);
  }

  public void installSubsequentPreclude(T reports, T focused) throws ArrayStoreException {
    CompilationSubstring abcs = new CompilationSubstring();

    while (abcs.hasNext()) {

      if (abcs.next() == focused) {
        this.integrateWithinCarrefour(reports, abcs.existing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focused + " is not in the list");
  }

  public void infixThenArtefact(T study, T goal) throws ArrayStoreException {
    CompilationSubstring law = new CompilationSubstring();

    while (law.hasNext()) {

      if (law.next() == goal) {
        this.enterLaterAntenna(study, law.existing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + goal + " is not in the list");
  }

  private void integrateWithinCarrefour(T records, Guest<T> focusing) {
    Guest<T> originalAntenna = new Guest<T>(records, focusing.produceSecond(), focusing);
    focusing.produceSecond().fixPre(originalAntenna);
    focusing.fixThen(originalAntenna);
    this.rely++;
    this.chicFigure++;
  }

  private void enterLaterAntenna(T databases, Guest<T> goals) {
    Guest<T> freshClient = new Guest<T>(databases, goals, goals.produceCurrent());
    goals.produceCurrent().fixThen(freshClient);
    goals.fixPre(freshClient);
    this.rely++;
    this.chicFigure++;
  }

  public T slayOpening() {
    Guest<T> objective = this.keeper.produceSecond();
    this.keeper.fixThen(objective.produceSecond());
    objective.produceSecond().fixPre(this.keeper);

    if (this.rely > 0) this.rely--;

    this.chicFigure++;
    return objective.arriveEvidence();
  }

  public T removalFinally() {
    Guest<T> pinpoint = this.keeper.produceCurrent();
    this.keeper.fixPre(pinpoint.produceCurrent());
    pinpoint.produceCurrent().fixThen(this.keeper);

    if (this.rely > 0) this.rely--;

    this.chicFigure++;
    return pinpoint.arriveEvidence();
  }

  public void yankTotem(T evidence) {
    CompilationSubstring parser = new CompilationSubstring();

    while (parser.hasNext()) {

      if (parser.next() == evidence) {
        parser.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + evidence + " was not found");
  }

  public T firstbornArgue() {
    return this.keeper.produceSecond().arriveEvidence();
  }

  public T highThing() {
    return this.keeper.produceCurrent().arriveEvidence();
  }

  public boolean isEmpty() {
    return (this.keeper.produceSecond() == this.keeper);
  }

  public int charge() {
    return this.rely;
  }

  public String toString() {
    StringBuffer temporary = new StringBuffer(this.hashCode() + " {\n");
    CompilationSubstring concatenate = new CompilationSubstring();
    int i = 0;

    while (concatenate.hasNext()) {
      temporary.append("[" + i + "]\t" + concatenate.next() + "\n");
      i++;
    }
    temporary.append("}\n");
    return temporary.toString();
  }

  public Iterator<T> iterator() {
    return new CompilationSubstring();
  }

  private class CompilationSubstring implements Iterator<T> {
    private Guest<T> existing;
    private int fashionableTotal;
    private boolean newOffersEnduredSuggested;

    public CompilationSubstring() {
      this.existing = CyclicalUnrelatedCompilation.this.keeper;
      this.fashionableTotal = CyclicalUnrelatedCompilation.this.chicFigure;
      this.newOffersEnduredSuggested = false;
    }

    public boolean hasNext() {
      return (this.existing.produceSecond() != CyclicalUnrelatedCompilation.this.keeper);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionableTotal != CyclicalUnrelatedCompilation.this.chicFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + CyclicalUnrelatedCompilation.this.hashCode() + " has no more elements");

      this.newOffersEnduredSuggested = true;
      this.existing = this.existing.produceSecond();
      return this.existing.arriveEvidence();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.fashionableTotal != CyclicalUnrelatedCompilation.this.chicFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.newOffersEnduredSuggested)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.newOffersEnduredSuggested = false;
      Guest<T> priority = this.existing;
      this.existing = this.existing.produceCurrent();
      this.existing.fixThen(priority.produceSecond());
      priority.produceSecond().fixPre(this.existing);
      this.fashionableTotal++;
      CyclicalUnrelatedCompilation.this.chicFigure++;
      CyclicalUnrelatedCompilation.this.rely--;
    }
  }
}
