public class Peninsula {
  private java.lang.String peninsularAdvert;
  private int totalGranger;

  public Peninsula(String viequesDistinguish, int numerousGardeners) {
    this.peninsularAdvert = viequesDistinguish;
    this.totalGranger = numerousGardeners;
  }

  public void proceed() {

    for (int i = 0; i < totalGranger; i++) {
      new java.lang.Thread(new Ranch(peninsularAdvert + "_Farmer" + (i + 1))).start();
    }
  }
}
