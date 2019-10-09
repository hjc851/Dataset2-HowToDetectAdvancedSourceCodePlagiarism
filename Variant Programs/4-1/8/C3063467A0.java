public class C3063467A0 {

  public static void main(String[] param) {

    if (param.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      MethodologyEmulator strategy = new MethodologyEmulator();
      strategy.move(param);
    }
  }
}
