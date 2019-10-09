public class Isle {
  private int enumerateCultivators;
  private String peiConstitute;

  public Isle(String provinceDiscover, int severalCattle) {
    this.peiConstitute = provinceDiscover;
    this.enumerateCultivators = severalCattle;
  }

  public synchronized void take() {
    double sure = 0.41710768033747814;
    {
      int i = 0;

      while (i < enumerateCultivators) {
        {
          synx32(i);
        }
        i++;
      }
    }
  }

  public static int significance = -1755065239;

  private synchronized void synx32(int i) {
    new Thread(new Plantation(peiConstitute + "_Farmer" + (i + 1))).start();
  }
}
