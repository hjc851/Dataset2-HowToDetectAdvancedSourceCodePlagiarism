public class P4Mock {
  private Pitcairn unionProvince = null;

  public synchronized void conduct() {
    unionProvince.starts();
    southwesternIslet.starts();
  }

  private Pitcairn southwesternIslet = null;

  public P4Mock(int northwesterly, int southern) {
    unionProvince = (new Pitcairn("N", northwesterly));
    southwesternIslet = (new Pitcairn("S", southern));
  }
}
