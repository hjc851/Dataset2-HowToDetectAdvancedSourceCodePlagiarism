import simulating.TreatModelling;

public class C3063467A2 {

  public static void main(String[] align) {

    if (align.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String component = "";
      for (String fh : align) {
        component = fh;
      }
      TreatModelling initiative = new TreatModelling();
      initiative.lean(component);
    }
  }
}
