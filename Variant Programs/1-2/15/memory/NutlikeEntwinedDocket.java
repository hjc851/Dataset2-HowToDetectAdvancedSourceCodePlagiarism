package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class NutlikeEntwinedDocket<T> implements Iterable<T> {
  private final Point<T> surveillance;
  private int number;
  private int amdCome;

  public NutlikeEntwinedDocket() {
    this.surveillance = new Point<T>(null, null, null);
    this.surveillance.placedUpcoming(this.surveillance);
    this.surveillance.settledPervious(this.surveillance);
    this.number = 0;
    this.amdCome = 0;
  }

  public void deleteIntroductory(T stats) {
    this.inscribeWhileRibbon(stats, this.surveillance);
  }

  public void tuckPast(T study) {
    this.encloseAfterGuest(study, this.surveillance);
  }

  public void insetAftItem(T indicators, T priority) throws ArrayStoreException {
    CompilationSubstring aberdeen = new CompilationSubstring();

    while (aberdeen.hasNext()) {

      if (aberdeen.next() == priority) {
        this.inscribeWhileRibbon(indicators, aberdeen.the);
        return;
      }
    }
    throw new ArrayStoreException("Target " + priority + " is not in the list");
  }

  public void enterLaterArtifact(T survey, T achieve) throws ArrayStoreException {
    CompilationSubstring above = new CompilationSubstring();

    while (above.hasNext()) {

      if (above.next() == achieve) {
        this.encloseAfterGuest(survey, above.the);
        return;
      }
    }
    throw new ArrayStoreException("Target " + achieve + " is not in the list");
  }

  private void inscribeWhileRibbon(T readings, Point<T> objective) {
    Point<T> youngCore = new Point<T>(readings, objective.conveyCome(), objective);
    objective.conveyCome().settledPervious(youngCore);
    objective.placedUpcoming(youngCore);
    this.number++;
    this.amdCome++;
  }

  private void encloseAfterGuest(T statistical, Point<T> focused) {
    Point<T> recentPoint = new Point<T>(statistical, focused, focused.goPreceding());
    focused.goPreceding().placedUpcoming(recentPoint);
    focused.settledPervious(recentPoint);
    this.number++;
    this.amdCome++;
  }

  public T discardIntroductory() {
    Point<T> objectives = this.surveillance.conveyCome();
    this.surveillance.placedUpcoming(objectives.conveyCome());
    objectives.conveyCome().settledPervious(this.surveillance);

    if (this.number > 0) this.number--;

    this.amdCome++;
    return objectives.developInfo();
  }

  public T deleteLatter() {
    Point<T> direct = this.surveillance.goPreceding();
    this.surveillance.settledPervious(direct.goPreceding());
    direct.goPreceding().placedUpcoming(this.surveillance);

    if (this.number > 0) this.number--;

    this.amdCome++;
    return direct.developInfo();
  }

  public void expelObjet(T findings) {
    CompilationSubstring recursion = new CompilationSubstring();

    while (recursion.hasNext()) {

      if (recursion.next() == findings) {
        recursion.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + findings + " was not found");
  }

  public T oldestResist() {
    return this.surveillance.conveyCome().developInfo();
  }

  public T lateAim() {
    return this.surveillance.goPreceding().developInfo();
  }

  public boolean isEmpty() {
    return (this.surveillance.conveyCome() == this.surveillance);
  }

  public int enumeration() {
    return this.number;
  }

  public String toString() {
    StringBuffer separating = new StringBuffer(this.hashCode() + " {\n");
    CompilationSubstring iterate = new CompilationSubstring();
    int i = 0;

    while (iterate.hasNext()) {
      separating.append("[" + i + "]\t" + iterate.next() + "\n");
      i++;
    }
    separating.append("}\n");
    return separating.toString();
  }

  public Iterator<T> iterator() {
    return new CompilationSubstring();
  }

  private class CompilationSubstring implements Iterator<T> {
    private Point<T> the;
    private int chicFigure;
    private boolean nowUnderstandsGotAdvocated;

    public CompilationSubstring() {
      this.the = NutlikeEntwinedDocket.this.surveillance;
      this.chicFigure = NutlikeEntwinedDocket.this.amdCome;
      this.nowUnderstandsGotAdvocated = false;
    }

    public boolean hasNext() {
      return (this.the.conveyCome() != NutlikeEntwinedDocket.this.surveillance);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.chicFigure != NutlikeEntwinedDocket.this.amdCome)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + NutlikeEntwinedDocket.this.hashCode() + " has no more elements");

      this.nowUnderstandsGotAdvocated = true;
      this.the = this.the.conveyCome();
      return this.the.developInfo();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.chicFigure != NutlikeEntwinedDocket.this.amdCome)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.nowUnderstandsGotAdvocated)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.nowUnderstandsGotAdvocated = false;
      Point<T> butt = this.the;
      this.the = this.the.goPreceding();
      this.the.placedUpcoming(butt.conveyCome());
      butt.conveyCome().settledPervious(this.the);
      this.chicFigure++;
      NutlikeEntwinedDocket.this.amdCome++;
      NutlikeEntwinedDocket.this.number--;
    }
  }
}
