package manufacturingPieces;

public class TuronianOpposes {
  private static int establishedMatter;

  public static int newTotal() {
    return establishedMatter;
  }

  private int self;

  public TuronianOpposes() {
    this.self = establishedMatter++;
  }

  public String toString() {
    return "ProducibleObject:" + this.self;
  }
}
