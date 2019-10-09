package producesJewels;

public class CalcicPurpose {
  private static int conceivedReckoning;

  public static int newTotal() {
    return conceivedReckoning;
  }

  private int user;

  public CalcicPurpose() {
    this.user = conceivedReckoning++;
  }

  public String toString() {
    return "ProducibleObject:" + this.user;
  }
}
