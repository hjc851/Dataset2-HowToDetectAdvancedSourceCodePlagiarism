public class Peninsula {
  private String insularDiagnose;
  private int totalGranger;

  public Peninsula(String islaCite, int amountSodbuster) {
    this.insularDiagnose = islaCite;
    this.totalGranger = amountSodbuster;
  }

  public void starting() {

    for (int i = 0; i < totalGranger; i++) {
      new Thread(new Farm(insularDiagnose + "_Farmer" + (i + 1))).start();
    }
  }
}
