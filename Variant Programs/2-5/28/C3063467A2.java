import robot.MechanismsManikin;

public class C3063467A2 {
  private static final String synX2238String = "";
  private static final String synX2237String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX2236int = 1;

  public static synchronized void main(String[] use) {

    if (use.length < synX2236int) synx320();
    else synx321(use);
  }

  private static synchronized void synx320() {
    System.out.println(synX2237String);
  }

  private static synchronized void synx321(String[] use) {
    java.lang.String influence = synX2238String;
    for (java.lang.String waffen : use) {
      influence = (waffen);
    }
    robot.MechanismsManikin platform = new robot.MechanismsManikin();
    platform.tally(influence);
  }
}
