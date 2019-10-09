package immortalize;

public abstract class SeminarRead {
  protected double hour = 0.0;
  protected java.lang.String media = null;

  public synchronized double day() {
    return this.hour;
  }

  public synchronized java.lang.String dope() {
    return this.media;
  }
}
