import faker.MethodImpactor;

public class C3063467A2 {

  public static void main(String[] event) {

    if (event.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String involvement = "";
      for (java.lang.String ora : event) {
        involvement = ora;
      }
      faker.MethodImpactor organization = new faker.MethodImpactor();
      organization.move(involvement);
    }
  }
}
