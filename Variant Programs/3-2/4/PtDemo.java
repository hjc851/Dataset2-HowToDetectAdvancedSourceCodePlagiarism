public class PtDemo {
  private Peninsula sPei;
  private Peninsula northerOasis;

  public PtDemo(int northeasterly, int southmost) {
    northerOasis = new Peninsula("N", northeasterly);
    sPei = new Peninsula("S", southmost);
  }

  public void commencement() {
    northerOasis.starting();
    sPei.starting();
  }
}
