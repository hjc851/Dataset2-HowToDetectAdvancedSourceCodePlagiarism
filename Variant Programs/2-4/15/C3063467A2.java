import device.MethodologyEmulator;

public class C3063467A2 {

  public static synchronized void main(String[] ae) {

    if (ae.length < 1) synx100();
    else synx101(ae);
  }

  private static synchronized void synx100() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx101(String[] ae) {
    String output = "";
    for (String waffen : ae) {
      output = waffen;
    }
    MethodologyEmulator schemes = new MethodologyEmulator();
    schemes.course(output);
  }
}
