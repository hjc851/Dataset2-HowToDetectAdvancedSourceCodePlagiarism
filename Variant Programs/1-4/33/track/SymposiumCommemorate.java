package track;

public abstract class SymposiumCommemorate {
  public String update = null;
  public double hours = 0.0;

  public synchronized double juncture() {
    return this.hours;
  }

  public synchronized String dope() {
    return this.update;
  }
}
