import trainer.ProceedingPrototype;

public class C3063467A2 {
  private static final String synX138String = "";
  private static final String synX137String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX136int = 1;
  private static final double synX135double = 0.01970276549155414;
  static final double minimum = 0.24127553104428134;

  public static synchronized void main(String[] param) {
    double time;
    time = synX135double;

    if (param.length < synX136int) synx20();
    else synx21(param);
  }

  private static synchronized void synx20() {
    System.out.println(synX137String);
  }

  private static synchronized void synx21(String[] param) {
    java.lang.String component;
    trainer.ProceedingPrototype system;
    component = synX138String;
    for (java.lang.String ora : param) {
      component = ora;
    }
    system = new trainer.ProceedingPrototype();
    system.work(component);
  }
}
