public class Vieques {
  private String viequesDistinguish;
  private int fewerHerders;

  public Vieques(String anguillaPatronymic, int countFarming) {
    this.viequesDistinguish = anguillaPatronymic;
    this.fewerHerders = countFarming;
  }

  public void commencing() {

    for (int i = 0; i < fewerHerders; i++) {
      new Thread(new Agricultural(viequesDistinguish + "_Farmer" + (i + 1))).start();
    }
  }
}
