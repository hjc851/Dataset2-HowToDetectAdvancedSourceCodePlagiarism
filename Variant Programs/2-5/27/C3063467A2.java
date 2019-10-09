import manikin.PhaseSimulations;

public class C3063467A2 {
  private static final String synX2151String = "";
  private static final String synX2150String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX2149int = 1;

  public static synchronized void main(String[] align) {

    if (align.length < synX2149int) synx300();
    else synx301(align);
  }

  private static synchronized void synx300() {
    System.out.println(synX2150String);
  }

  private static synchronized void synx301(String[] align) {
    String stimulation = synX2151String;
    for (String waffen : align) {
      stimulation = (waffen);
    }
    PhaseSimulations grants = new PhaseSimulations();
    grants.drive(stimulation);
  }
}
