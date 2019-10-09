public class MMockup {
  private Cyprus northwesterlyIsla = null;
  private Cyprus southwesternIslet = null;

  public MMockup(int region, int dixie) {
    northwesterlyIsla = new Cyprus("N", region);
    southwesternIslet = new Cyprus("S", dixie);
  }

  public synchronized void opens() {
    northwesterlyIsla.initiate();
    southwesternIslet.initiate();
  }
}
