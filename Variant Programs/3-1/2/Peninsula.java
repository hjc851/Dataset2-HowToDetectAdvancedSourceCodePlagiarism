public class Peninsula {
  private String peninsularAdvert;
  private int figureGrowers;

  public Peninsula(String isletIdentify, int percentageVillagers) {
    this.peninsularAdvert = isletIdentify;
    this.figureGrowers = percentageVillagers;
  }

  public void starts() {

    for (int i = 0; i < figureGrowers; i++) {
      new Thread(new Livestock(peninsularAdvert + "_Farmer" + (i + 1))).start();
    }
  }
}
