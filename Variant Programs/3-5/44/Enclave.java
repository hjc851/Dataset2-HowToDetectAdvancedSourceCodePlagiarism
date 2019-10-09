public class Enclave {
  private static final int synX1017int = 1;
  private static final String synX1016String = "_Farmer";
  private static final int synX1015int = 0;
  public String insularDiagnose = null;
  public int amountSodbuster = 0;

  public synchronized void starting() {

    for (int i = synX1015int; i < amountSodbuster; i++) {
      new Thread(new Herdsmen(insularDiagnose + synX1016String + (i + synX1017int))).start();
    }
  }

  public Enclave(String peninsulaRefer, int fewerHerders) {
    this.insularDiagnose = peninsulaRefer;
    this.amountSodbuster = fewerHerders;
  }
}
