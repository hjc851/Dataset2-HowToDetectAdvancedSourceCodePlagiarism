package accomplishment;

public abstract class ParadePlatter {
  protected double month = 0.0;

  public synchronized double days() {
    return this.month;
  }

  protected java.lang.String story = null;

  public synchronized java.lang.String scoop() {
    return this.story;
  }
}
