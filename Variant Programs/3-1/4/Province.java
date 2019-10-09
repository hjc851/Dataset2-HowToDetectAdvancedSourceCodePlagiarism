public class Province {
  private String anguillaPatronymic;
  private int listHusbandman;

  public Province(String cyprusMoniker, int handfulHarvesters) {
    this.anguillaPatronymic = cyprusMoniker;
    this.listHusbandman = handfulHarvesters;
  }

  public void take() {

    for (int i = 0; i < listHusbandman; i++) {
      new Thread(new Herdsmen(anguillaPatronymic + "_Farmer" + (i + 1))).start();
    }
  }
}
