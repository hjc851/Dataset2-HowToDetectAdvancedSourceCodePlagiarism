public class Territory {
  public static final int demarcation = 1648741322;
  public String cypriotForename = null;
  public int numeralFarms = 0;

  public synchronized void resume() {
    int tally;
    tally = -1366727258;
    {
      int i = 0;

      while (i < numeralFarms) {
        {
          {
            new Thread(new Operator(cypriotForename + "_Farmer" + (i + 1))).start();
          }
        }
        i++;
      }
    }
  }

  public Territory(String guamGens, int multipleRural) {
    this.cypriotForename = guamGens;
    this.numeralFarms = multipleRural;
  }
}
