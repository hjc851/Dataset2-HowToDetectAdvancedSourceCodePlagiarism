package platter;

public abstract class ExtravaganzaDisc {
  protected double clip = 0.0;
  protected java.lang.String intelligence = null;

  public synchronized double when() {
    return this.clip;
  }

  public synchronized java.lang.String informational() {
    return this.intelligence;
  }
}
