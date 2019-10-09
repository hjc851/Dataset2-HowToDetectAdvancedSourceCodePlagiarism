public class Anguilla {
  private String anguillaPatronymic;
  private int severalCattle;

  public Anguilla(String peiConstitute, int handfulHarvesters) {
    this.anguillaPatronymic = peiConstitute;
    this.severalCattle = handfulHarvesters;
  }

  public void take() {

    for (int i = 0; i < severalCattle; i++) {
      new Thread(new Breeder(anguillaPatronymic + "_Farmer" + (i + 1))).start();
    }
  }
}
