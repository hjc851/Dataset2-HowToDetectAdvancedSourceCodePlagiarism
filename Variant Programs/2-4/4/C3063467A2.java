import emulator.TreatModelling;

public class C3063467A2 {

  public static synchronized void main(String[] adapter) {

    if (adapter.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String output = "";
      for (String waffen : adapter) {
        output = waffen;
      }
      TreatModelling project = new TreatModelling();
      project.drive(output);
    }
  }
}
