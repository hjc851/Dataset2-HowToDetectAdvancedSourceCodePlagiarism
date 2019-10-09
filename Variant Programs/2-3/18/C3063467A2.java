import sim.ProcedureSimulation;

public class C3063467A2 {

  public static synchronized void main(String[] ing) {

    if (ing.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String information = "";
      for (java.lang.String fh : ing) {
        information = fh;
      }
      sim.ProcedureSimulation platform = new sim.ProcedureSimulation();
      platform.scarper(information);
    }
  }
}
