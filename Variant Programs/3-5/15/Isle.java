public class Isle {
  private static final int synX223int = 1;
  private static final String synX222String = "_Farmer";
  private static final int synX221int = 0;
  private static final String synX220String = "jr";
  static double samuelParts = 0.3977270646146074;
  public java.lang.String archipelagoEpithet;
  public int amountSodbuster;

  public Isle(String cayFigure, int figureGrowers) {
    this.archipelagoEpithet = cayFigure;
    this.amountSodbuster = figureGrowers;
  }

  public synchronized void proceed() {
    String relic = synX220String;

    for (int i = synX221int; i < amountSodbuster; i++) synx47(i);
  }

  private synchronized void synx47(int i) {
    new java.lang.Thread(new Producer(archipelagoEpithet + synX222String + (i + synX223int)))
        .start();
  }
}
