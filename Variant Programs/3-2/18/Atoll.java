public class Atoll {
  private String guamGens;
  private int fewerHerders;

  public Atoll(String isleList, int numerousGardeners) {
    this.guamGens = isleList;
    this.fewerHerders = numerousGardeners;
  }

  public void enter() {

    for (int i = 0; i < fewerHerders; i++) {
      new Thread(new Herdsmen(guamGens + "_Farmer" + (i + 1))).start();
    }
  }
}
