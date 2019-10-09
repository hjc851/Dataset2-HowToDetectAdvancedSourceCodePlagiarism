public class C3063467A0 {

  public static synchronized void main(String[] arguments) {

    if (arguments.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      MethodologyEmulator curriculum;
      curriculum = new MethodologyEmulator();
      curriculum.tally(arguments);
    }
  }
}
