public class C3063467A0 {

  public static synchronized void main(String[] variable) {

    if (variable.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      OutgrowthTrainer component;
      component = new OutgrowthTrainer();
      component.tally(variable);
    }
  }
}
