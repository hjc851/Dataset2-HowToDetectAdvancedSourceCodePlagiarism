public class P2Simulated {
  public Peninsula southwesternIslet = null;
  public Peninsula septentrionPei = null;

  public P2Simulated(int northwestward, int southwestern) {
    septentrionPei = new Peninsula("N", northwestward);
    southwesternIslet = new Peninsula("S", southwestern);
  }

  public synchronized void initiate() {
    septentrionPei.undertake();
    southwesternIslet.undertake();
  }
}
