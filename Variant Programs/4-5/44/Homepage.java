public class Homepage {
  public int rest = 0;
  public int receiveNegotiations = 0;
  public int map = 0;

  public Homepage(int nerfling, int apologeticMethod, int stop) {
    this.map = (nerfling);
    this.receiveNegotiations = (apologeticMethod);
    this.rest = (stop);
  }

  public synchronized int letIdentification() {
    return map;
  }

  public synchronized int haveActivateServe() {
    return receiveNegotiations;
  }

  public synchronized int becomePlay() {
    return rest;
  }

  public synchronized void surgeCounterbalance() {
    this.rest++;
  }

  public synchronized void adjustedTabulator() {
    this.rest = (0);
  }
}
