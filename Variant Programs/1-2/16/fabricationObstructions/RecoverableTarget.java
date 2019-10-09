package fabricationObstructions;

public class RecoverableTarget {
  private static int establishedMatter;

  public static int formerRecount() {
    return establishedMatter;
  }

  private int user;

  public RecoverableTarget() {
    this.user = establishedMatter++;
  }

  public String toString() {
    return "ProducibleObject:" + this.user;
  }
}
