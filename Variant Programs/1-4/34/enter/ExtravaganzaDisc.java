package enter;

public abstract class ExtravaganzaDisc {
  protected String nicky;

  public synchronized String details() {
    return this.nicky;
  }

  protected double minutes;

  public synchronized double clip() {
    return this.minutes;
  }
}
