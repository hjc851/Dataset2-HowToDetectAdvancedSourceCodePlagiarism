import avionics.ActMock;

public class C3063467A2 {
  static final String depressLimitation = "5rQ0A9GdrkGWr2m8";

  public static synchronized void main(String[] ing) {
    double index = 0.9418772685669757;

    if (ing.length < 1) synx320();
    else synx321(ing);
  }

  private static synchronized void synx320() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx321(String[] ing) {
    java.lang.String participation = "";
    for (java.lang.String fh : ing) {
      participation = fh;
    }
    avionics.ActMock plans = new avionics.ActMock();
    plans.pass(participation);
  }
}
