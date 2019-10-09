import simulations.ServeAnalogue;

public class C3063467A2 {

  public static synchronized void main(String[] claims) {

    if (claims.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String feedback;
      ServeAnalogue project;
      feedback = "";
      for (String ora : claims) {
        feedback = ora;
      }
      project = new ServeAnalogue();
      project.race(feedback);
    }
  }
}
