package best;

public abstract class FestivalRegister {
  protected double year;
  protected java.lang.String tip;

  public synchronized double month() {
    return this.year;
  }

  public synchronized java.lang.String zip() {
    return this.tip;
  }
}
