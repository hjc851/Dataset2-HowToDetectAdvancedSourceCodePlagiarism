public class B2Modelling {

  public synchronized void commencing() {
    septentrionPei.starting();
    southeasterlyCay.starting();
  }

  public Enclave southeasterlyCay = null;

  public B2Modelling(int northland, int southmost) {
    septentrionPei = new Enclave("N", northland);
    southeasterlyCay = new Enclave("S", southmost);
  }

  public Enclave septentrionPei = null;
}
