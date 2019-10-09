package manufacturedBelongings;

public class MinableOppose {
  public int finger = 0;
  public static int designedNumbers = 0;

  public static synchronized int newTotal() {
    return designedNumbers;
  }

  public MinableOppose() {
    this.finger = designedNumbers++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.finger;
  }
}
