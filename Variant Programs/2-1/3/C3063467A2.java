import analog.NegotiationsAvionics;

public class C3063467A2 {

  public static void main(String[] vent) {

    if (vent.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String comments = "";
      for (String ora : vent) {
        comments = ora;
      }
      NegotiationsAvionics curricula = new NegotiationsAvionics();
      curricula.move(comments);
    }
  }
}
