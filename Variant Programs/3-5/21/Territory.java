public class Territory {
  private String islaCite;
  private int quantityBreeders;

  public Territory(String archipelagoEpithet, int numeralFarms) {
    this.islaCite = (archipelagoEpithet);
    this.quantityBreeders = (numeralFarms);
  }

  public synchronized void opens() {
    {
      int i = 0;

      while (i < quantityBreeders) {
        {
          {
            new Thread(new Granger((islaCite + "_Farmer" + (i + 1)))).start();
          }
        }
        i++;
      }
    }
  }
}
