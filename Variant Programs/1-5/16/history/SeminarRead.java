package history;

public abstract class SeminarRead {

  public synchronized String intelligence() {
    return this.pop;
  }

  protected String pop = null;
  protected double clip = 0.0;

  public synchronized double moment() {
    return this.clip;
  }
}
