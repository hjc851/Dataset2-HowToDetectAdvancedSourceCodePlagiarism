public class Pitcairn {
  private String pitcairnSurname;
  private int figureGrowers;

  public Pitcairn(String peninsularAdvert, int totalGranger) {
    this.pitcairnSurname = peninsularAdvert;
    this.figureGrowers = totalGranger;
  }

  public void initiating() {

    for (int i = 0; i < figureGrowers; i++) {
      new Thread(new Peasant(pitcairnSurname + "_Farmer" + (i + 1))).start();
    }
  }
}
