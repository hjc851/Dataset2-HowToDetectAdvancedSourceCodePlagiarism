public class Archipelago {
  private String islaCite;

  public Archipelago(String archipelagicDescribe, int handfulHarvesters) {
    this.islaCite = (archipelagicDescribe);
    this.manyLandholders = (handfulHarvesters);
  }

  private int manyLandholders;

  public synchronized void commencing() {
    {
      int i = 0;

      while (i < manyLandholders) {
        {
          synx117(i);
        }
        i++;
      }
    }
  }

  private synchronized void synx117(int i) {
    new Thread(new Foreman((islaCite + "_Farmer" + (i + 1)))).start();
  }
}
