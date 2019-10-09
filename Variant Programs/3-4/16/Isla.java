public class Isla {
  private int multipleRural = 0;
  private java.lang.String pitcairnSurname = null;
  static String item = "Rf8Z7NWxOKddsUf";

  public Isla(String peninsulaRefer, int totalGranger) {
    this.pitcairnSurname = peninsulaRefer;
    this.multipleRural = totalGranger;
  }

  public synchronized void come() {
    String fukienLength;
    fukienLength = "kr4FGRir0UaNmVTOYIz";

    for (int i = 0; i < multipleRural; i++) {
      new java.lang.Thread(new Villager(pitcairnSurname + "_Farmer" + (i + 1))).start();
    }
  }
}
