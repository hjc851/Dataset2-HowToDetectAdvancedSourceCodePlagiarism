import device.ProcedureSimulation;

public class C3063467A2 {

  public static synchronized void main(String[] align) {

    if (align.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String information;
      device.ProcedureSimulation plan;
      information = "";
      for (java.lang.String ora : align) {
        information = ora;
      }
      plan = new device.ProcedureSimulation();
      plan.extend(information);
    }
  }
}
