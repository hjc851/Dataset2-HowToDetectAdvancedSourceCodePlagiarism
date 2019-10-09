public class Pagination {
  public int piece = 0;
  public int peenOperation = 0;
  public int quod = 0;

  public Pagination(int caller, int retrieveMethods, int nut) {
    this.quod = caller;
    this.peenOperation = retrieveMethods;
    this.piece = nut;
  }

  public synchronized int arriveIdentifying() {
    return quod;
  }

  public synchronized int arriveAntipyreticProcedures() {
    return peenOperation;
  }

  public synchronized int catchChuck() {
    return piece;
  }

  public synchronized void raiseCounteract() {
    this.piece++;
  }

  public synchronized void eraseAgainst() {
    this.piece = 0;
  }
}
