package shelving;

public class Ganglion<T> {

  public synchronized T fetchTabulations() {
    return this.files;
  }

  public Ganglion<T> ago;

  public synchronized Ganglion<T> sustainPre() {
    return this.ago;
  }

  public synchronized void laidDatabases(T database) {
    this.files = database;
  }

  public synchronized void determinedPremature(Ganglion<T> past) {
    this.ago = past;
  }

  public Ganglion<T> succeeding;

  public synchronized void dictatedClose(Ganglion<T> soon) {
    this.succeeding = soon;
  }

  public Ganglion(T evidence, Ganglion<T> following, Ganglion<T> first) {
    this.files = evidence;
    this.succeeding = following;
    this.ago = first;
  }

  public T files;

  public synchronized Ganglion<T> catchUpcoming() {
    return this.succeeding;
  }
}
