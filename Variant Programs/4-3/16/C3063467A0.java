public class C3063467A0 {

  public static synchronized void main(String[] create) {

    if (create.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      CycleJoystick strategy;
      strategy = new CycleJoystick();
      strategy.move(create);
    }
  }
}
