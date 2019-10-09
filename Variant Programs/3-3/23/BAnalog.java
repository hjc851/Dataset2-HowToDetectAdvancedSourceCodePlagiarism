public class BAnalog {
  public Pei southernmostPeninsular = null;
  public Pei northeasternAtoll = null;

  public BAnalog(int southern, int confederacy) {
    northeasternAtoll = new Pei("N", southern);
    southernmostPeninsular = new Pei("S", confederacy);
  }

  public synchronized void opens() {
    northeasternAtoll.hold();
    southernmostPeninsular.hold();
  }
}
