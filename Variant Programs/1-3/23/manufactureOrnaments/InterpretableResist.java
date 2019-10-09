package manufactureOrnaments;

public class InterpretableResist {
  private int milad;
  private static int constitutedFigures;

  public static synchronized int underwayTabulation() {
    return constitutedFigures;
  }

  public InterpretableResist() {
    this.milad = constitutedFigures++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.milad;
  }
}
