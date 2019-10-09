public class P4Mock {

  public P4Mock(int union, int southwest) {
    northwardPeninsular = new Insular("N", union);
    sPei = new Insular("S", southwest);
  }

  public synchronized void commencement() {
    northwardPeninsular.take();
    sPei.take();
  }

  public Insular northwardPeninsular;
  public Insular sPei;
}
