public class Screen {
  public int anti = 0;
  public int antipyreticProcedures = 0;
  public int user = 0;

  public Screen(int card, int didacticSystem, int tile) {
    this.user = card;
    this.antipyreticProcedures = didacticSystem;
    this.anti = tile;
  }

  public synchronized int obtainEst() {
    return user;
  }

  public synchronized int fetchReceiveNegotiations() {
    return antipyreticProcedures;
  }

  public synchronized int becomePlay() {
    return anti;
  }

  public synchronized void surgeCounterbalance() {
    this.anti++;
  }

  public synchronized void restateStymie() {
    this.anti = 0;
  }
}
