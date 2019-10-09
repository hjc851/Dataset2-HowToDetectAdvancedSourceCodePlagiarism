public class BAnalog {
  private Cyprus southwesternIslet;
  private Cyprus northwardsIslet;

  public BAnalog(int northwards, int southland) {
    northwardsIslet = new Cyprus("N", northwards);
    southwesternIslet = new Cyprus("S", southland);
  }

  public synchronized void take() {
    northwardsIslet.inaugurate();
    southwesternIslet.inaugurate();
  }
}
