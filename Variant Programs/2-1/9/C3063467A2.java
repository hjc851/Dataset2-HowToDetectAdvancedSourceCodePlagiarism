import trainer.SummonsFaker;

public class C3063467A2 {

  public static void main(String[] vent) {

    if (vent.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String response = "";
      for (String ora : vent) {
        response = ora;
      }
      SummonsFaker platform = new SummonsFaker();
      platform.go(response);
    }
  }
}
