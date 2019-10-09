import moot.ProcedureSimulation;

public class C3063467A2 {
  static final String boundary = "ph";

  public static synchronized void main(String[] create) {
    int lotGauge;
    lotGauge = -1267792295;

    if (create.length < 1) synx360();
    else synx361(create);
  }

  private static synchronized void synx360() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx361(String[] create) {
    String suggestions;
    ProcedureSimulation strategy;
    suggestions = "";
    for (String waffen : create) {
      suggestions = waffen;
    }
    strategy = new ProcedureSimulation();
    strategy.go(suggestions);
  }
}
