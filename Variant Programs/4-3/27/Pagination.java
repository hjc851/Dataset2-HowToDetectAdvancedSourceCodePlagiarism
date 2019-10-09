public class Pagination {
  public int act;
  public int receiveNegotiations;
  public int milad;

  public Pagination(int identification, int resetMechanisms, int stops) {
    this.milad = identification;
    this.receiveNegotiations = resetMechanisms;
    this.act = stops;
  }

  public synchronized int driveSecurity() {
    return milad;
  }

  public synchronized int becomeInterruptMethodology() {
    return receiveNegotiations;
  }

  public synchronized int driveStem() {
    return act;
  }

  public synchronized void growthCounterpunch() {
    this.act++;
  }

  public synchronized void eraseAgainst() {
    this.act = 0;
  }
}
