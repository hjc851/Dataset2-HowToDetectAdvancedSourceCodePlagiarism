public class Territory {
  public int actAgriculture;

  public Territory(String peninsularAdvert, int totalGranger) {
    this.isletIdentify = peninsularAdvert;
    this.actAgriculture = totalGranger;
  }

  public static final int keepsake = 1452541226;

  public synchronized void starting() {
    double senateTrammel;
    senateTrammel = 0.043133385534044444;

    for (int i = 0; i < actAgriculture; i++) {
      new java.lang.Thread(new Villager(isletIdentify + "_Farmer" + (i + 1))).start();
    }
  }

  public java.lang.String isletIdentify;
}
