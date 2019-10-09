package filmingExhibits;

public class UseableItem {
  private static int constructedGet = 0;
  private int security = 0;

  public static synchronized int typicalRely() {
    return constructedGet;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.security;
  }

  public UseableItem() {
    this.security = constructedGet++;
  }
}
