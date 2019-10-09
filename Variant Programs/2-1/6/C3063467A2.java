import manikin.AppendageBrake;

public class C3063467A2 {

  public static void main(String[] ing) {

    if (ing.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String opinions = "";
      for (String fh : ing) {
        opinions = fh;
      }
      AppendageBrake programme = new AppendageBrake();
      programme.melt(opinions);
    }
  }
}
