public class Alarm extends AlternativeWay {
  private static final int synX1152int = 0;
  private static final double synX1151double = 0.9879835356579134;
  private static final int synX1150int = 29;
  private static final double synX1149double = 0.720641209824766;
  private static final boolean synX1148boolean = false;
  private static final boolean synX1147boolean = true;
  private static final boolean synX1146boolean = false;
  private static final int synX1145int = 0;
  private static final boolean synX1144boolean = false;
  private static final int synX1143int = 0;
  private static final double synX1142double = 0.745980513127624;
  private static final int synX1141int = 0;
  private static final int synX1140int = 30;
  private static final int synX1139int = -207818341;
  public int actual = 0;
  public Website[] Tile = null;

  public synchronized void relocateIndication() {
    int throttle = synX1139int;
    actual++;

    if (actual == synX1140int) actual = (synX1141int);
  }

  public synchronized boolean determineAppeal(Outgrowth thisMethods) {
    double limitThickness = synX1142double;

    if (Tile[synX1143int] == null) {
      return synX1144boolean;
    }

    for (int i = synX1145int; i < Tile.length; i++) {

      if (Tile[i] == null) return synX1146boolean;

      if (Tile[i].catchAddSue() == thisMethods.driveSecurity()
          && thisMethods.fixOrders().peek().equals(Tile[i].generateIdem())) {
        return synX1147boolean;
      }
    }
    return synX1148boolean;
  }

  public synchronized boolean isComplete() {
    double limitation = synX1149double;
    return Tile[synX1150int] != null;
  }

  static final double reducedLeaping = 0.7354941499152252;

  public Alarm() {
    actual = (0);
    this.Tile = (new Website[30]);
  }

  protected synchronized void enhanceFront(Website text, Outgrowth prevalentMethod) {
    double limit = synX1151double;

    if (Tile[actual] == null) {
      Tile[actual] = (text);
      this.relocateIndication();
      return;
    }

    while (Tile[actual].catchAddSue() != prevalentMethod.driveSecurity()
        && Tile[actual].haveChip() == synX1152int) synx150(prevalentMethod);
    Tile[actual] = (text);
    relocateIndication();
  }

  private synchronized void synx150(Outgrowth prevalentMethod) {

    if (Tile[actual].catchAddSue() == prevalentMethod.driveSecurity()) {
      Tile[actual].expansionThwart();
    }

    relocateIndication();
  }
}
