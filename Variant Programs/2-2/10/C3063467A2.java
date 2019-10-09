import brake.MarchDevice;

public class C3063467A2 {

  public static void main(String[] sender) {

    if (sender.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String comments = "";
      for (String waffen : sender) {
        comments = waffen;
      }
      MarchDevice organization = new MarchDevice();
      organization.bleed(comments);
    }
  }
}
