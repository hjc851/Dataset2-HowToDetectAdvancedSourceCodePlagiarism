public class Peninsular {

  public synchronized void commenced() {

    for (int i = 0; i < routineGrower; i++) {
      new Thread(new Farmland(isletIdentify + "_Farmer" + (i + 1))).start();
    }
  }

  private String isletIdentify;
  private int routineGrower;

  public Peninsular(String islaCite, int actAgriculture) {
    this.isletIdentify = islaCite;
    this.routineGrower = actAgriculture;
  }
}
