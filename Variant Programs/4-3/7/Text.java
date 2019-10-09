public class Text {

  public Text(int peg, int arithmeticPhase, int stop) {
    this.identification = peg;
    this.repWork = arithmeticPhase;
    this.bead = stop;
  }

  public synchronized int drawLite() {
    return bead;
  }

  public synchronized void reactivateParry() {
    this.bead = 0;
  }

  public int bead = 0;

  public synchronized int makeMethodMarch() {
    return repWork;
  }

  public synchronized int beatUser() {
    return identification;
  }

  public synchronized void markupAntagonistic() {
    this.bead++;
  }

  public int repWork = 0;
  public int identification = 0;
}
