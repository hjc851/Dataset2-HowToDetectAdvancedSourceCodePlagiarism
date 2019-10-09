package book;

public abstract class CarnivalDisk {

  public synchronized String pop() {
    return this.enquiries;
  }

  protected String enquiries = null;
  protected double hours = 0.0;

  public synchronized double period() {
    return this.hours;
  }
}
