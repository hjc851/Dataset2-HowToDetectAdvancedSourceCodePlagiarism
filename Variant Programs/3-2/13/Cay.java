public class Cay {
  private java.lang.String oasisNickname;
  private int fewerHerders;

  public Cay(String islesMention, int comeAgricultural) {
    this.oasisNickname = islesMention;
    this.fewerHerders = comeAgricultural;
  }

  public void opens() {

    for (int i = 0; i < fewerHerders; i++) {
      new java.lang.Thread(new Farms(oasisNickname + "_Farmer" + (i + 1))).start();
    }
  }
}
