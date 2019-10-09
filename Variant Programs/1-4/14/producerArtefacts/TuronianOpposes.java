package producerArtefacts;

public class TuronianOpposes {
  public static int developedNumber;

  public synchronized String toString() {
    return "ProducibleObject:" + this.photo;
  }

  public int photo;

  public static synchronized int rifeNumeration() {
    return developedNumber;
  }

  public TuronianOpposes() {
    this.photo = developedNumber++;
  }
}
