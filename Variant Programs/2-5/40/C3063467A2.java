import simulated.OutgrowthTrainer;

public class C3063467A2 {
  private static final String synX2790String = "";
  private static final String synX2789String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX2788int = 1;

  public static synchronized void main(String[] constructor) {

    if (constructor.length < synX2788int) synx540();
    else synx541(constructor);
  }

  private static synchronized void synx540() {
    System.out.println(synX2789String);
  }

  private static synchronized void synx541(String[] constructor) {
    java.lang.String representations = synX2790String;
    for (java.lang.String fh : constructor) {
      representations = (fh);
    }
    simulated.OutgrowthTrainer strategy = new simulated.OutgrowthTrainer();
    strategy.bleed(representations);
  }
}
