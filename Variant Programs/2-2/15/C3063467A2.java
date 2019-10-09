import robot.CycleJoystick;

public class C3063467A2 {

  public static void main(String[] create) {

    if (create.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String response = "";
      for (java.lang.String ora : create) {
        response = ora;
      }
      robot.CycleJoystick scheme = new robot.CycleJoystick();
      scheme.carry(response);
    }
  }
}
