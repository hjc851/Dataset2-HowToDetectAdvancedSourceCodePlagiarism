import moot.SystemSim;

public class C3063467A2 {

  public static synchronized void main(String[] adapter) {

    if (adapter.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String guidance;
      SystemSim curriculum;
      guidance = "";
      for (String fh : adapter) {
        guidance = fh;
      }
      curriculum = new SystemSim();
      curriculum.melt(guidance);
    }
  }
}
