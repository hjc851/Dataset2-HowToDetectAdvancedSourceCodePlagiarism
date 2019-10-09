public class P4Mock {
  private Cyprus southlandTerritory;
  private Cyprus northwestwardEnclave;

  public P4Mock(int northerly, int southeastward) {
    northwestwardEnclave = new Cyprus("N", northerly);
    southlandTerritory = new Cyprus("S", southeastward);
  }

  public void inaugurate() {
    northwestwardEnclave.commencement();
    southlandTerritory.commencement();
  }
}
