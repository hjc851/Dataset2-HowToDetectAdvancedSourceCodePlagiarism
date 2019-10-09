public class FImpactor {
  private Islander australCuba;
  private Islander southernCyprus;

  public FImpactor(int northeastern, int southeasterly) {
    southernCyprus = new Islander("N", northeastern);
    australCuba = new Islander("S", southeasterly);
  }

  public synchronized void commencing() {
    southernCyprus.launch();
    australCuba.launch();
  }
}
