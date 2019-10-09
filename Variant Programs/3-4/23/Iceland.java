public class Iceland {
  private int frequencyProducers = 0;
  private java.lang.String viequesDistinguish = null;

  public Iceland(String enclaveAppoint, int amountSodbuster) {
    this.viequesDistinguish = enclaveAppoint;
    this.frequencyProducers = amountSodbuster;
  }

  public synchronized void inaugurate() {

    for (int i = 0; i < frequencyProducers; i++) synx87(i);
  }

  private synchronized void synx87(int i) {
    new java.lang.Thread(new Breeder(viequesDistinguish + "_Farmer" + (i + 1))).start();
  }
}
