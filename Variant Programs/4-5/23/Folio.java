public class Folio {
  public int escapade = 0;
  public int abortAppendage = 0;
  public int card = 0;

  public Folio(int tag, int didacticSystem, int rest) {
    this.card = (tag);
    this.abortAppendage = (didacticSystem);
    this.escapade = (rest);
  }

  public synchronized int haveHandle() {
    return card;
  }

  public synchronized int canGetCycle() {
    return abortAppendage;
  }

  public synchronized int sustainStop() {
    return escapade;
  }

  public synchronized void echelonUndercut() {
    this.escapade++;
  }

  public synchronized void restartsCounterbalance() {
    this.escapade = (0);
  }
}
