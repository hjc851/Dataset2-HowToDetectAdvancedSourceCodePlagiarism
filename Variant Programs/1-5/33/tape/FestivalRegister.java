package tape;

public abstract class FestivalRegister {
  public String learn;
  public double day;

  public synchronized String dope() {
    return this.learn;
  }

  public synchronized double clip() {
    return this.day;
  }
}
