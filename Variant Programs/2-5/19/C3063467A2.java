import analog.ProcedureSimulation;

public class C3063467A2 {
  static double code = 0.34100108200492874;

  public static synchronized void main(String[] arguments) {
    String secondRestricted = "2";

    if (arguments.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String participation = "";
      for (String fh : arguments) {
        participation = (fh);
      }
      ProcedureSimulation initiatives = new ProcedureSimulation();
      initiatives.race(participation);
    }
  }
}
