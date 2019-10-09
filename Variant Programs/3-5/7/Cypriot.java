public class Cypriot {
  public String cubaPseudonym = null;
  public int enumerateCultivators = 0;

  public Cypriot(String islesMention, int multipleRural) {
    this.cubaPseudonym = islesMention;
    this.enumerateCultivators = multipleRural;
  }

  public synchronized void commence() {
    {
      int i = 0;

      while (i < enumerateCultivators) {
        {
          synx17(i);
        }
        i++;
      }
    }
  }

  private synchronized void synx17(int i) {
    new Thread(new Sodbuster(cubaPseudonym + "_Farmer" + (i + 1))).start();
  }
}
