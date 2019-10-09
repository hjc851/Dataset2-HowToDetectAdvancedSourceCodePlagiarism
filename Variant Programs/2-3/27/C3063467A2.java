import sim.PhaseSimulations;

public class C3063467A2 {

  public static synchronized void main(String[] arguments) {

    if (arguments.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String consultation;
      sim.PhaseSimulations grants;
      consultation = "";
      for (java.lang.String waffen : arguments) {
        consultation = waffen;
      }
      grants = new sim.PhaseSimulations();
      grants.test(consultation);
    }
  }
}
