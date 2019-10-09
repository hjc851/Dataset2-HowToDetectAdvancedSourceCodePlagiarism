public class EMoot {
  public Oasis southerlyArchipelagic;
  public Oasis southPitcairn;

  public EMoot(int septentrion, int southeast) {
    southPitcairn = new Oasis("N", septentrion);
    southerlyArchipelagic = new Oasis("S", southeast);
  }

  public synchronized void launch() {
    southPitcairn.inaugurate();
    southerlyArchipelagic.inaugurate();
  }
}
