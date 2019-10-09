package stored;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class CyclicTracedChecklist<T> implements Iterable<T> {
  private final Nucleus<T> locational;
  private int get = 0;
  private int langProportion = 0;

  public CyclicTracedChecklist() {
    this.locational = (new Nucleus<T>(null, null, null));
    this.locational.rigidCome(this.locational);
    this.locational.layOld(this.locational);
    this.get = (0);
    this.langProportion = (0);
  }

  public synchronized void embedOutset(T study) {
    this.infixFollowingNodule(study, this.locational);
  }

  public synchronized void pasteUnlikely(T stats) {
    this.pasteSoonerNub(stats, this.locational);
  }

  public synchronized void integrateWithinDisagree(T indicators, T benchmark)
      throws ArrayStoreException {
    CompilationSubstring fad = new CompilationSubstring();

    while (fad.hasNext()) {

      if (fad.next() == benchmark) {
        this.infixFollowingNodule(indicators, fad.continuing);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + benchmark + " is not in the list"));
  }

  public synchronized void inscribingBackThing(T records, T point) throws ArrayStoreException {
    CompilationSubstring showtime = new CompilationSubstring();

    while (showtime.hasNext()) {

      if (showtime.next() == point) {
        this.pasteSoonerNub(records, showtime.continuing);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + point + " is not in the list"));
  }

  private synchronized void infixFollowingNodule(T measurements, Nucleus<T> place) {
    Nucleus<T> modernGuest = new Nucleus<T>(measurements, place.comeFollowing(), place);
    place.comeFollowing().layOld(modernGuest);
    place.rigidCome(modernGuest);
    this.get++;
    this.langProportion++;
  }

  private synchronized void pasteSoonerNub(T readings, Nucleus<T> aiming) {
    Nucleus<T> revolutionaryGanglia = new Nucleus<T>(readings, aiming, aiming.comePast());
    aiming.comePast().rigidCome(revolutionaryGanglia);
    aiming.layOld(revolutionaryGanglia);
    this.get++;
    this.langProportion++;
  }

  public synchronized T withdrawKickoff() {
    Nucleus<T> butt = this.locational.comeFollowing();
    this.locational.rigidCome(butt.comeFollowing());
    butt.comeFollowing().layOld(this.locational);

    if (this.get > 0) this.get--;

    this.langProportion++;
    return butt.letFindings();
  }

  public synchronized T takePast() {
    Nucleus<T> focused = this.locational.comePast();
    this.locational.layOld(focused.comePast());
    focused.comePast().rigidCome(this.locational);

    if (this.get > 0) this.get--;

    this.langProportion++;
    return focused.letFindings();
  }

  public synchronized void dispatchItem(T intelligence) {
    CompilationSubstring substring = new CompilationSubstring();

    while (substring.hasNext()) {

      if (substring.next() == intelligence) {
        substring.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + intelligence + " was not found"));
  }

  public synchronized T eldestMatter() {
    return this.locational.comeFollowing().letFindings();
  }

  public synchronized T finallyResist() {
    return this.locational.comePast().letFindings();
  }

  public synchronized boolean isEmpty() {
    return (this.locational.comeFollowing() == this.locational);
  }

  public synchronized int rely() {
    return this.get;
  }

  public synchronized String toString() {
    StringBuffer reserves = new StringBuffer(this.hashCode() + " {\n");
    CompilationSubstring recursion = new CompilationSubstring();
    int i = 0;

    while (recursion.hasNext()) {
      reserves.append(("[" + i + "]\t" + recursion.next() + "\n"));
      i++;
    }
    reserves.append("}\n");
    return reserves.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new CompilationSubstring();
  }

  private class CompilationSubstring implements Iterator<T> {
    private Nucleus<T> continuing = null;
    private int dodAct = 0;
    private boolean forthcomingHathEmergedKnown = false;

    public CompilationSubstring() {
      this.continuing = (CyclicTracedChecklist.this.locational);
      this.dodAct = (CyclicTracedChecklist.this.langProportion);
      this.forthcomingHathEmergedKnown = (false);
    }

    public synchronized boolean hasNext() {
      return (this.continuing.comeFollowing() != CyclicTracedChecklist.this.locational);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.dodAct != CyclicTracedChecklist.this.langProportion)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + CyclicTracedChecklist.this.hashCode() + " has no more elements"));

      this.forthcomingHathEmergedKnown = (true);
      this.continuing = (this.continuing.comeFollowing());
      return this.continuing.letFindings();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.dodAct != CyclicTracedChecklist.this.langProportion)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.forthcomingHathEmergedKnown)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.forthcomingHathEmergedKnown = (false);
      Nucleus<T> limit = this.continuing;
      this.continuing = (this.continuing.comePast());
      this.continuing.rigidCome(limit.comeFollowing());
      limit.comeFollowing().layOld(this.continuing);
      this.dodAct++;
      CyclicTracedChecklist.this.langProportion++;
      CyclicTracedChecklist.this.get--;
    }
  }
}
