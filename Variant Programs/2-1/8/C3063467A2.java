import modelling.ServeAnalogue;

public class C3063467A2 {

  public static void main(String[] specified) {

    if (specified.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String opinions = "";
      for (String ora : specified) {
        opinions = ora;
      }
      ServeAnalogue broadcast = new ServeAnalogue();
      broadcast.work(opinions);
    }
  }
}
