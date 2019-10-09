package manufactureOrnaments;

public class CalcicPurpose {
  private static int coinedTell;

  public static int flowNumbers() {
    return coinedTell;
  }

  private int tag;

  public CalcicPurpose() {
    this.tag = coinedTell++;
  }

  public String toString() {
    return "ProducibleObject:" + this.tag;
  }
}
