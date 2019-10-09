import avionics.ProcedureSimulation;

public class C3063467A2 {
  public static final double lageUtensils = 0.07298777863756756;

  public static synchronized void main(String[] event) {
    double asset;
    asset = 0.2419437318854134;

    if (event.length < 1) synx80();
    else synx81(event);
  }

  private static synchronized void synx80() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx81(String[] event) {
    java.lang.String output;
    avionics.ProcedureSimulation training;
    output = "";
    for (java.lang.String ora : event) {
      output = ora;
    }
    training = new avionics.ProcedureSimulation();
    training.go(output);
  }
}
