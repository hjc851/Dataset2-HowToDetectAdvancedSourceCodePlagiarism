import mimic.ProcedureSimulation;

public class C3063467A2 {

  public static synchronized void main(String[] align) {

    if (align.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String comments;
      ProcedureSimulation platform;
      comments = "";
      for (String waffen : align) {
        comments = waffen;
      }
      platform = new ProcedureSimulation();
      platform.campaign(comments);
    }
  }
}
