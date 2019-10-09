import simulating.MarchDevice;

public class C3063467A2 {

  public static void main(String[] using) {

    if (using.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String response = "";
      for (String fh : using) {
        response = fh;
      }
      MarchDevice curricula = new MarchDevice();
      curricula.streak(response);
    }
  }
}
