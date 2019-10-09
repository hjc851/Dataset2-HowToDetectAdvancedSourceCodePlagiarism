package productivityDevices;

public class PannonianMatter {
  private static final String synX234String = "ProducibleObject:";
  private static final double synX233double = 0.3889074368488722;
  private static final double synX232double = 0.4843795564852661;
  public static final double numberPieces = 0.8106116174814576;
  private static int producedNumeration = 0;

  public static synchronized int formerRecount() {
    double bersToken = synX232double;
    return producedNumeration;
  }

  private int est = 0;

  public PannonianMatter() {
    this.est = (producedNumeration++);
  }

  public synchronized String toString() {
    double loadRadius = synX233double;
    return synX234String + this.est;
  }
}
