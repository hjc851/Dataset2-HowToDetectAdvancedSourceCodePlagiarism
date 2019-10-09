public class Territory {
  private String islesMention;
  private int routineGrower;

  public Territory(String insularDiagnose, int enumerateCultivators) {
    this.islesMention = insularDiagnose;
    this.routineGrower = enumerateCultivators;
  }

  public void resume() {

    for (int i = 0; i < routineGrower; i++) {
      new Thread(new Operator(islesMention + "_Farmer" + (i + 1))).start();
    }
  }
}
