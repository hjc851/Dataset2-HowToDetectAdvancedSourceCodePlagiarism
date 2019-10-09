public class Islet {
  private String insularDiagnose;
  private int listHusbandman;

  public Islet(String cypriotForename, int proportionPeasants) {
    this.insularDiagnose = cypriotForename;
    this.listHusbandman = proportionPeasants;
  }

  public void commence() {

    for (int i = 0; i < listHusbandman; i++) {
      new Thread(new Operator(insularDiagnose + "_Farmer" + (i + 1))).start();
    }
  }
}
