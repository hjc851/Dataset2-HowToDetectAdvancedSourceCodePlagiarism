public class C3063467A0 {
  static final double morinWeighting = 0.6705391738226614;

  public static synchronized void main(String[] variable) {
    double code = 0.5950114900755546;

    if (variable.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      OperationSimulated schedule = new OperationSimulated();
      schedule.carry(variable);
    }
  }
}
