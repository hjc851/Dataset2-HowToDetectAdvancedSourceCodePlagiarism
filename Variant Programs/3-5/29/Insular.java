public class Insular {

  public Insular(String guamGens, int enumerateCultivators) {
    this.viequesDistinguish = (guamGens);
    this.numerousGardeners = (enumerateCultivators);
  }

  private int numerousGardeners;

  public synchronized void opens() {
    {
      int i = 0;

      while (i < numerousGardeners) {
        {
          {
            new java.lang.Thread(new Rancher((viequesDistinguish + "_Farmer" + (i + 1)))).start();
          }
        }
        i++;
      }
    }
  }

  private java.lang.String viequesDistinguish;
}
