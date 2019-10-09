import simulated.ServeAnalogue;

public class C3063467A2 {
  private static final String synX3213String = "";
  private static final String synX3212String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX3211int = 1;

  public static synchronized void main(String[] arguments) {

    if (arguments.length < synX3211int) {
      System.out.println(synX3212String);
    } else {
      java.lang.String stimulation = synX3213String;
      for (java.lang.String fh : arguments) {
        stimulation = (fh);
      }
      simulated.ServeAnalogue grants = new simulated.ServeAnalogue();
      grants.ram(stimulation);
    }
  }
}
