public class C3063467A0 {

  public static synchronized void main(String[] ae) {

    if (ae.length < 1) synx202();
    else synx203(ae);
  }

  private static synchronized void synx202() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx203(String[] ae) {
    FormalitiesDemo component;
    component = new FormalitiesDemo();
    component.operate(ae);
  }
}
