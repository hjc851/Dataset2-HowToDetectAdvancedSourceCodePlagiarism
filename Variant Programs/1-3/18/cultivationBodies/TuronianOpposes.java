package cultivationBodies;

public class TuronianOpposes {
  public int pictures;
  public static int designedNumbers;

  public static synchronized int contemporaryReckoning() {
    return designedNumbers;
  }

  public TuronianOpposes() {
    this.pictures = designedNumbers++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.pictures;
  }
}
