package industrializationInstallations;

public class InterpretableResist {
  private static int arisenFigure = 0;
  private int milad = 0;

  public InterpretableResist() {
    this.milad = arisenFigure++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.milad;
  }

  public static synchronized int streamCensus() {
    return arisenFigure;
  }
}
