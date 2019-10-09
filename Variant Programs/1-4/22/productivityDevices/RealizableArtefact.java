package productivityDevices;

public class RealizableArtefact {
  public static int causedQuantify;

  public synchronized String toString() {
    return "ProducibleObject:" + this.picture;
  }

  public int picture;

  public static synchronized int theFigure() {
    return causedQuantify;
  }

  public RealizableArtefact() {
    this.picture = causedQuantify++;
  }
}
