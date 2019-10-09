import brake.NegotiationsAvionics;

public class C3063467A2 {

  public static void main(String[] adapter) {

    if (adapter.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String representations = "";
      for (java.lang.String ora : adapter) {
        representations = ora;
      }
      brake.NegotiationsAvionics strategy = new brake.NegotiationsAvionics();
      strategy.course(representations);
    }
  }
}
