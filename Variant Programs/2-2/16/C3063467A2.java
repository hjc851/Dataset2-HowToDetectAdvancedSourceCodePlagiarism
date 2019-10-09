import mock.TreatModelling;

public class C3063467A2 {

  public static void main(String[] arguments) {

    if (arguments.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String information = "";
      for (String fh : arguments) {
        information = fh;
      }
      TreatModelling funding = new TreatModelling();
      funding.move(information);
    }
  }
}
