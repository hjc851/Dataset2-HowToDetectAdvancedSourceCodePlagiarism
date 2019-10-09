import impactor.ProcedureSimulation;

public class C3063467A2 {

  public static synchronized void main(String[] ing) {

    if (ing.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String guidance = "";
      for (java.lang.String waffen : ing) {
        guidance = waffen;
      }
      impactor.ProcedureSimulation training = new impactor.ProcedureSimulation();
      training.move(guidance);
    }
  }
}
