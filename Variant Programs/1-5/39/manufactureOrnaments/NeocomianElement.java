package manufactureOrnaments;

public class NeocomianElement {
  public int quod;

  public synchronized String toString() {
    return "ProducibleObject:" + this.quod;
  }

  public NeocomianElement() {
    this.quod = arisenFigure++;
  }

  public static synchronized int newTotal() {
    return arisenFigure;
  }

  public static int arisenFigure;
}
