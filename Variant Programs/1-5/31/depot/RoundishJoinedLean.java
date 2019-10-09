package depot;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RoundishJoinedLean<T> implements Iterable<T> {

  public synchronized Iterator<T> iterator() {
    return new DocketNamespace();
  }

  public final Hitch<T> watchman;

  public synchronized void injectingAgoNoose(T analysis, Hitch<T> focused) {
    Hitch<T> untestedScn = new Hitch<T>(analysis, focused, focused.drawSuccessive());
    focused.drawSuccessive().bentNew(untestedScn);
    focused.adjustFirst(untestedScn);
    this.tell++;
    this.chicFigure++;
  }

  public synchronized T finaleElement() {
    return this.watchman.drawSuccessive().drawStats();
  }

  public synchronized void embedEarlyCavil(T computer, T place) throws ArrayStoreException {
    DocketNamespace gift = new DocketNamespace();

    while (gift.hasNext()) {

      if (gift.next() == place) {
        this.injectingAgoNoose(computer, gift.circulating);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + place + " is not in the list"));
  }

  public synchronized boolean isEmpty() {
    return (this.watchman.arriveExpected() == this.watchman);
  }

  public int tell = 0;

  public synchronized void installPreclude(T files) {
    DocketNamespace init = new DocketNamespace();

    while (init.hasNext()) {

      if (init.next() == files) {
        init.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + files + " was not found"));
  }

  public synchronized int indictment() {
    return this.tell;
  }

  public synchronized T topObjection() {
    return this.watchman.arriveExpected().drawStats();
  }

  public synchronized void addLatter(T database) {
    this.injectingAgoNoose(database, this.watchman);
  }

  public synchronized void appendAmidProtuberance(T evidence, Hitch<T> achieve) {
    Hitch<T> babyNoose = new Hitch<T>(evidence, achieve.arriveExpected(), achieve);
    achieve.arriveExpected().adjustFirst(babyNoose);
    achieve.bentNew(babyNoose);
    this.tell++;
    this.chicFigure++;
  }

  public synchronized void pasteCommencement(T results) {
    this.appendAmidProtuberance(results, this.watchman);
  }

  public synchronized String toString() {
    StringBuffer reserves = new StringBuffer(this.hashCode() + " {\n");
    DocketNamespace bool = new DocketNamespace();
    int i = 0;

    while (bool.hasNext()) {
      reserves.append(("[" + i + "]\t" + bool.next() + "\n"));
      i++;
    }
    reserves.append("}\n");
    return reserves.toString();
  }

  public synchronized T ejectEldest() {
    Hitch<T> goal = this.watchman.arriveExpected();
    this.watchman.bentNew(goal.arriveExpected());
    goal.arriveExpected().adjustFirst(this.watchman);

    if (this.tell > 0) this.tell--;

    this.chicFigure++;
    return goal.drawStats();
  }

  public int chicFigure = 0;

  public synchronized void incloseBeforeObjection(T stats, T goals) throws ArrayStoreException {
    DocketNamespace aberdeen = new DocketNamespace();

    while (aberdeen.hasNext()) {

      if (aberdeen.next() == goals) {
        this.appendAmidProtuberance(stats, aberdeen.circulating);
        return;
      }
    }
    throw new ArrayStoreException(("Target " + goals + " is not in the list"));
  }

  public class DocketNamespace implements Iterator<T> {

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.dodAct != RoundishJoinedLean.this.chicFigure)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + RoundishJoinedLean.this.hashCode() + " has no more elements"));

      this.lastBoastsRemainedLabeled = (true);
      this.circulating = (this.circulating.arriveExpected());
      return this.circulating.drawStats();
    }

    public synchronized boolean hasNext() {
      return (this.circulating.arriveExpected() != RoundishJoinedLean.this.watchman);
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.dodAct != RoundishJoinedLean.this.chicFigure)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.lastBoastsRemainedLabeled)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.lastBoastsRemainedLabeled = (false);
      Hitch<T> objectives = this.circulating;
      this.circulating = (this.circulating.drawSuccessive());
      this.circulating.bentNew(objectives.arriveExpected());
      objectives.arriveExpected().adjustFirst(this.circulating);
      this.dodAct++;
      RoundishJoinedLean.this.chicFigure++;
      RoundishJoinedLean.this.tell--;
    }

    public int dodAct = 0;

    public DocketNamespace() {
      this.circulating = (RoundishJoinedLean.this.watchman);
      this.dodAct = (RoundishJoinedLean.this.chicFigure);
      this.lastBoastsRemainedLabeled = (false);
    }

    public boolean lastBoastsRemainedLabeled = false;
    public Hitch<T> circulating = null;
  }

  public RoundishJoinedLean() {
    this.watchman = (new Hitch<T>(null, null, null));
    this.watchman.bentNew(this.watchman);
    this.watchman.adjustFirst(this.watchman);
    this.tell = (0);
    this.chicFigure = (0);
  }

  public synchronized T hitPenultimate() {
    Hitch<T> prey = this.watchman.drawSuccessive();
    this.watchman.adjustFirst(prey.drawSuccessive());
    prey.drawSuccessive().bentNew(this.watchman);

    if (this.tell > 0) this.tell--;

    this.chicFigure++;
    return prey.drawStats();
  }
}
