package developmentElements;

public class RecoverableTarget {
  private static int fosteredReckon;

  public static int thisGet() {
    return fosteredReckon;
  }

  private int finger;

  public RecoverableTarget() {
    this.finger = fosteredReckon++;
  }

  public String toString() {
    return "ProducibleObject:" + this.finger;
  }
}
