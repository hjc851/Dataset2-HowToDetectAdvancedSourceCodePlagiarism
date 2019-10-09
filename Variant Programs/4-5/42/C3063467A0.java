import static java.lang.System.out;

public class C3063467A0 {
  private static final String synX2367String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX2366int = 1;

  public static synchronized void main(String[] sender) {

    if (sender.length < synX2366int) {
      out.println(synX2367String);
    } else {
      CycleJoystick system;
      system = new CycleJoystick();
      system.outpouring(sender);
    }
  }
}
