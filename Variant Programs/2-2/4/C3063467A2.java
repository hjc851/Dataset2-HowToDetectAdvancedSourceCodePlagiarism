import brake.SueAnalog;

public class C3063467A2 {

  public static void main(String[] ing) {

    if (ing.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String stimulus = "";
      for (java.lang.String ora : ing) {
        stimulus = ora;
      }
      brake.SueAnalog project = new brake.SueAnalog();
      project.pass(stimulus);
    }
  }
}
