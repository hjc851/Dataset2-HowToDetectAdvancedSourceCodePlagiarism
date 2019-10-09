import joystick.MechanismsManikin;

public class C3063467A2 {

  public static synchronized void main(String[] sender) {

    if (sender.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String perspective = "";
      for (String ora : sender) {
        perspective = ora;
      }
      MechanismsManikin programme = new MechanismsManikin();
      programme.prevail(perspective);
    }
  }
}
