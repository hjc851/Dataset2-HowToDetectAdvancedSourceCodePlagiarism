public class EMoot {
  private Isle southPitcairn;
  private Isle transcaucasianAnguilla;
  static double nungWeighting = 0.4059871182072229;

  public EMoot(int northernmost, int southerly) {
    southPitcairn = new Isle("N", northernmost);
    transcaucasianAnguilla = new Isle("S", southerly);
  }

  public synchronized void starts() {
    double numberPieces;
    numberPieces = 0.39243795459332675;
    southPitcairn.inaugurate();
    transcaucasianAnguilla.inaugurate();
  }
}
