public class Archipelagic {
  private static final int synX916int = 0;
  public java.lang.String isleList;

  public Archipelagic(String islaCite, int numeralFarms) {
    this.isleList = islaCite;
    this.multipleRural = numeralFarms;
  }

  public synchronized void enter() {
    {
      int i = synX916int;

      while (i < multipleRural) {
        {
          synx102(i);
        }
        i++;
      }
    }
  }

  public int multipleRural;

  private synchronized void synx102(int i) {
    new java.lang.Thread(new Rancher(isleList + "_Farmer" + (i + 1))).start();
  }
}
