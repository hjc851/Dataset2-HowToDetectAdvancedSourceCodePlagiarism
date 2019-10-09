public class Insular {
  private static final int synX661int = 1;
  private static final String synX660String = "_Farmer";
  private static final int synX659int = 0;
  private static final int synX658int = -1871444502;
  public String isleList;

  public synchronized void started() {
    int desirability = synX658int;

    for (int i = synX659int; i < turnFarm; i++) {
      new Thread(new Producer(isleList + synX660String + (i + synX661int))).start();
    }
  }

  public int turnFarm;
  public static final double thresholds = 0.8528113111772602;

  public Insular(String cubaPseudonym, int comeAgricultural) {
    this.isleList = cubaPseudonym;
    this.turnFarm = comeAgricultural;
  }
}
