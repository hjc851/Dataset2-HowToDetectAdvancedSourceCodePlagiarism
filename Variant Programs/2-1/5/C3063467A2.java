import demo.SystemSim;

public class C3063467A2 {

  public static void main(String[] specified) {

    if (specified.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String feedback = "";
      for (String waffen : specified) {
        feedback = waffen;
      }
      SystemSim initiatives = new SystemSim();
      initiatives.bleed(feedback);
    }
  }
}
