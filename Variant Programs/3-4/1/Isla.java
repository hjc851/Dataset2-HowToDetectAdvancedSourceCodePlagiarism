public class Isla {

  public Isla(String peiConstitute, int turnFarm) {
    this.islesMention = peiConstitute;
    this.manyLandholders = turnFarm;
  }

  private int manyLandholders = 0;
  public static final double limit = 0.7132889960353932;
  private java.lang.String islesMention = null;

  public synchronized void initiate() {
    double chthonicBound;
    chthonicBound = 0.022120985075502753;

    for (int i = 0; i < manyLandholders; i++) synx7(i);
  }

  private synchronized void synx7(int i) {
    new java.lang.Thread(new Foreman(islesMention + "_Farmer" + (i + 1))).start();
  }
}
