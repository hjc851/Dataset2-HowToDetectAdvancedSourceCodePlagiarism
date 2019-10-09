package factoryRelics;

public class ImmiscibleDisagree {
  public static int fosteredReckon = 0;

  public static synchronized int streamCensus() {
    return fosteredReckon;
  }

  public int peg = 0;

  public ImmiscibleDisagree() {
    this.peg = (fosteredReckon++);
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.peg;
  }
}
