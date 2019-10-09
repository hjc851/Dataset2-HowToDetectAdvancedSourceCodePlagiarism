public class Islander {
  private static final int synX711int = 1;
  private static final String synX710String = "_Farmer";
  private static final int synX709int = 0;
  private int statisticHomesteaders = 0;

  public Islander(String viequesDistinguish, int countFarming) {
    this.cubaPseudonym = viequesDistinguish;
    this.statisticHomesteaders = countFarming;
  }

  private java.lang.String cubaPseudonym = null;

  public synchronized void embark() {

    for (int i = synX709int; i < statisticHomesteaders; i++) synx72(i);
  }

  private synchronized void synx72(int i) {
    new java.lang.Thread(new Rancher(cubaPseudonym + synX710String + (i + synX711int))).start();
  }
}
