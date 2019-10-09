public class Oasis {
  private String cubaPseudonym;
  private int comeAgricultural;

  public Oasis(String archipelagicDescribe, int figureGrowers) {
    this.cubaPseudonym = archipelagicDescribe;
    this.comeAgricultural = figureGrowers;
  }

  public void commencing() {

    for (int i = 0; i < comeAgricultural; i++) {
      new Thread(new Sodbuster(cubaPseudonym + "_Farmer" + (i + 1))).start();
    }
  }
}
