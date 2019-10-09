import manikin.MechanismsManikin;

public class C3063467A2 {

  public static synchronized void main(String[] variable) {

    if (variable.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String component = "";
      for (String ora : variable) {
        component = ora;
      }
      MechanismsManikin activities = new MechanismsManikin();
      activities.lead(component);
    }
  }
}
