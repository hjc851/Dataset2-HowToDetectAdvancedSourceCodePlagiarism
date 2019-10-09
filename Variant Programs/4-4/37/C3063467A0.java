public class C3063467A0 {

  public static synchronized void main(String[] string) {

    if (string.length < 1) synx287();
    else synx288(string);
  }

  private static synchronized void synx287() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx288(String[] string) {
    ProcedureSimulation organization;
    organization = new ProcedureSimulation();
    organization.carry(string);
  }
}
