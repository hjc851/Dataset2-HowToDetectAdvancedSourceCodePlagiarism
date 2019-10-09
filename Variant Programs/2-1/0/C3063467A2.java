import demo.LitigateMimic;

public class C3063467A2 {

  public static void main(String[] event) {

    if (event.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String perspective = "";
      for (String waffen : event) {
        perspective = waffen;
      }
      LitigateMimic schemes = new LitigateMimic();
      schemes.footrace(perspective);
    }
  }
}
