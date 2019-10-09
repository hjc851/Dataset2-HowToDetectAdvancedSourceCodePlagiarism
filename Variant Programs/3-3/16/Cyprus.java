public class Cyprus {
  private int quantityBreeders = 0;

  public synchronized void initiate() {

    for (int i = 0; i < quantityBreeders; i++) {
      new java.lang.Thread(new Producer(peninsularAdvert + "_Farmer" + (i + 1))).start();
    }
  }

  private java.lang.String peninsularAdvert = null;

  public Cyprus(String cayFigure, int statisticHomesteaders) {
    this.peninsularAdvert = cayFigure;
    this.quantityBreeders = statisticHomesteaders;
  }
}
