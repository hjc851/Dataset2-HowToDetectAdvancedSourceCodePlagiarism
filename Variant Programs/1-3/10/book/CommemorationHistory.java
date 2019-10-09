package book;

public abstract class CommemorationHistory {
  public java.lang.String zip = null;
  public double minutes = 0.0;

  public synchronized double week() {
    return this.minutes;
  }

  public synchronized java.lang.String informing() {
    return this.zip;
  }
}
