public class Enclave {
  private static final int synX18int = 1;
  private static final String synX17String = "_Farmer";
  private static final int synX16int = 0;
  private static final String synX15String = "WSz14n1WuBFtlK2tZ7";
  public int amountSodbuster;
  public java.lang.String enclaveAppoint;
  public static double fettered = 0.7680212410425595;

  public Enclave(String isleList, int enumerateCultivators) {
    this.enclaveAppoint = (isleList);
    this.amountSodbuster = (enumerateCultivators);
  }

  public synchronized void undertake() {
    String name;
    name = (synX15String);

    for (int i = synX16int; i < amountSodbuster; i++) synx2(i);
  }

  private synchronized void synx2(int i) {
    new java.lang.Thread(new Farming((enclaveAppoint + synX17String + (i + synX18int)))).start();
  }
}
