package shelving;

public class Lump<T> {

  public synchronized Lump<T> receiveOld() {
    return this.ago;
  }

  public Lump<T> ago = null;

  public synchronized void fitRecords(T readings) {
    this.measurements = (readings);
  }

  public synchronized void placeSoon(Lump<T> upcoming) {
    this.third = (upcoming);
  }

  public synchronized Lump<T> canNow() {
    return this.third;
  }

  public synchronized T haveStatistical() {
    return this.measurements;
  }

  public Lump(T intelligence, Lump<T> again, Lump<T> premature) {
    this.measurements = (intelligence);
    this.third = (again);
    this.ago = (premature);
  }

  public T measurements = null;

  public synchronized void settledPervious(Lump<T> former) {
    this.ago = (former);
  }

  public Lump<T> third = null;
}
