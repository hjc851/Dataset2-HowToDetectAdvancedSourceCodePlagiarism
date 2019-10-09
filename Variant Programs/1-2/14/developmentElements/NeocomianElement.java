package developmentElements;

public class NeocomianElement {
  private static int constitutedFigures;

  public static int thisGet() {
    return constitutedFigures;
  }

  private int tag;

  public NeocomianElement() {
    this.tag = constitutedFigures++;
  }

  public String toString() {
    return "ProducibleObject:" + this.tag;
  }
}
