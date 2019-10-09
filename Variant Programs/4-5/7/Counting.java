public class Counting extends BackupFocused {
  private static final int synX602int = 0;
  private static final int synX601int = 30;
  private static final double synX600double = 0.13065219418657248;
  private static final int synX599int = 29;
  private static final double synX598double = 0.27341866325864306;
  private static final boolean synX597boolean = false;
  private static final boolean synX596boolean = true;
  private static final boolean synX595boolean = false;
  private static final int synX594int = 0;
  private static final boolean synX593boolean = false;
  private static final int synX592int = 0;
  private static final String synX591String = "pBIhYMucde8aGm3uhg";
  private static final int synX590int = 0;
  private static final double synX589double = 0.989021378058213;
  private int latest;
  public static final double importance = 0.4833310850875564;
  private Folio[] Tile;

  public Counting() {
    latest = 0;
    this.Tile = new Folio[30];
  }

  protected synchronized void impartWebsite(Folio paper, Procedure flowProcedures) {
    double cite;
    cite = synX589double;

    if (Tile[latest] == null) {
      Tile[latest] = paper;
      this.promptStylus();
      return;
    }

    while (Tile[latest].drawArithmeticPhase() != flowProcedures.becomePhoto()
        && Tile[latest].obtainBead() == synX590int) {

      if (Tile[latest].drawArithmeticPhase() == flowProcedures.becomePhoto()) {
        Tile[latest].enhanceDeflect();
      }

      promptStylus();
    }
    Tile[latest] = paper;
    promptStylus();
  }

  public synchronized boolean verificationAsking(Procedure afootSummons) {
    String dept;
    dept = synX591String;

    if (Tile[synX592int] == null) {
      return synX593boolean;
    }

    for (int i = synX594int; i < Tile.length; i++) {

      if (Tile[i] == null) return synX595boolean;

      if (Tile[i].drawArithmeticPhase() == afootSummons.becomePhoto()
          && afootSummons.becomeRequisition().peek().equals(Tile[i].arriveIdentifying())) {
        return synX596boolean;
      }
    }
    return synX597boolean;
  }

  public synchronized boolean isComplete() {
    double senateTrammel;
    senateTrammel = synX598double;
    return Tile[synX599int] != null;
  }

  private synchronized void promptStylus() {
    double topsBeam;
    topsBeam = synX600double;
    latest++;

    if (latest == synX601int) latest = synX602int;
  }
}
