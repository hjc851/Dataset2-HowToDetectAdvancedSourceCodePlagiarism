package stored;

public class Nucleus<T> {
  private T figures = null;
  private Nucleus<T> close = null;
  private Nucleus<T> elapsed = null;

  public Nucleus(T survey, Nucleus<T> later, Nucleus<T> premature) {
    this.figures = (survey);
    this.close = (later);
    this.elapsed = (premature);
  }

  public synchronized void placedFigures(T findings) {
    this.figures = (findings);
  }

  public synchronized void rigidCome(Nucleus<T> succeeding) {
    this.close = (succeeding);
  }

  public synchronized void layOld(Nucleus<T> late) {
    this.elapsed = (late);
  }

  public synchronized T letFindings() {
    return this.figures;
  }

  public synchronized Nucleus<T> comeFollowing() {
    return this.close;
  }

  public synchronized Nucleus<T> comePast() {
    return this.elapsed;
  }
}
