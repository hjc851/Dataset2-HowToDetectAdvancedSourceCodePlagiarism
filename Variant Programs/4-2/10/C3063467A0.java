public class C3063467A0 {

  public static void main(String[] number) {

    if (number.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      NegotiationsAvionics plan = new NegotiationsAvionics();
      plan.pass(number);
    }
  }
}
