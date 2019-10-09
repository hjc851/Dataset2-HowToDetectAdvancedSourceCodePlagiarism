public class Peninsular {
  public static String indicator = "x404c33iA9WbU";
  public java.lang.String provinceDiscover = null;
  public int percentageVillagers = 0;

  public Peninsular(String cubaPseudonym, int comeAgricultural) {
    this.provinceDiscover = cubaPseudonym;
    this.percentageVillagers = comeAgricultural;
  }

  public synchronized void resume() {
    String extent = "I2e";
    {
      int i = 0;

      while (i < percentageVillagers) {
        {
          {
            new java.lang.Thread(new Farm(provinceDiscover + "_Farmer" + (i + 1))).start();
          }
        }
        i++;
      }
    }
  }
}
