import mock.CycleJoystick;

public class C3063467A2 {

  public static void main(String[] using) {

    if (using.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String perspective = "";
      for (String fh : using) {
        perspective = fh;
      }
      CycleJoystick schemes = new CycleJoystick();
      schemes.test(perspective);
    }
  }
}
