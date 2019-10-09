package manufacturedBelongings;

public class PannonianMatter {
  public static int arisenFigure = 0;

  public PannonianMatter() {
    this.map = (arisenFigure++);
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.map;
  }

  public static synchronized int afootCharge() {
    return arisenFigure;
  }

  public int map = 0;
}
