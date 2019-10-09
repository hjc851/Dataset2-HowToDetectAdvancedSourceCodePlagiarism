import simulation.ActMock;

public class C3063467A2 {

  public static void main(String[] number) {

    if (number.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String influence = "";
      for (String fh : number) {
        influence = fh;
      }
      ActMock schedule = new ActMock();
      schedule.lean(influence);
    }
  }
}
