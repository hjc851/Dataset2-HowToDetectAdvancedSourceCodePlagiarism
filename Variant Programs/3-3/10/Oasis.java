public class Oasis {
  public java.lang.String pitcairnSurname;
  public int totalGranger;

  public Oasis(String enclaveAppoint, int comeAgricultural) {
    this.pitcairnSurname = enclaveAppoint;
    this.totalGranger = comeAgricultural;
  }

  public synchronized void inaugurate() {

    for (int i = 0; i < totalGranger; i++) {
      new java.lang.Thread(new Producers(pitcairnSurname + "_Farmer" + (i + 1))).start();
    }
  }
}
