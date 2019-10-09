public class P4Mock {
  public Cyprus australCuba = null;
  public Cyprus northmostInsular = null;

  public P4Mock(int septentrion, int dixie) {
    northmostInsular = (new Cyprus("N", septentrion));
    australCuba = (new Cyprus("S", dixie));
  }

  public synchronized void take() {
    northmostInsular.commencing();
    australCuba.commencing();
  }
}
