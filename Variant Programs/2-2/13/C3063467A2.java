import prototype.LitigateMimic;

public class C3063467A2 {

  public static void main(String[] sender) {

    if (sender.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String output = "";
      for (java.lang.String waffen : sender) {
        output = waffen;
      }
      prototype.LitigateMimic broadcast = new prototype.LitigateMimic();
      broadcast.play(output);
    }
  }
}
